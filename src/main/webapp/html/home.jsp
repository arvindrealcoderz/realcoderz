<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap"
	rel="stylesheet">
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
<script src="https://kit.fontawesome.com/a81368914c.js"></script>

<script>
	function madeAjaxCall(){
		var uname = $("#uname").val();
		var password = $("#password").val();
	 $.ajax({
	  type: "post",
	  url:'adminlogin',
	  data:{username : uname ,   password :password },
	  cache:false,
	  success: function(response){
	      $('#somediv').html(response);
	      $('#div2').hide(); 
	  },
	  error: function(){      
	      $('#somediv').html(response);
	      $("#div1").show();
	  }
	 });
	}
	
	</script>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<img class="wave" src="img/wave.png">
	<div class="container">
		<div class="img">
			<img src="img/bg.svg">
		</div>
		<div class="login-content">
			<form action="index.html">
				<img src="img/avatar.svg">
				<h2 class="title">Welcome</h2>
				<div class="input-div one">
					<div class="i ">
						<i class="fas fa-user"></i>
					</div>
					<div class="div">
						<h5>User name</h5>
						<input type="text" class="input" name="uname" id="uname">
					</div>
				</div>
				<div class="input-div pass">
					<div class="i">
						<i class="fas fa-lock"></i>
					</div>
					<div class="div">
						<h5>Password</h5>
						<input type="password" class="input" name="password" id="password">
					</div>
				</div>
				<a href="#">Forgot Password?</a>
				 <input type="button"
					onclick="madeAjaxCall()" class="btn btn-primary"
					value="login" id="somebutton">
					
					
					
					
				<a href="http://localhost:8080/HOME-INSURANCE/html/registration.jsp">reg?</a>
			</form>
		</div>
	</div>

</body>
</html>
