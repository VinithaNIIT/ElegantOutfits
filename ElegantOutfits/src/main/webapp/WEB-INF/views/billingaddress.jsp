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
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href=${a}/style.css/>
<title>Billing Address</title>
</head>
<body>
<c:import url="/header"></c:import>
	<div class="container" style="padding-top: 100px;">
		<div class="row">
			<form class="form-horizontal" action="billingaddress">
				<fieldset>
					<!-- Address form -->

					<h2>Billing Address</h2>

					 <!-- full-name input-->
					<!--<div class="control-group">
						<label class="control-label">Full Name</label>
						<div class="controls">
							<input id="full-name" name="full-name" type="text"
								placeholder="full name" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div> -->
					<!-- address-line1 input-->
					<div class="control-group">
						<label class="control-label">Address Line 1</label>
						<div class="controls">
							<input id="address-line1" name="line1" type="text"
								placeholder="address line 1" class="input-xlarge">
							<!-- <p class="help-block">Street address, P.O. box, company name,
								c/o</p> -->
						</div>
					</div>
					<!-- address-line2 input-->
					<div class="control-group">
						<label class="control-label">Address Line 2</label>
						<div class="controls">
							<input id="address-line2" name="line2" type="text"
								placeholder="address line 2" class="input-xlarge">
							<!-- <p class="help-block">Apartment, suite , unit, building,
								floor, etc.</p> -->
						</div>
					</div>
					<!-- city input-->
					<div class="control-group">
						<label class="control-label">City / Town</label>
						<div class="controls">
							<input id="city" name="city" type="text" placeholder="city"
								class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					<!-- state input-->
					<div class="control-group">
						<label class="control-label">State</label>
						<div class="controls">
							<input id="state" name="state" type="text"
								placeholder="state" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					<!-- country select -->
					<div class="control-group">
						<label class="control-label">Country</label>
						<div class="controls">
						
						<input id="country" name="country" type="text"
								placeholder="country" class="input-xlarge">
							<p class="help-block"></p>

						</div>
					</div>
					<!-- postal-code input-->
					<div class="control-group">
						<label class="control-label">Zip / Postal Code</label>
						<div class="controls">
							<input id="postal-code" name="zipcode" type="text"
								placeholder="zip or postal code" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					
				</fieldset>
				<div class="form-actions">
					<input type="submit" name="_eventId_submitBillingAddress" value="Save" class="btn btn-md btn-success">
						<!-- <input type="submit" name="_eventId_cancel" class="btn btn-md btn-danger"> -->
				</div>
			</form>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>