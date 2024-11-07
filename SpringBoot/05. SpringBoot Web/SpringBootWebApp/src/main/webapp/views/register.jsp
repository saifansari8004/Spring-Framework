<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style>
body {
	background-color: aqua;
	font-family: Arial, sans-serif;
	margin: 0;
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.form-container {
	background-color: #ffffff;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
	width: 350px;
}

.form-container h2 {
	text-align: center;
	color: #333333;
	margin-bottom: 20px;
}

.form-container label {
	display: block;
	font-size: 16px;
	color: #555555;
	margin-bottom: 5px;
}

.form-container input[type="text"], .form-container input[type="email"],
	.form-container input[type="password"], .form-container select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
}

.form-container input[type="radio"] {
	margin-right: 5px;
	margin-left: 10px;
}

.form-container input[type="submit"], .form-container input[type="button"]
	{
	width: 100%;
	padding: 10px;
	margin-top: 10px;
	background-color: #00796b;
	color: #ffffff;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
}

.form-container input[type="submit"]:hover {
	background-color: #004d40;
}

.form-container input[type="button"]:hover {
	background-color: #004d40;
}

.gender-container {
	margin-bottom: 15px;
}

.gender-container label {
	margin-right: 10px;
}
</style>
</head>
<body>

	<div class="form-container">
		<h2>Student Details</h2>
		<c:if test="${not empty successMsg}">
			<center><h4 style="color: green">${successMsg}</h4></center>
		</c:if>

		<c:if test="${not empty errorMsg}">
			<center><h4 style="color: red">${errorMsg}</h4></center>
		</c:if>
		<form action="regForm" method="post">
			<label for="name">Name</label> <input type="text" id="name"
				name="name" placeholder="Enter your name" required> <label
				for="email">Email</label> <input type="email" id="email"
				name="email" placeholder="Enter your email" required> <label
				for="password">Password</label> <input type="password" id="password"
				name="password" placeholder="Enter password" required>


			<div class="gender-container">
				<label for="gender">Gender:</label> <label><input
					type="radio" name="gender" value="Male" required> Male</label> <label><input
					type="radio" name="gender" value="Female"> Female</label>
			</div>

			<label for="city">City:</label> <select id="city" name="city"
				required>
				<option value="">Select your city</option>
				<option value="Mumbai">Mumbai</option>
				<option value="Pune">Pune</option>
				<option value="Raigad">Raigad</option>
				<option value="Beed">Beed</option>
				<option value="Aurangabad">Aurangabad</option>
			</select> <input type="submit" value="Register"> </br> If already
			registered <a href="login"><b>Click Here</b></a> to login.
		</form>
	</div>

</body>
</html>
