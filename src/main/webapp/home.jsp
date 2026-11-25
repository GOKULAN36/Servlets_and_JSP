
<%@ page language="java" %>

<%
    String username = (String) session.getAttribute("user");

    if(username == null) {
        response.sendRedirect("loginpage.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

    <h2>Welcome <%= username %></h2>

    <button><a href="logout">Logout</a></button>

</body>
</html>
