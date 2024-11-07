<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .profile-details {
            margin-top: 30px;
        }

        .profile-details label {
            font-weight: bold;
            color: #555;
        }

        .profile-details div {
            margin-bottom: 15px;
        }

        .profile-details span {
            font-size: 16px;
            color: #333;
            padding-left: 10px;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>User Profile</h1>

        <div class="profile-details">
            

            <div>
                <label>Name : ${model_user.getName() }</label>
            </div>

            <div>
                <label>Email: ${model_user.getEmail() }</label>
            </div>

            <div>
                <label>Phone Number: ${model_user.getPhone() }</label>
                <span></span>
            </div>

            <div>
                <label>City : ${model_user.getCity() }</label>
                <span></span>
            </div>
        </div>
    </div>

</body>
</html>
