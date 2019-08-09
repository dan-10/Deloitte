<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "check.jsp">
Username : <input type = "text" name = "username">
Password : <input type = "password" name = "password">
<input type = "submit">
<%
String errormessage = (String)session.getAttribute("errMsg");
if(errormessage == null){
	errormessage = "";
}
	else{ 
		out.println(errormessage);
}
%>

</form>
</body>
</html>