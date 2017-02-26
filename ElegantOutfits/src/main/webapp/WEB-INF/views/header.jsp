<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Elegant Outfits</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <c:url value="/resources/bootstrap/css" var="a"/>
  <%--  <c:url value="/resources/css1" var="a"/> --%>
   <c:url value="/resources/images" var="x"/>
  <%--  <link rel="stylesheet" href="${a}/style.css"/> --%>
   
    <link rel="stylesheet" href=${a}/style.css/>
   <script>
	$('#myCarousel').carousel({
		interval: 1000
	})
</script>
</head>
<body>


<!-- <a href="#" class="pull-left"><img src="resources/images/logo_1.jpg" height="80px" width="80px" ></a> -->

<div id="header" >
<nav class="navbar navbar-inverse navbar-fixed-top"> 
  <div class="container-fluid">
    <div class="navbar-header">
     <!--  <a class="navbar-brand" href="#">Elegant Outfits</a> -->
      <a href="#" class="pull-left"><img src="${x}/logo_1.jpg" height="60px" width="80px" ></a> 
    </div>
    <ul class="nav navbar-nav" style="font-family: sans-serif;text-transform: uppercase;">
     <li  ><a href="/ElegantOutfits/Index" class="active" style="color: black;">Home</a></li> 
      <li class="dropdown" >
      
      <a class="dropdown-toggle" data-toggle="dropdown"  href="#" style="color: black;">Product <span class="caret"></span></a>
        <ul class="dropdown-menu" >
         <c:forEach var="category" items="${categorylist}">
          <li><a href="<c:url value='/viewproductdetails/${category.categoryid}'/>">${category.categoryname}</a></li>
          </c:forEach>
          <!-- <li><a href="viewproductdetails" style="color: black;">Western Wear</a></li>
          <li><a href="viewproductdetails" style="color: black;">Sleepwear</a></li> -->
        </ul>
      </li>
      
      
      <li><a href="Aboutus" style="color: black;">About Us</a></li>
       <li><a href="Contactus" style="color: black;">Contact Us</a></li>
            <li><a href="Admin" style="color: black;">Admin</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li>
      <c:if test="${empty username }">
        <a href="Login" style="color: black;"><span class="glyphicon glyphicon-log-in"></span> Login</a>
         <li><a href="Registration" style="color: black;"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      </c:if>
     <c:if test="${not empty username}">
     Hi,<%=session.getAttribute("username")%>
      <a href="/ElegantOutfits/logout1" style="color: black;"><span class="glyphicon glyphicon-log-in"></span> Logout</a>
     </c:if>
      
      </li>
    </ul>

   
  </div>
</nav>
</div>

</body>
</html>