<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
String url = "jdbc:postgresql://localhost:5432/office";
String user = "postgres";
String pswd = "3051";
%>
<% 
Class.forName("org.postgresql.Driver");

Connection c = DriverManager.getConnection(url, user, pswd);
Statement s = c.createStatement();
String sql = "select * from student where stud_id='101'";
ResultSet r=s.executeQuery(sql);
r.next();
String n=r.getString(1);
String i=r.getString(2);

int a=r.getInt(3);

	%>
	<h1><%=n %><h1></h1><br>
	<h1><%=i %><h1></h1><br>
	<h1><%=a %><h1></h1><br>
	


</body>
</html>