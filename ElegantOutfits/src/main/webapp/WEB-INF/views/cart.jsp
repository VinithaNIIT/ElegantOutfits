<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:url value="/resources/images" var="x"/>
<c:url value="/resources/bootstrap/css" var="a"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href=${a}/style.css/>
<title>Cart</title>
<style>
.container{
 padding-top: 100px;
}
.table>tbody>tr>td, .table>tfoot>tr>td{
    vertical-align: middle;
   
}
@media screen and (max-width: 600px) {
    table#cart tbody td .form-control{
		width:20%;
		display: inline !important;
	}
	.actions .btn{
		width:36%;
		margin:1.5em 0;
	}
	
	.actions .btn-info{
		float:left;
	}
	.actions .btn-danger{
		float:right;
	}
	
	table#cart thead { display: none; }
	table#cart tbody td { display: block; padding: .6rem; min-width:320px;}
	table#cart tbody tr td:first-child { background: #333; color: #fff; }
	table#cart tbody td:before {
		content: attr(data-th); font-weight: bold;
		display: inline-block; width: 8rem;
	}
	
	
	
	table#cart tfoot td{display:block; }
	table#cart tfoot td .btn{display:block;}
	
}
</style>
</head>
<body>
<c:import url="/header"></c:import>
<div class="container" >
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody ng-app="myApp" ng-controller="productController">
						<tr ng-repeat="p in products" >
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="${x}/{{p.productid}}.jpg" alt="{{p.productname}}" class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">{{p.productname}}</h4>
										<p>{{p.productdescription}}</p>
									</div>
								</div>
							</td>
							<td data-th="Price" ng-model="price">Rs{{p.price}}</td>
							<td data-th="Quantity" ng-model="quantity">{{p.quantity}}
								<!-- <input type="number" class="form-control text-center" value="1"> -->
							</td>
							<td data-th="Subtotal" class="text-center">{{p.price*p.quantity| currency : 'Rs'}}</td>
							<td class="actions" data-th="">
								<!-- <button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button> -->
								<a href="/ElegantOutfits/removeproduct/{{p.productid}}"><button  class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button></a>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs" >
							<td class="text-center"><strong>Rs. ${g}</strong></td><!-- gtotal() -->
						</tr>
						<tr>
							<td><a href="/ElegantOutfits/Index" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center" ><strong>Rs. ${g}</strong></td>
							<td><a href="/ElegantOutfits/cart_checkout" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
</div>

<script >
var app=angular.module('myApp',[]);
app.controller('productController', ['$scope', function($scope) {
	$scope.products=${p};
	
	/* var price=${price};
	var quantity=${qty};
	  $scope.price =price;
	  $scope.quantity = quantity;

	  $scope.total = function() {
	    return $scope.price * $scope.quantity; */
	  
	/*  $scope.gtotal = function() {
	  var gtotal = 0;
	    for(var i = 0; i < $scope.products.length; i++){
	     gtotal+=$scope.products[i].price*$scope.products[i].quantity;
	    }
	    return gtotal;
	  }  */
	  
}]);  
	  </script>

 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>