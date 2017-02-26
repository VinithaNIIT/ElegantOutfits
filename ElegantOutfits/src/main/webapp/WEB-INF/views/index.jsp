<%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
<title>Elegant Outfits</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <c:url value="/resources/bootstrap/css" var="a"/>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
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
<body >

  
<div id="wrapper" style="min-height: 100%;position: relative;">

 <%-- <jsp:include page="header"></jsp:include> --%>
<%-- <%@ include file="./header.jsp" %> --%>
<c:import url="/header"></c:import>
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
<div class="row">
  <div class="col-md-6" >
  <marquee  width="450px"  direction="up" onmouseover="stop()" onmouseout="start()" scrollamount="2"style="color:black;margin-left: 100px;padding:20px">
  <center>
Online Shopping: convenient, fast and affordable!<br>
Shopping is fun and exhilarating and more so when<br> you can shop 24x7 without leaving the comfort of home.
<br>
Elegant Outfits the hottest online fashion destination of all times!
<br>
'Fashion' is definitely more accessible with Elegant Outfits.
<br>
Avail added online shopping benefits
<br>
You choose your product, order it online,<br> and we deliver it right at your doorstep anywhere in India.<br> You just need to pay for the product.
</center></marquee>
  </div>
  <div class="col-md-6"><video width="400" controls>
  <source src="resources/videos/Women-Ethnic Wear.mp4" type="video/mp4">
</video></div>
</div>


<div class="row" style="text-align: center">
 <div class="col-md-4 " >

 <a href="/ElegantOutfits/viewproductdetails/cat001" title="Indian Wear">
 <%-- <c:forEach var="category" items="${categorylist}">
         <a href="<c:url value='/viewproductdetails/${category.categoryid}'/>" title="Indian Wear"></a>
         </c:forEach> --%>
  <figure >
   <img class="img-responsive fa-3x social" src="resources/images/indian11.jpg" alt="Indian Wear" width="350px" height="80px" style="margin-left:20px" />
   <figcaption >Indian Wear</p></figcaption>
   </figure>
   </a>
   
 </div>
 <div class="col-md-4">
 <a href="/ElegantOutfits/viewproductdetails/cat002" title="Western Wear">
 <figure >
   <img class="img-responsive fa-3x social" src="resources/images/western_1.jpg" alt="Western Wear" width="310px" height="80px" style="margin-left:20px" />
   <figcaption><p>Western Wear</p></figcaption>
   </figure>
   </a>
 </div>

 <div class="col-md-4">
 <a href="/ElegantOutfits/viewproductdetails/cat003" title="SleepWear">
 <figure >
   <img class="img-responsive fa-3x social" src="resources/images/sleepwear_1.jpg" alt="Sleepwear" width="310px" height="80px"  />
   <figcaption><p>SleepWear</p></figcaption>
   </figure>
   </a>
 </div>
 
</div>

 <jsp:include page="footer.jsp"></jsp:include>

 </div>
</body>
</html>
