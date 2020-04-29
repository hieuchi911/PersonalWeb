<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="mainDeco.css">
</head>
<body>
	<div style="background-color: gray; background-size: cover; background-attachment: fixed; height: 100%; width: 100%; position: absolute; z-index: -1;">
		<div style="text-align: center; width: 50%; height: inherit; display: flex; float: left; justify-content: center; align-items: center;">
			<h1 style="color: white; letter-spacing: 3px">| Log in</h1>
		</div>
		<div style="text-align: center; width: 10%; height: inherit; display: flex; float: left; justify-content: center; align-items: center;">
			<form method="post" action="LoginCookie">
				<table style="background-color: rgba(255,255,255,0.5); width: 400px; height: 150px">
					<tr><td colspan="2" style="width: 100px;"><strong>Sorry username or password error !</strong></td></tr>
					<tr>
						<td style="width: 100px">User name:</td>
						<td><input type="text" name="username" size="30" required></td>
					</tr>
					<tr>
						<td style="width: 100px">Password:</td>
						<td><input type="password" name="password" size="30" required></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Sign in"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

</body>
</html>