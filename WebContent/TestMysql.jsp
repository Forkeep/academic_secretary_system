<%@page import="com.sun.corba.se.pept.transport.ContactInfo"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="com.mysql.cj.xdevapi.Statement"%>
<%@page import="com.sun.corba.se.pept.transport.Connection"%>
<%@page import="java.net.ConnectException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TestMysql</title>
</head>
<body>


<%
	String driverName = "com.mysql.jdbc.Driver";
	String userName = "root";
	String userPassword = "1124";
	String dbName = "academic_secretary_system";
	String tableName = "student";
	String url = "jdbc:mysql://localhost:3306/"+ dbName;
	Connection con = null;
	Statement s;
	Resultset rs;
	
	try{
		Class.forName(driverName).newInstance();	
	}catch(ClassNotFoundException e)
	{
		System.out.print("Error loading Driver, 不能加载驱动！");
	}
	
	try{
		con = DriverManager.getConnection(url,useName,userPassword);
	}
	catch(SQLException er){
		System.out.print("Error getconnection,不能连接数据库！");
	}
	
	try{
		s = con.createStaement();
		String sql = "SELECT * FROM "+ tableName;
		rs = s.executeQuery(sql);
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getString("student_id")+"</td>");
			out.print("<td>"+rs.getString("student_name")+"</td>");
			out.print("<td>"+rs.getString("gender")+"</td>");
			out.print("<td>"+rs.getString("age")+"</td>");
			out.print("</tr>");
		}
		rs.close();
		s.close();
		con.close();
	}
	catch(SQLException er){
		System.err.println("Error executeQuery, 不能执行查询！");
	}
	
	
%>
</table>
</body>
</html>