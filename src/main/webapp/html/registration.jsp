<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewpoint" content="width=device-width",initial-scale=1.0">
	<title></title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" integrity="sha512-PgQMlq+nqFLV4ylk1gwUOgm6CtIIXkKwaIHp/PAIWHzig/lKZSEGKEysh0TCVbHJXCLN7WetD8TFecIky75ZfQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<link rel="stylesheet" href="../css/style1.css">
	<script type="text/javascript" src="../js/jquery-latest.min.js"></script>
	<script type="text/javascript" src="../js/jquery.validate.js"></script>
	<!-- <script type="text/javascript" src="../js/reg.js"></script> -->
	<script type="text/javascript" src="../js/registration.js"></script>
	<script type="text/javascript" src="../js/saveData.js"></script>
</head>
<body>
	<div class="container">
	<div class="header">
		<h2>REGISTRATION FORM</h2>
	</div>
	<form class="form" id="form">
		<div class="form-control  mt-4">
			<label>Username</label>
			<input class="form-control col-sm-8 "
						placeholder="Enter your name " name="uname" type="text" id="uname" />
			<i class="fas fa-check-circle"></i>
			<i class="fas fa-exclamation-circle"></i>
			
		</div>

		<div class="form-control  mt-4">
			<label>Role</label><br>
			<select id="role">
				<option>User</option>
				<option>Admin</option>
			</select>
			<i class="fas fa-check-circle"></i>
			<i class="fas fa-exclamation-circle"></i>
			
		</div>

		
		<div class="form-control">
			<label>Password</label>
			<input class="form-control col-sm-8"
						placeholder="Enter your password" name="password" type="password"
						id="password" />
			<i class="fas fa-check-circle"></i>
			<i class="fas fa-exclamation-circle"></i>
			
		</div>
		<div class="form-control">
			<label>Confirm Password</label>
			<input class="form-control col-sm-8"
						placeholder="Enter conform  your password" name="conformpassword"
						type="password" id="conformpassword" />

			<i class="fas fa-check-circle"></i>
			<i class="fas fa-exclamation-circle"></i>
			
		</div>
		<input type="submit" value="Submit" class="btn" onclick="madeAjaxCall()">
	</form>
</div>
</body>

</html>

