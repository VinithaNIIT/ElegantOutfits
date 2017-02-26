<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- All the files that are required -->
<c:url value="/resources/bootstrap/css" var="a"/>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href=${a}/style.css/>
<title>Insert title here</title>
</head>
<body>
	<!-- <footer>
	<div class="footer-bottom">
		<div class="text-center center-block"
			style="background-color: #f65a8c;">
			<div class="container">
			<p class="txt-railway">- Elegant Outfits -</p>

			<p class="pull-left">Copyright © 2016,Created by Vinitha</p>
			<div class="pull-right">
				<a href="https://www.facebook.com"><i id="social-fb"
					class="fa fa-facebook-square fa-3x social"></i></a> <a
					href="https://twitter.com"><i id="social-tw"
					class="fa fa-twitter-square fa-3x social"></i></a> <a
					href="https://plus.google.com"><i id="social-gp"
					class="fa fa-google-plus-square fa-3x social"></i></a>
			</div>
			</div>
		</div>
	</div>
	</footer> -->
	
	<div class="footer " style="background-color:#f65a8c;width:100%;position:absolute;bottom: 0;left:0; ">
<div  style="background-color:#f65a8c;">
          <div class="text-center center-block"> <p> <b>- Elegant Outfits -</b>
           Copyright © 2016,Created by Vinitha
           
                <a href="https://www.facebook.com"><i id="social-fb" class="fa fa-facebook-square fa-3x social" style="float:right;"></i></a>
	            <a href="https://twitter.com"><i id="social-tw" class="fa fa-twitter-square fa-3x social"style="float:right;"></i></a>
	            <a href="https://plus.google.com"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"style="float:right;"></i></a>
	          </p>
	           </div>
</div>
</div>
</body>
</html>