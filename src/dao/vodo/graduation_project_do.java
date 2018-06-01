package dao.vodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.vo.graduation_project;

public class graduation_project_do {
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
	public static int insert(graduation_project graduation_project) {
		Connection conn = getConn();
		int i=0;
		String sql = "insert into graduation_project (item_id,project_name,teacher_id,stu_id) values(?,?,?,?)";
		PreparedStatement pstmt;
		
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,graduation_project.getItem_id());
			pstmt.setString(2,graduation_project.getProject_name());
			pstmt.setString(3,graduation_project.getTeacher_id());
			pstmt.setString(4,graduation_project.getStu_id());
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
	
	public static int update(graduation_project graduation_project) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update graduation_project set project_name = ?, teacher_id = ? , stu_id=?  where item_id= ?";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,graduation_project.getProject_name());
			pstmt.setString(2,graduation_project.getTeacher_id());
			pstmt.setString(3,graduation_project.getStu_id());
			pstmt.setString(4,graduation_project.getItem_id());
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
	public static Integer getAll() {
		Connection conn = getConn();
		String sql = "select * from graduation_project";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("==========graduation_project==========");
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
	//查找教师所指导的毕设有哪些
	public static Integer getTeacher(String teacher_id) {

	Connection conn = getConn();
	String sql = "select * from graduation_project where teacher_id = ?";
	PreparedStatement pstmt;
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1, teacher_id);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("==========course==========");
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
	
	public static int delete(String item_id) {
		Connection conn = getConn();
		int i=0;
		PreparedStatement pstmt;
		
		String sql="delete from graduation_project where item_id = ? ";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, item_id);
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

