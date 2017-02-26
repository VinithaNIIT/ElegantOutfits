<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
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
<title>About Us</title>
</head>
<body>
<c:import url="/header"></c:import>
<%-- <jsp:include page="header.jsp"></jsp:include> --%>
<div class="container">
<form action="index.jsp">
<p>
<h2 style="color:pink;" >ABOUT ELEGANT OUTFITS</h2>
</p>
<p>
India is a beautiful assortment of diversity reflected in our Clothing.
We design and develop all of our products and collections out of our 
headquarters in downtown Los Angeles.Our design inspiration is LA itself;
the girls, the city, the energy, the attitude.We are able to produce a garment
from sketch in less than 8 weeks allowing us to deliver the best of what is now in LA.
</p>
<p>
Our operations encompass all parts of the fashion business from design and production,
branding and online marketing, to order fulﬁllment and customer care. By continuously
improving our procedures and processes, Tobi has an opportunity to develop a deeper
connection with our customer, create a better online shopping experience,
 and offer the latest trends at an unparalleled value.


</p>
</form>
</div>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>