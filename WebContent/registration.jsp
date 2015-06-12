<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="stylesheets/styles.css">
</head>
<body class ="bg-primary">
	<div class="row marginTop100">
			  <div class="col-md-3"></div> 
			  <div class="col-md-6">
			  	<form ACTION="register" method="post">
				  <div class="form-group">
				    <label for="exampleInputUserName1">Username</label>
				    <input type="text" class="form-control" id="exampleInputUserName1" placeholder="Enter Username" name="userName">
<%-- 				    <% $("#exampleInputEmail1").val(session.getAttribute("email")); %> --%>
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1">Password</label>
				    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
<%-- 				  	<% $("#exampleInputPassword1").val(session.getAttribute("password")); %> --%>
				  </div>
				  <div class="form-group">
				    <label for="exampleGame1">Game</label>
				    <input type="text" class="form-control" id="exampleGame1" placeholder="Type in one game you liked" name="gameField">
<%-- 				  	<% $("#exampleInputPassword1").val(session.getAttribute("password")); %> --%>
				  </div>
				  <button type="submit" class="btn btn-default btn-sm" id="register">Register</button>
				</form>
			  </div>
			  <div class="col-md-3"></div>
			</div>
			
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="javascript/jquery.fullPage.js"></script>
<script type="text/javascript" src="javascript/main.js"></script>
</body>
</html>