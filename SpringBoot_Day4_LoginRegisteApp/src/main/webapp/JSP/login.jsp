<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<pre>
<div style="border:solid 5px;color:blue;width:280px;height 200px;padding:20px;margin:auto;padding:6px;text-align:center">
<form action="login">
${message}
<h4 style="color:red">Welcome To Login Registration App</h4>
username:<input type="text" name="username">
password:<input type="text" name="password">
<input type="submit" value="Login">
<a href="registration">Register Here</a>

</form>
</div>
</pre>
</body>
</html>