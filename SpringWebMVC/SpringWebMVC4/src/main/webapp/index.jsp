<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }

        h2 {
            color: #007bff;
            margin-bottom: 20px;
        }

        h3 {
            color: #dc3545;
            margin-bottom: 30px;
        }

        a {
            display: inline-block;
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 5px;
            margin-bottom: 20px;
            font-size: 16px;
        }

        a:hover {
            background-color: #0056b3;
        }

        .links {
            margin-top: 30px;
        }

        .links a {
            margin: 10px 0;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>This is a First Program of Spring-WEBMVC</h2>
        <h3>Welcome to Learn Spring Framework</h3>

        <div class="links">
            <a href="football">Click Here</a> to open Enquiry about Football</br></br>
            <a href="cricket">Click Here</a> to open Enquiry about Cricket</br></br>
            <a href="enquiry">Click Here</a> to Submit Enquiry</br></br>
        </div>
    </div>

</body>
</html>