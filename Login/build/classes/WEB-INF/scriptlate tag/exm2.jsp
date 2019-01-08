<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tags</title>
</head>
<body>

<%! int a=3,b=4,c; %><!-- Declarative tag -->
<%c=a+b; %><!-- scriptlate tag -->
<%= c %> <!-- exp tag -->
<% int d=3,e=6,f;
	f=e-d;
	out.println(f); //inbuilt
%>
<%! int show() //not support void bcoz declrv tag
{
	c=a*b;
	return c;
}%>

<%=show()%>
<%-- <%= c %> --%>

</body>
</html>