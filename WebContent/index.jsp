<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/custom/site.css" />
		<link href="css/toastr.css" rel="stylesheet"/>
        <script src="js/JQuery/jquery.js" type="text/javascript"></script>
		<script src="js/bootstrap.js" type="text/javascript"></script>
		<script src="js/toastr.js"></script>
		
		<title>ICS114.MVC.STORE</title>
</head>
<body>
		<h1>Welcome to University Merchandise</h1>
		<!--<form action="processcurrencyconversion.html" action="post">-->
		<div class="row-fluid">
		<p>Pick Item: <select class="selectpicker" data-width="auto">
		<optgroup label="Shirts">
			  <option>-</option>
		      <option>University of Santo Tomas</option>
		      <option>University of the Philippines</option>
		      <option>Far Eastern University</option>
		      <option>De La Salle University</option>
		    </optgroup>
		    <optgroup label="Hoodies">
		      <option>-</option>
		      <option>University of Santo Tomas</option>
		      <option>University of the Philippines</option>
		      <option>Far Eastern University</option>
		      <option>De La Salle University</option>
		    <optgroup label="Lanyard">
		      <option>University of Santo Tomas</option>
		      <option>University of the Philippines</option>
		      <option>Far Eastern University</option>
		      <option>De La Salle University</option>
		    </optgroup>
		  </select></p></div>
		<p>Quantity: <input type="text" name="Quantity" required="required"></p>
		<p>Credit Card Number: <input type="text" name="CreditCardNumber" required="required"></p>
		<input type="submit" value="Purchase">
		</form>
</body>
</html>