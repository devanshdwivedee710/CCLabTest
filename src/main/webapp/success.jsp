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
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires","0");
if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<h2>Get Details</h2>
<form action="Search">

Enter your Employee Id: <input type="text" name="uname"/><br/>

<input type="submit" value="search"/>

</form>
<h2>Insert Salary Details</h2>
<form action="Input" method="post">
        <p>Employee Id</p> 
        <input type="text" name="uname"/>
        <br/>
        <p>Job Role</p> 
        <input type="text" name="job"/>
        <br/>
        <p>Monthly Salary</p> 
        <input type="text" name="salary"/>
        <br/>
        <p>Annual Bonus</p> 
        <input type="text" name="bonus"/>
        <br/><br/><br/>
        <input type="submit"/>
    </form>
</body>
</html>