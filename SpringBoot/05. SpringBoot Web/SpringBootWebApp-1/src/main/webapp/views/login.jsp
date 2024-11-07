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
        width: 40%; /* Adjusted width for both buttons */
        padding: 8px;
        margin-top: 10px;
        background-color: #00796b;
        color: #ffffff;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        margin-left:20px;
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
        <form action="profile" method="post">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            
            <input type="submit" value="Login">
            <a href="index.html"><input type="button" value="Back"></a>
            
        </form>
    </div>

</body>
</html>
