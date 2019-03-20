<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<h1 class="text-center">Admin Login Page</h1>
		<div class="jumbotron">
			<form action="adminLoginAuth" method="POST">
  				<div class="form-group">
    				<label for="email">Email address:</label>
    				<input type="email" class="form-control" id="emailId" name="emailId" required>
  				</div>
  				<div class="form-group">
    				<label for="pwd">Password:</label>
    				<input type="password" class="form-control" id="password" name="password" required>
  				</div>
  				<div class="checkbox">
    				<label><input type="checkbox"> Remember me</label>
  				</div>
  				<button type="submit" class="btn btn-success">Login</button>
				</form>
		</div>
	</div> 
</body>
</html>