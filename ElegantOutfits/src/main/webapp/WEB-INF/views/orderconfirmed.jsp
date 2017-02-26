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
<title>Order Confirmed</title>
<style>
h1.content-title{
    font-size:32px;
    font-weight:300;
    text-align:center;
    margin-top:0;
    margin-bottom:20px;
    font-family: 'Open Sans', sans-serif!important;
}

/*mail list*/

ul.mail-list{
    padding:0;
    margin:0;
    list-style:none;
    margin-top:30px;
}
</style>
</head>
<body>
<c:import url="/header"></c:import>
 <div class="container" style="padding-top: 100px;">
           <div class="content-container clearfix">
               <div class="col-md-12">
                   <h1 class="content-title">Order Confirmed,Product will be delivered shortly!</h1>
                   
                  
                   
                  <%--  <ul class="mail-list">
                       <li>
                            <label name="" class="form-control mail-search" >Your OrderId is: ${orders}</label>
                           
                       </li>
                       <li>
                           <label name="" class="form-control mail-search" >Shipping Address is: ${shipping}</label>
                       </li>
                       <li>
                           <label name="" class="form-control mail-search" >Billing Address is: ${billing}</label>
                       </li>
                      
                   </ul> --%>
                  <!--  <input type="submit" name="_eventId_finalHome" value="Home"> -->
               </div>
           </div>
       </div>
      <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>