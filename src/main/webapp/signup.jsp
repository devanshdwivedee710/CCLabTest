<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Signup Form</h2><br>
<form action="Signup" method="post">
        <p>Employee ID Number</p> 
        <input type="text" name="uname"/>
        <br/>
        <p>Password</p> 
        <input type="password" name="pass"/>
        <br/>
        <p>First Name</p> 
        <input type="text" name="fstname"/>
        <br/>
        <p>Last Name</p> 
        <input type="text" name="lstname"/>
        <br/>
        <p>Date of Birth</p> 
        <input type="text" name="dob"/>
        <br/>
        <p>Contact Number</p> 
        <input type="text" name="contact"/>
        <br/><br/><br/>
        <input type="submit"/>
    </form>
</body>
</html>