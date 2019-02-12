<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<meta charset="UTF-8" name="viewport" content="width=400, initial-scale=1.0, user-scalable=yes">
	<title>Login</title>
	<!-- IMPORT LOGIN CSS -->
	<link rel="stylesheet" href="resources/css/login.css">
	<!-- IMPORT BOOSTRAP -->
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body>

	<div class="vertical-center">
	
	    <div class="container text-center col-lg-4 col-md-8 col-sm-10 col-xs-12">
	        <img src="resources/img/logo-login.png" alt="" height="75" width="75">

			<form action="j_spring_security_check" method="POST" >
			<c:if test="${not empty error}">
				<div class="alert alert-danger" role="alert">
					<span class="glyphicon glyphicon-exclamation-sign"
						aria-hidden="true"></span> <span class="sr-only">Error:</span>
						${error}
				</div>
				</c:if>
				<div class="form-group">
	        		<div class="input-group input-group-md">
	        			<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>  
	        			<input class="form-control" type="text" placeholder="Username"  id="username" name="j_username" maxlength="40">
	        		</div>
	        	</div>
	        	<div class="form-group">
					<div class="input-group input-group-md">
						<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>   
						<input type="password" class="form-control" placeholder="Password"  id="password" name="j_password" maxlength="60">
					</div>
	        	</div>
	        	<button type="submit" class="btn btn-info col-lg-12 col-md-12 col-sm-12 col-xs-12">Login</button>
	        </form>

		</div>

    </div>

</body>
</html>