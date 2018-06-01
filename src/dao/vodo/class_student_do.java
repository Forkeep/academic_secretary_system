package dao.vodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.vo.class_student;


public class class_student_do {
	
private static Connection getConn() {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/academic_secretary_system?characterEncoding=utf8&useSSL=true";
	String username = "root";
	String password = "1124";
	Connection conn = null;
	try {
		Class.forName(driver);
		System.out.println("Connecting to a selected database...");
		conn = (Connection) DriverManager.getConnection(url, username, password);
	    System.out.println("Connected database successfully!");
	}catch(ClassNotFoundException e1){
		e1.printStackTrace();
        System.out.println("Connected database NotFound!");
	}catch(SQLException e2){
		e2.printStackTrace();
	}
	return conn;
}

public static int insert(class_student class_student) {
	Connection conn = getConn();
	int i=0;
	String sql = "insert into class_student (class_id,stu_id) values(?,?)";
	PreparedStatement pstmt;
	
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1,class_student.getClass_id());
		pstmt.setString(2,class_student.getStu_id());
		i = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		System.out.println("insert successful!");
	}catch(SQLException e){
		e.printStackTrace();
	}
	 return i;
}
public static int update(class_student class_student) {
	Connection conn = getConn();
	int i = 0;
	String sql = "update class_student set class_id=? where stu_id= ?";
	PreparedStatement pstmt;
	try{
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
	    pstmt.setString(1,class_student.getClass_id());
	    pstmt.setString(2, class_student.getStu_id());
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
	String sql = "select * from class_student";
	PreparedStatement pstmt;
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("=========class_student========");
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
public static int delete(String class_id,String stu_id) {
	Connection conn = getConn();
	int i=0;
	PreparedStatement pstmt;
	
	String sql="delete from class_student where class_id = ? and stu_id =? ";
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1, class_id);
		pstmt.setString(2, stu_id);
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
