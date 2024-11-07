<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<h2 style='color:red'>WELCOME TO MAZE LO PROFILE</h2>
	<h2>Welcome : ${model_user.getName() }</h2>
	<h4>Name : ${model_user.getName()}</h4>
	<h4>Email : ${model_user.getEmail() }</h4>
	<h4>Phone : ${model_user.getPhone() }</h4>
	<h4>City : ${model_user.getCity() }</h4>
	<h4>Batsman : ${model_user.getBatsman() }</h4>
</body>
</html>