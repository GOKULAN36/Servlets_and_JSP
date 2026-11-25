<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name=request.getAttribute("name").toString();
	String id=request.getAttribute("id").toString();
	
	out.println("hello mr"+name+" welcome your id is "+id);
	%>

</body>
</html>