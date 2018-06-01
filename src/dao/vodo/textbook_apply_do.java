package dao.vodo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.vo.textbook_apply;

public class textbook_apply_do {
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
	public static int insert(textbook_apply textbook_apply) {
		Connection conn = getConn();
		int i=0;
		String sql = "insert into textbook_apply (textbook_id,textbook_name,date_apply,word_num,first_author_id,document_link) values(?,?,?,?,?,?)";
		PreparedStatement pstmt;
		
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,textbook_apply.getTextbook_id());
			pstmt.setString(2,textbook_apply.getTextbook_name());
			pstmt.setDate(3,(Date) textbook_apply.getDate_apply());
			pstmt.setInt(4,textbook_apply.getWord_num());
			pstmt.setString(5, textbook_apply.getFirst_author_id());
			pstmt.setString(6, textbook_apply.getDocument_link());
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
	public static int update(textbook_apply textbook_apply) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update textbook_apply set textbook_name=? , first_author_id = ?, document_link = ? where textbook_id= ?";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,textbook_apply.getTextbook_name());
			pstmt.setString(2,textbook_apply.getFirst_author_id());
			pstmt.setString(3,textbook_apply.getDocument_link());
			pstmt.setString(4,textbook_apply.getTextbook_id());
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
		String sql = "select * from textbook_apply";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("==========textbook_apply==========");
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
	public static Integer getOne(String textbook_id) {

	Connection conn = getConn();
	String sql = "select * from textbook_apply where textbook_id = ?";
	PreparedStatement pstmt;
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1, textbook_id);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("==========textbook_apply==========");
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
	public static int delete(String textbook_id) {
		Connection conn = getConn();
		int i=0;
		PreparedStatement pstmt;
		
		String sql="delete from textbook_apply where textbook_id = ? ";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, textbook_id);
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
