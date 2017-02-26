<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
     <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- All the files that are required -->
<c:url value="/resources/bootstrap/css" var="a"/>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href=${a}/style.css/>
<title>Login Form</title>
</head>
<body style=" margin-top:150px;background-image:url('resources/images/wallpaper2.jpg');background-repeat: no-repeat;background-size:cover;min-height: 100%;position: relative; ">
<%-- <jsp:include page="header.jsp"></jsp:include> --%>
<c:import url="/header"></c:import>
<div class="container" style="float:left">
            <form class="form-horizontal" role="form" action="/ElegantOutfits/isValidUser" method="post"style="float:right">
               <!--  <h2 style="font-size:20px;">Login Form</h2> -->
                <div class="form-group">
                 <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
               <h2 style="font-size:20px;">LOGIN FORM</h2>
                   <!-- <h2 style="padding:-60px;">Admin Login Form</h2> -->
                   </div>
                   
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="text" id="UserName" name="username" placeholder="UserName" class="form-control" autofocus required>
                       <!--  <span class="help-block">Last Name, First Name, eg.: Smith, Harry</span> -->
                    </div>
                </div>

                <div class="form-group">
                 
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="password" id="password" name="password" placeholder="Password" class="form-control" required>
                    </div>
                </div>
                
                <div class="form-group" >
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <button type="submit" class="btn btn-primary btn-block" style="background-color: #FF69B4">LOGIN</button>
                    </div>
                </div>
                 <div class="form-group">
                 
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                       <p>Forgot your Password? <a href="#">click here</a></p>
				<p>New User? <a href="#">Create New Account</a></p>
                    </div>
                </div>
                
           </form>
        </div> <!-- ./container -->
        <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>