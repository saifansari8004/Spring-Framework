<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<style>
        body {
            background-color: #f0e68c;
            font-family: Arial, sans-serif;
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .profile-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 350px;
            text-align: center;
        }

        .profile-container h2 {
            color: #333333;
            font-size: 24px;
        }

        .profile-container p {
            color: #555555;
            font-size: 18px;
            margin: 10px 0;
        }

        .profile-container .label {
            font-weight: bold;
            color: #000000;
        }
        
         .profile-container input[type="button"] {
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
        
        .profile-container input[type="button"]:hover {
            background-color: #004d40;
        }
    </style>
</head>
<body>

    <div class="profile-container">
       <h2 style="color:blue">Welcome ${model_user.getName() }</h2>
       <p><span class="label">User ID : #8840-</span>${model_user.getId()} </p>
	    <p><span class="label">Name :</span>${model_user.getName()} </p>
	    <p><span class="label">Email :</span>${model_user.getEmail()} </p>
	    <p><span class="label">Gender :</span>${model_user.getGender()} </p>
	    <p><span class="label">City :</span>${model_user.getCity()} </p>

	   <a href="logout"><input type="button" value="Logout"></a>
    </div>

</body>
</html>