package dao.vodo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.vo.teach_reserch_apply;

public class teach_reserch_apply_do {
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
	public static int insert(teach_reserch_apply teach_reserch_apply) {
		Connection conn = getConn();
		int i=0;
		String sql = "insert into teach_reserch_apply (item_id,item_name,guide_num,principal_id,date_start,date_end,document_link) values(?,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,teach_reserch_apply.getItem_id());
			pstmt.setString(2,teach_reserch_apply.getItem_name());
			pstmt.setString(3,teach_reserch_apply.getGuide_num());
			pstmt.setString(4,teach_reserch_apply.getPrincipal_id());
			pstmt.setDate(5, (Date) teach_reserch_apply.getDate_start());
			pstmt.setDate(6, (Date) teach_reserch_apply.getDate_end());
			pstmt.setString(7, teach_reserch_apply.getDocument_link());
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
	public static int update(teach_reserch_apply teach_reserch_apply) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update teach_reserch_apply set item_name=? , guide_num = ?, principal_id = ? document_link = ? where item_id= ?";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,teach_reserch_apply.getItem_name());
			pstmt.setString(2,teach_reserch_apply.getGuide_num());
			pstmt.setString(3,teach_reserch_apply.getPrincipal_id());
			pstmt.setString(4, teach_reserch_apply.getDocument_link());
			pstmt.setString(5,teach_reserch_apply.getItem_id());
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
		String sql = "select * from teach_reserch_apply";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("==========teach_reserch_apply==========");
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
	public static Integer getPeopleItem(String principal_id) {
	Connection conn = getConn();
	String sql = "select * from teach_reserch_apply where principal_id = ?";
	PreparedStatement pstmt;
	try {
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(1, principal_id);
		ResultSet rs = pstmt.executeQuery();
		int col = rs.getMetaData().getColumnCount();
		System.out.println("==========teach_reserch_apply==========");
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
		
		String sql="delete from teach_reserch_apply where item_id = ? ";
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
