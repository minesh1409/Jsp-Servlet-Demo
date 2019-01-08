<%@page import="pojo.Pojo"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.dbcon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVCUpdate</title>
</head>
<body>
<% if(request.getAttribute("key")!=null)
{
	System.out.println("Not Null");
}
else
{
	System.out.println("NUll");
}
Pojo pojo = (Pojo)request.getAttribute("key");
if ("a"!=null){}//khali j lakhelu 6%>
 <form action="TblController" method="post">
 <input type="hidden" name="txtid" value="<%= pojo.getId() %>"/> 
 <input type="text" name="txtname" value="<%= pojo.getName()%>"/>
 <input type="submit" value="Update" name="actionButton">
 </form>
 
</body>
</html>