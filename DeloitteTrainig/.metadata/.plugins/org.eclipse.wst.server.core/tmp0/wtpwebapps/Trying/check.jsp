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
String username = request.getParameter("username");
String password = request.getParameter("password");
if(username.equals("tufail") && password.equals("ahmed")){
	response.sendRedirect("success.jsp");
}else{
	session.setAttribute("errMsg", "Incorrect Usename or password");
	response.sendRedirect("validate.jsp");
}
%>
</body>
</html>