<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP 2 SERVLET</title>
</head>
<body>

<div><form action="lgnser" method="post"><ul>
<li style="none"><span class="un"></span>
<input type="text" name="txtusername" required placeholder="User Name Or Email"/>
</li>
<li style="none"><span class="un">
</span>
<input type="password" name="txtpassword" required placeholder="User Password"/>
</li>
<% 	String un=request.getParameter("txtusername"); 
	String pwd=request.getParameter("txtpassword");
	String username="devil", password="angel";
	if(un.equals(username) && pwd.equals(password))
		{
			out.println("<html><body onload=\"alert('Successs')\"></body></html>");
		}
%>
<li style="none"><input type="submit" value="LOGIN"></li>
</ul>

</form>
</div>
</body>
</html>