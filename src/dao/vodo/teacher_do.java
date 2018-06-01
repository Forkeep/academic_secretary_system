package dao.vodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.vo.teacher;

public class teacher_do {
	private static Connection getConn() {
	    String driver = "com.mysql.cj.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/academic_secretary_system?characterEncoding=utf8&useSSL=true";
	    String username = "root";
	    String password = "1124";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        System.out.println("Connecting to a selected database...");
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	        System.out.println("Connected database successfully!");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        System.out.println("Connected database NotFound!");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	public static int insert(teacher teacher) {
		Connection conn = getConn();
		int i=0;
		String sql = "insert into teacher (teacher_id,teacher_name,gender,age,ethnic,telephone,e_mail,department,collage,onboarding_time,job,job_title) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,teacher.getTeacher_id());
			pstmt.setString(2,teacher.getTeacher_name());
			pstmt.setString(3,teacher.getGender());
			pstmt.setInt(4,teacher.getAge());
			pstmt.setString(5,teacher.getEthnic());
			pstmt.setString(6,teacher.getTelephone());
			pstmt.setString(7,teacher.getE_mail());
			pstmt.setString(8,teacher.getDepartment());
			pstmt.setString(9,teacher.getCollege());
			pstmt.setDate(10,teacher.getOnboarding_time());
			pstmt.setString(11,teacher.getJob());
			pstmt.setString(12,teacher.getJob_title());
			i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("insert successful!");
		}catch(SQLException e){
			System.out.println("insert failed!");
			e.printStackTrace();
			
		}
		 return i;
	}
	public static int update(teacher teacher) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update teacher set age=? , telephone = ?, e_mail = ? , department = ? , job = ? , job_title = ? where teacher_id= ?";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
		    pstmt.setInt(1,teacher.getAge());
		    pstmt.setString(2,teacher.getTelephone());
		    pstmt.setString(3,teacher.getE_mail());
		    pstmt.setString(4,teacher.getDepartment());
		    pstmt.setString(5,teacher.getJob());
		    pstmt.setString(6,teacher.getJob_title());
		    pstmt.setString(7,teacher.getTeacher_id());
			i = pstmt.executeUpdate();
			System.out.println("update successful!");
			pstmt.close();
			conn.close();
		}catch (SQLException e) {
			e.getStackTrace();
			System.out.println("update failed!");
			// TODO: handle exception
		}
		return i;

		
	}
	public static Integer getBasicInfo(String teacher_id) {
		Connection conn = getConn();
		String sql = "select teacher_name,gender,age,ethnic,telephone,e_mail from teacher where teacher_id = ?";
		PreparedStatement pstmt;
		try {
			
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, teacher_id);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("==========teacher==========");
			while (rs.next()) {
				for (int i = 1; i <= col; i++) {//i需要从1开始
					
					System.out.print(rs.getString(i)+"\t");
					if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
				}
			}
				System.out.println("");
			}
			System.out.println("============================");
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
			System.out.println("query failed!");
		}
		return null;
	}
	public static Integer getJobInfo(String teacher_id) {

	Connection conn = getConn();
	String sql = "select department,college,onboarding_time,job,job_title  from teacher where teacher_id = ?";
	PreparedStatement pstmt;
	try {
		
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1, teacher_id);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("==========teacher==========");
		while (rs.next()) {
			for (int i = 1; i <= col; i++) {//i需要从1开始
				
				System.out.print(rs.getString(i)+"\t");
				if ((i == 2) && (rs.getString(i).length() < 8)) {
                    System.out.print("\t");
			}
		}
			System.out.println("");
		}
		System.out.println("============================");
	} catch (SQLException e) {
		e.printStackTrace();// TODO: handle exception
		System.out.println("query failed!");
	}
	return null;
}
	public static int delete(String teacher_id) {
		Connection conn = getConn();
		int i=0;
		PreparedStatement pstmt;
		
		String sql="delete from teacher where teacher_id = ? ";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, teacher_id);
			i = pstmt.executeUpdate();
//			System.out.println("resutl: " + i);
			System.out.println("delete successful");
			pstmt.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
			System.out.println("delete failed!");
		}
		return i;
	}

	
}
