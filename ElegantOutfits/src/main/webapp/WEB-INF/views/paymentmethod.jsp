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
<title>Insert title here</title>
</head>
<body>
<c:import url="/header"></c:import>
<div class="container" style="padding-top: 100px;">
	<div class="row-fluid">
      <form class="form-horizontal" action="paymentmethod">
        <fieldset>
          <div id="legend">
            <legend class="">Payment</legend>
          </div>
          
            <input type="radio" name="payment" value="Cash" />Cash<br />
                        <input type="radio" name="payment" value="Check" />Check<br />
                        <div class="form-actions">
					<input type="submit" name=""_eventId_submitPaymentMethod value="Save" class="btn btn-md btn-success">
						<!-- <input type="submit" name="_eventId_cancel" class="btn btn-md btn-danger"> -->
				</div>
          
       </fieldset>
      </form>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>