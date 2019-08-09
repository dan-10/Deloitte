<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
  <%@include file = "quote.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int num1,num2,total; %>
<%
num1 = Integer.parseInt(request.getParameter("num1"));
num2 = Integer.parseInt(request.getParameter("num2"));
total = num1 + num2;
//session.setAttribute("total", total);
//request.getRequestDispatcher("result.jsp").forward(request,response);
%>
<jsp:forward page = "result.jsp"></jsp:forward>

</body>
</html>