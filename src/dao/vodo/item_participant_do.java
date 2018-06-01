package dao.vodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.vo.item_participant;

public class item_participant_do {
	
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
	public static int insert(item_participant  item_participant ) {
		Connection conn = getConn();
		int i=0;
		String sql = "insert into item_participant (item_id,parti_id) values(?,?)";
		PreparedStatement pstmt;
		
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,item_participant.getItem_id());
			pstmt.setString(2,item_participant.getParti_id());
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
	public static int update(item_participant item_participant) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update item_participant set parti_id where item_id= ?";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, item_participant.getParti_id());
			pstmt.setString(2,item_participant.getItem_id());
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
		String sql = "select * from item_participant";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("==========item_participant==========");
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
	public static Integer getOneItem(String item_id) {

	Connection conn = getConn();
	String sql = "select * from item_participant where item_id = ?";
	PreparedStatement pstmt;
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1, item_id);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("==========item_participant==========");
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
	public static Integer getOnePeople(String parti_id) {

		Connection conn = getConn();
		String sql = "select * from item_participant where parti_id = ?";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, parti_id);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("==========item_participant==========");
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
	
	public static int deleteItem(String item_id) {
		Connection conn = getConn();
		int i=0;
		PreparedStatement pstmt;
		
		String sql="delete from item_participant where item_id = ? ";
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
	
	public static int deletePeople(String item_id,String parti_id) {
		Connection conn = getConn();
		int i=0;
		PreparedStatement pstmt;
		
		String sql="delete from item_participant where parti_id = ? and item_id = ?";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, parti_id);
			pstmt.setString(2, item_id);
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
