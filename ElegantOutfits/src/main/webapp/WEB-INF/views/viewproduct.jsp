<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url value="/resources/bootstrap/css" var="a"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href=${a}/style.css/>
<title>Product List</title>
</head>
<body>
<jsp:include page="admin.jsp"></jsp:include><br><br><br><br><br><br><br><br>
<center>
<h1>Product List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th><th>Quantity</th><th>SupplierId</th><th>CategoryId</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="x" items="${list}">   
   <tr>  
   <td>${x.productid}</td>  
   <td><c:out value="${x.productname}"/></td>  
   <td><c:out value="${x.productprice}"/></td>  
   <td><c:out value="${x.productdescription}"/></td>  
  <td><c:out value="${x.quantity }"/></td>
   <td><c:out value="${x.supplierid}"/></td> 
   <td><c:out value="${x.categoryid}"/></td>   
   <td><a href="Admin_editproduct/${x.productid}">Edit</a></td>  
   <td><a href="Admin_deleteproduct/${x.productid}">Delete</a></td>  
   </tr>  
   </c:forEach> 
</table>
<br/>  
   <a href="Admin_product">Add New Product</a>  
   </center>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>