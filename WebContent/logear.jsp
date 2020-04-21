<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Login</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicons -->
<link href="img/_miniLogo.png" rel="icon">
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

	<main id="viewPort"> 
	
		<header class="site-navbar js-sticky-header site-navbar-target" role="banner">
			<div class="container">
				<div class="row align-items-center">
	
					<div class="col-6 col-lg-2">
						<h1 class="mb-0 site-logo">
<<<<<<< HEAD
							<a href="index.jsp" class="mb-0">RecApp</a>
=======

							<a href="index.jsp" class="mb-0">RecApp</a>

>>>>>>> branch '_testUpdated' of https://github.com/Mijayo/RecApp.git
						</h1>
					</div>
					
					<div class="col-12 col-md-10 d-none d-lg-block">
						<nav class="site-navigation position-relative text-right"
							role="navigation">

							<ul
								class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
								<!-- <li><a href="#" class="nav-link">Regístrate</a></li> -->
								<li><a href="" class="registrarse"></a></li>
								<li><a href="" class="nav-link"></a></li>
								<li><a href="" class="nav-link"></a></li>
								<li><a href="" class="nav-link"></a></li>
							</ul>
						</nav>
					</div>

					<div class="col-6 d-inline-block d-lg-none ml-md-0 py-3"
						style="position: relative; top: 3px;">

						<a href="#" class="burger site-menu-toggle js-menu-toggle"
							data-toggle="collapse" data-target="#main-navbar"> <span></span>
						</a>
					</div>
					
				</div>
			</div>
		</header>
	
	
		<div id="id01" class="modal">
			<span class="close" title="Close Modal"></span>

			<form class="modal-content" action="Login?option=validar" method="POST">

				<div class="container">
					<p>Rellena los campos</p>
	
					<label for="email"><b>Email</b></label> <input type="text"
						placeholder="email" name="email" required> <label for="psw"><b>Password</b></label>
					<input type="password" placeholder="password" name="pwd" required>
				
					<div class="clearfix">

					
						<button type="submit" class="signupbtn btn-primary">login</button>
					<%if(request.getAttribute("estado") != null){ %>
					<p class= "mt-2 p-3 text-danger text-white float-left"><%=request.getAttribute("estado")%></p>
					<%}%>

					</div>
				</div>
			</form>
			
		</div>

	</main>









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