<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><h1>Registration Page</h1></div>
	<form action="register" method = "post">
	
    <div>
    <label><b>Customername</b></label>
    <input type="text" value="Enter Username" name="uname" ><br>

    <label><b>Password</b></label>
    <input type="password" value="Enter Password" name="password" ><br>
    
    <label><b>Email</b></label>
    <input type="email"  name="email" ><br>
    
    <label><b>PhoneNumber</b></label>
    <input type="text"  name="phoneNum" ><br>

    <input type="submit" value="Login" name = "Login"><br>
    
  </div>
</form>
</body>
</html>
