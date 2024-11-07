<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
    body {
        background-color: #ffebcd; /* Light beige background */
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

    .form-container input[type="email"],
    .form-container input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
    }

    .form-container input[type="submit"],
    .form-container input[type="button"] {
        width: 100%; /* Adjusted width for both buttons */
        padding: 8px;
        margin-top: 10px;
        background-color: #00796b;
        color: #ffffff;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    .form-container input[type="submit"]:hover,
    .form-container input[type="button"]:hover {
        background-color: #004d40;
    }

</style>
</head>
<body>

    <div class="form-container">
        <h2>Login</h2>
        <c:if test:"${not empty errorMsg }">
        	<center><h4 style="color:red">${errorMsg}</h4></center>
        </c:if>
        <form action="loginForm" method="post">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            
            <input type="submit" value="Login">
            </br>
            If you're new user <a href="register"><b>Click Here</b></a> to register.
            
        </form>
    </div>

</body>
</html>
