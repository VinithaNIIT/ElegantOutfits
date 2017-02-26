<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elegant Outfits</title>
  <meta charset="utf-8">
  <c:url value="/resources/bootstrap/css" var="a"/>
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href=${a}/style.css/>
   <!-- <link rel="stylesheet" href="resources/bootstrap/css/cssbootstrap.css"/> -->
   <script>
	$('#myCarousel').carousel({
		interval: 1000
	})
</script>
</head>
<body>
<div id="header" >
<nav class="navbar navbar-inverse navbar-fixed-top"> 
  <div class="container-fluid">
    <div class="navbar-header">
     <!--  <a class="navbar-brand" href="#">Elegant Outfits</a> -->
      <a href="#" class="pull-left"><img src="resources/images/logo_1.jpg" height="60px" width="80px" ></a> 
    </div>
    <ul class="nav navbar-nav" style="font-family: sans-serif;text-transform: uppercase;">
     <li  ><a href="Admin" class="active" style="color: black;">Home</a></li> 
        <li><a href="Admin_Supplierfront" style="color: black;">Supplier</a></li>
         <li><a href="Admin_categoryfront" style="color: black;">Category</a></li>
          <li><a href="Admin_productfront" style="color: black;">Product</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
           <li><a href="logout" style="color: black;"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
</div>
<div id="wrapper" style="min-height: 100%;position: relative;">


<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/ethnic_banner1.jpg" alt="IndianWear" width="100%" height="700px">
      </div>

      <div class="item">
        <img src="resources/images/western_banner1.jpg" alt="WesternWear" width="100%" height="250px">
      </div>
    
      <div class="item">
        <img src="resources/images/sleepwear_banner.jpg" alt="Sleepwear" width="100%" height="250px">
      </div>

      <div class="item">
        <img src="resources/images/indian_banner1.jpg" alt="IndianWear" width="100%" height="250px">
      </div>
      <div class="item">
        <img src="resources/images/western_banner.jpg" alt="WesternWear" width="100%" height="250px">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>