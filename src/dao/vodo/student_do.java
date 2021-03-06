package dao.vodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.vo.student;


public class student_do {
	
	
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
public static int insert(student student) {
//	DatabaseConnection connection = null;
//	Connection conn = connection.getConn();
	Connection conn = getConn();
	int i=0;
	String sql = "insert into student (student_id,student_name,gender,age) values(?,?,?,?)";
	PreparedStatement pstmt;
	
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1,student.getStudent_id());
		pstmt.setString(2,student.getStudent_name());
		pstmt.setString(3,student.getGender());
		pstmt.setInt(4,student.getAge());
		i = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		System.out.println("insert successful!");
	}catch(SQLException e){
		e.printStackTrace();
	}
	 return i;
}	
public static int update(student student) {
//	DatabaseConnection connection = null;
//	Connection conn = connection.getConn();
	Connection conn = getConn();
	int i = 0;
//    String sql = "update student set age= " + student.getAge() + "where student_id= '" + student.getStudent_id() + "'";
	String sql = "update student set age=? where student_id= ?";
//	String sql = "update student set age= 22 where student_id = '11111'" ;
	PreparedStatement pstmt;
	try{
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
	    pstmt.setInt(1,student.getAge());
	    pstmt.setString(2, student.getStudent_id());
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
//	DatabaseConnection connection = null;
//	Connection conn = connection.getConn();
	Connection conn = getConn();
	String sql = "select * from student";
	PreparedStatement pstmt;
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("===========student==========");
		while (rs.next()) {
			for (int i = 1; i <= col; i++) {//i需要从1开始
				
				System.out.print(rs.getString(i)+"\t");
//				if ((i == 2) && (rs.getString(i).length() < 8)) {
//                    System.out.print("\t");
//			}
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
public static int delete(String student_id) {
//	DatabaseConnection connection = null;
//	Connection conn = connection.getConn();
	Connection conn = getConn();
	int i=0;
	PreparedStatement pstmt;
	
	String sql="delete from student where student_id = '" + student_id +"'";
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		i = pstmt.executeUpdate();
//		System.out.println("resutl: " + i);
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



