<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:url value="/resources/images" var="x"/>
<%-- <c:url value="/resources/css1" var="y"/> --%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- All the files that are required -->
<c:url value="/resources/bootstrap/css" var="a"/>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<link 
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
 rel="stylesheet"
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" 
 crossorigin="anonymous">
 <script 
     src="https://code.jquery.com/jquery-2.2.2.min.js" 
     integrity="sha256-36cp2Co+/62rEAAYHLmRCPIych47CvdM+uTBJwSzWjI=" 
     crossorigin="anonymous"></script>
 <script 
     src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
     integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" 
     crossorigin="anonymous"></script>
 <link rel="stylesheet" href=${a}/style.css/>
<title>Insert title here</title>
<style type="text/css">
.add-to-cart .btn-qty {
  width: 52px;
  height: 46px;
}
.add-to-cart .btn { border-radius: 0; }
.container{
	max-width: 1140px;
	margin: 0 auto;
	/* margin-top:100px; */
	padding-top: 100px;
	}
	.monospaced{
	color: #74DF00;
	font-size: 20px;
	margin-top: 10px;
	}
</style>
</head>
<body>
<div>
<c:import url="/header"></c:import>
 
</div>
<%-- <div class="container">
<div>ProductId:${p.productid} </div>
<div>ProductName:${p.productname }</div>
<div>Product Price:${p.productprice }</div>
<div>Product Description:${p.productdescription }</div>
<div>Quantity:${p.quantity}</div>
<div><img src="${x}/${p.productid}.jpg" alt="${p.productname}" width="120px" height="80px"/></div>



</div> --%>

<div class="container" id="product-section">
  <div class="row">
   <div class="col-md-6">
   <img src="${x}/${p.productid}.jpg" alt="${p.productname}" width="500px" height="450px" class="image-responsive"/>
   </div>
   <div class="col-md-6">
   <div class="row">
  <div class="col-md-12">
   <h1>${p.productname}</h1>
 </div>
</div><!-- end row-->
<div class="row">
 <div class="col-md-12">
  <p class="description">
  ${p.productdescription} </p>
 </div>
</div><!-- end row -->

<div class="row">
 <div class="col-md-12 bottom-rule">
  <h2 class="product-price">Rs${p.productprice }</h2>
 </div>
</div><!-- end row -->
<div class="row">
 <div class="col-md-12 bottom-rule">
  <h2 class="product-stock">Quantity:${p.quantity }</h2>
 </div>
</div><!-- end row -->

<form action="<c:url value='/cart/${p.productid}'/>">
<div class="row add-to-cart">
 <div class="col-md-5 product-qty">
 
 <input type="button" class="btn btn-default btn-lg btn-qty" aria-hidden="true" onclick="inc()">
  <!-- <span class="btn btn-default btn-lg btn-qty">
   <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
  </span> -->
  <script> function inc(){
	  var q=document.getElementById("qty").value;
	 ++q;
	  document.getElementById("qty").value=q;
  }</script>
 
  <input type="text" id="qty" name="qty" class="btn btn-default btn-lg btn-qty" value="1" />
  <input type="button" class="btn btn-default btn-lg btn-qty" aria-hidden="true" onclick="dec()">
  
   <!-- <button onclick="dec()">
  <span class="btn btn-default btn-lg btn-qty">
   <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
  </span></button> --> 
  
  <script> function dec(){
	  var q=document.getElementById("qty").value;
	 --q;
	  document.getElementById("qty").value=q;
  }</script>
  
 </div>

<%--  <form action="<c:url value='/cart/${p.productid}'/>"> --%>
<div class="btn-group cart">

<%-- <a href="<c:url value='/cart/${p.productid}'/>"> --%>
<input type="submit" id="btncart" class="btn btn-success" value="Add to cart" disabled ></input>
<!-- </a> -->
</div>

</div><!-- end row -->

</form>
<div class="row">
 <br>
 <div class="col-md-4 text-center">
<button onclick="fun1()" class="btn btn-success">Check Quantity</button>
<label id="demo"></label>
<script>function fun1()
  {
  var a;
  var val1=Number(document.getElementById("qty").value);
  var tval=${p.quantity};
 if(isNaN(val1))
	 {
	 a="Out Of Stock";
	 document.getElementById("btncart").disabled = true;
	 }
 else if(tval<val1)
	  {
	  a="Out Of Stock";
	  document.getElementById("btncart").disabled = true;
	 
	  }
 else if(tval>=val1)
	 {
	 a="In Stock";
	 document.getElementById("btncart").disabled = false;
	 }
  document.getElementById("demo").innerHTML = a;
  }
  </script>

 </div>
 
</div><!-- end row -->
<div class="row">
 <div class="col-md-12 bottom-rule top-10"></div>
</div><!-- end row -->
   </div>
  </div><!-- end row -->
 </div><!-- end container -->
<!--  </form> -->
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>