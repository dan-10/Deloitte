<!-- 
author: Aakash171997
created: 7/8/2019
project: BookFlix
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book </title>
</head>
<body bgcolor="#ffffff" text="#aaad78">
		<div id="header">
			<font face="Arial">
			<h1>BOOKFLIX</h1>
			</font>
				<hr/>
				
				
				</div>
				<div id="form"><center>
				<c:url var="addAction" value="/api/addBook"></c:url>
					<f:form action = "${addAction}" modelAttribute="book">
					<table border="5" width="50%">
					
					<tr>
					<td>Book Name:</td>
					<td><f:input path="bookName" name="bookName"/></td>
					</tr>
					
					<tr>
					<td>Author:</td>
					<td><f:input path="authors" name="authors"/></td>
					</tr>
					<tr>
					<td>ISBN:</td>
					<td><f:input path="isbn" name="isbn"/></td>
					</tr>
					<tr>
					<td>Description:</td>
					<td><f:input path="description" name="description"/></td>
					</tr><button type ="submit" value = "Add Book">Add Book</button>
					
					
					
					
				</table>
				</f:form>
		</center></div>
				
</body>
</html>