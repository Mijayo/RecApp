<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css">
<title>LOGIN</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicons -->
<link href="img/favicon.png" rel="icon">
<link href="img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,700|Roboto:300,400,700&display=swap"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="vendor/icofont/icofont.min.css" rel="stylesheet">
<link href="vendor/line-awesome/css/line-awesome.min.css"
	rel="stylesheet">
<link href="vendor/aos/aos.css" rel="stylesheet">
<link href="vendor/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">

<!-- Template Main CSS File -->
<link href="style.css" rel="stylesheet">

</head>
<body onload="registro()">


	<header class="site-navbar js-sticky-header site-navbar-target"
		role="banner">

		<div class="container">
			<div class="row align-items-center">

				<div class="col-6 col-lg-2">
					<h1 class="mb-0 site-logo">
						<a href="index.jsp" class="mb-0">RecApp</a>
					</h1>
				</div>



			</div>
		</div>

	</header>
	<main id="main">
	<div class="hero-section">
		<div class="wave">

			<svg width="100%" height="355px" viewBox="0 0 1920 355" version="1.1"
				xmlns="http://www.w3.org/2000/svg"
				xmlns:xlink="http://www.w3.org/1999/xlink">
                        <g id="Page-1" stroke="none" stroke-width="1"
					fill="none" fill-rule="evenodd">
                            <g id="Apple-TV"
					transform="translate(0.000000, -402.000000)" fill="#FFFFFF">
                                <path
					d="M0,439.134243 C175.04074,464.89273 327.944386,477.771974 458.710937,477.771974 C654.860765,477.771974 870.645295,442.632362 1205.9828,410.192501 C1429.54114,388.565926 1667.54687,411.092417 1920,477.771974 L1920,757 L1017.15166,757 L0,757 L0,439.134243 Z"
					id="Path"></path>
                            </g>
                        </g>
                        </svg>

		</div>
	</main>

	<div id="id01" class="modal">
		<span class="close" title="Close Modal"></span>

		<form class="modal-content" action="Login?option=login"
			method="POST">
			<div class="container">
				<p>Rellena los campos</p>

				<label for="email"><b>Email</b></label> <input type="text"
					placeholder="email" name="email" required> <label for="psw"><b>Password</b></label>
				<input type="password" placeholder="password" name="pwd" required>
				<div class="clearfix">
					<button type="submit" class="signupbtn">Login</button>
				</div>
			</div>
		</form>
	</div>







	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/jquery/jquery-migrate.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/easing/easing.min.js"></script>
	<script src="vendor/sticky/sticky.js"></script>
	<script src="vendor/aos/aos.js"></script>
	<script src="vendor/owlcarousel/owl.carousel.min.js"></script>

	<!-- Template Main JS File -->
	<script src="js/main.js"></script>

</body>
</html>