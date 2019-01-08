<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.dbcon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC</title>
</head>
<body>
<table border="1" bgcolor="lightblue">
<caption>MVC DEMO </caption>
<tr><td colspan="3">Click here to Add Record&nbsp;<input type="button" value="Add"></td></tr>
<tr><th>ID</th><th>NAME</th><th>ACTION</th></tr>

<%
dbcon dbc=dbcon.getinstance();
dbc.openconnection();
String list="select * from tbl";
ResultSet resultSet=dbc.executequery(list);
while(resultSet.next())
{
%>
 
 <tr><td><%=resultSet.getInt(1) %></td><td><%=resultSet.getString(2) %></td><td>
<!--  <a href="">EDIT</a> &nbsp;   -->
 <form action="TblController" method="post">
 <input type="hidden" value="<%=resultSet.getInt(1) %>" name="id"/> 
<%--  <input type="hidden" value="<%=resultSet.getInt(2) %>" name="name"/>  error 500 ronak --%>
<!--   <input type="submit" value="Insert" name="actionButton"> -->
  <input type="submit" value="Edit" name="actionButton">
 <input type="submit" value="Delete" name="actionButton">
<%--  <input type="text" name="Name" value="<%= resultSet.getString(2) %>"/> --%>
 </form>
 </td></tr>

<%
}
dbc.connectionclose();
%>

</table>
</body>
</html>