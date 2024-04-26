<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
form{border:2px solid grey;
margin:auto;
text-align:center;
width:500px;
}

</style>
<body>
<pre>
<form action="update">
<h2>Edit Your Form Here</h2>
<input type="hidden" name="rollno" value="${stu.rollno}">
Name    :<Input type="text" name="name" value="${stu.name}">
<br>
username:<input type="text" name="username" value="${stu.username}">
<br>
password:<input type="text" name="password" value="${stu.password}">
<br>
<input type="submit" value="Edit">
</form>
</pre>

</body>
</html>