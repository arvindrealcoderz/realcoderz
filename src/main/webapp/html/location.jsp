<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Location Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	integrity="sha512-PgQMlq+nqFLV4ylk1gwUOgm6CtIIXkKwaIHp/PAIWHzig/lKZSEGKEysh0TCVbHJXCLN7WetD8TFecIky75ZfQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="../css/style1.css">

<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

	<div class="container">
		<div class="header">
			<h2>LOCATION FORM</h2>
		</div>

		<form action="location" id="location">

			<div class="form-group mt-4">
				<label class="control-label ">Location Id:: </label>
				<div class="input-group level ">
					<input class="form-control fas fa-exclamation-circle"
						placeholder="Enter your Location id" name="location"
						type="number" id="location" />

				</div>
			</div>



			<div class="form-group mt-4">
				<label class="control-label ">Residence Type:: </label>
				<div class="input-group level form-control ">
						
				<select id="restype" name="restype">
					<option>Choose Options</option>
					<option>Single-Family Home</option>
					<option>Condo</option>
					<option>Townhouse</option>
					<option>Row House</option>
					<option>Duplex</option>
					<option>Apartment</option>
				</select> 

				</div>
			</div>


			<div class="form-group mt-4">
				<label class="control-label ">Address Line-1:: </label>
				<div class="input-group level ">
					<input class="form-control fas fa-exclamation-circle"
						placeholder="Enter your Address Line 1" name="address1"
						type="text" id="address1" />

				</div>
			</div>




	


			<div class="form-control  mt-4" >
				<label>Address Line-2</label> <input type="text" name=""
					id="address2" placeholder="Enter your Address Line 2"
					autocomplete="off"> <i class="fas fa-check-circle"></i>
				<!-- <i
					class="fas fa-exclamation-circle"></i> -->
				<small>Error message</small>
			</div>
                    
			<div class="form-control  mt-4">
				<label>City</label> <input type="text" name="" id="address2"
					placeholder="Enter your City" autocomplete="off"> <i
					class="fas fa-check-circle"></i>
				<!--  <i
					class="fas fa-exclamation-circle"></i> -->
				<small>Error message</small>
			</div>

			<div class="form-control  mt-4 ">
				<label>State</label> <input type="text" name="" id="address2"
					placeholder="Enter your State" autocomplete="off"> <i
					class="fas fa-check-circle"> </i>
				<!-- <i
					class="fas fa-exclamation-circle"></i> -->
				<small>Error message</small>
			</div>

			<div class="form-control  mt-4">
				<label>Zip Code</label> <input type="text" name="" id="address2"
					placeholder="Enter your City" autocomplete="off"> <i
					class="fas fa-check-circle"> </i>
				<!-- <i
					class="fas fa-exclamation-circle"></i> -->
				<small>Error message</small>
			</div>

			<div class="form-control  mt-4">
				<label>Residence User</label> <select>
					<option>Choose Options</option>
					<option>Primary</option>
					<option>Secondary</option>
					<option>Rental Property</option>
				</select> <i class="fas fa-check-circle"></i>
				<!-- <i
					class="fas fa-exclamation-circle"></i> -->
				<small>Error message</small>
			</div>
			<input type="submit" value="Submit" class="btn" name="">

		</form>

	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>