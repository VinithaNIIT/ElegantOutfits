<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url value="/resources/bootstrap/css" var="a"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href=${a}/style.css"/>
<title>Insert title here</title>
<!--  <script>
	$('#myCarousel').carousel({
		interval: 1000
	})
</script> -->


</head>
<body>
<!-- <div id="wrapper" style="min-height: 100%;position: relative;"> -->
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
           <li> <a href="logout" style="color: black;"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
</div>




  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>