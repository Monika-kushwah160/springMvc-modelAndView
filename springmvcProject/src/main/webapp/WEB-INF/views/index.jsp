<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
  <h1>This is my page</h1>
  <h1>Hello everyone</h1>
  <% 
    String name = (String)request.getAttribute("name");
    Integer fid = (Integer)request.getAttribute("id");
   
    
  %>
  <h2>My Name is <%=name%></h2>
  <h2>Id is <%=fid%></h2>
 
</body>
</html>