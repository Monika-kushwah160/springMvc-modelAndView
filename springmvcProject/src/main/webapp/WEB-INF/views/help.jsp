<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name = (String)request.getAttribute("name");
Integer rollnumber = (Integer)request.getAttribute("id");

%>
<h1>this is help page ,you can come here</h1>
<h1>my name is <%=name %></h1>
<h1>rollnumber is <%=rollnumber %></h1>
</body>
</html>