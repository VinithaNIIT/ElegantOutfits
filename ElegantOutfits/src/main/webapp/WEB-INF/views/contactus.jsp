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
<title>Contact Us</title>
</head>
<body >
<%-- <jsp:include page="header.jsp"></jsp:include> --%>
<c:import url="/header"></c:import>
<jsp:include page="footer.jsp"></jsp:include>


<div class="container"   >

    <div >
        <div class="row">
            <div class="col-md-12">
            <h1 style="font-size:30px;text-align: center; text-decoration: underline; color:black;font:bold;">Contact Us</h1>
                <div class="row">
                
                    <div class="col-md-4">
                  
                        <h1  style="font-size:20px; color:black;font:bold;">
                            Sector 32, Institutional Area, Gurgaon, Haryana 122001, India</h1>
                    </div>
                    <div class="col-md-4 ">
                        <h2  style="font-size:20px; color:black;font:bold;">
                            Corporate: info@elegantoutfits.com
						Careers: careers@elegantoutfits.com</h2>
						</div>
						<div class="col-md-4">
                        <h3 style="font-size:20px; color:black;font:bold;">
                            Toll-free number: 1800 102 6448 85</h3>
                    </div>
                   
                </div>
            </div>
        </div>
    </div>
   
</div>





</body>
</html>