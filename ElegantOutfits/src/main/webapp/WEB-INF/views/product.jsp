<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ page isELIgnored="false" %>
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
<title>Add Product</title>
</head>
<body>
<jsp:include page="admin.jsp"></jsp:include><br><br><br><br><br><br><br><br>
<center>
<div style="color: black; font-size: 30px">Enter Product Details</div>
<form:form action="Admin_productdetails" method="post" commandName="command" enctype="multipart/form-data">
<table width="400px" height="150px">

<tr>
<td>Id:</td>
<td><form:input path="productid" required="required"/></td>
</tr>
<tr>
<td>Name:</td>
<td><form:input path="productname" required="required"/></td>
</tr>
<tr>
<td>Price:</td>
<td><form:input path="productprice" required="required"/></td>
</tr>
<tr>
<td>Description:</td>
<td><form:input path="productdescription" required="required"/></td>
</tr>
<tr>
<td>Quantity:</td>
<td><form:input path="quantity" required="required"/></td>
</tr>
<tr>
<td>SupplierId:</td>
 <td>

<form:select  path="supplierid" >
  
     <form:option value="None" label="---Select----" />
     <form:options items="${supplierlist}" />
 
</form:select>

</td>

</tr>
<tr>
<td>CategoryId:</td>
<td>


<form:select path="categoryid" >
   
     <form:option value="None" label="---Select----" />
     <form:options items="${categorylist}" />
  
</form:select>

</td>

</tr>
<tr>
<td>File to Upload:</td>
<td><form:input type="file" path="file"/></td>
</tr>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>
</table>

</form:form><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>


</center>
 <jsp:include page="footer.jsp"></jsp:include>


</body>
</html>