<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="style.css">

<title>Resultado</title>


<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- ICONO DE LA PESTANA DEL NAVEGADOR -->
<link href="img/_miniLogo.png" rel="icon">

<!-- Favicons -->
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

</head>
<body>


	<div class="site-wrap">

		<div class="site-mobile-menu site-navbar-target">
			<div class="site-mobile-menu-header">
				<div class="site-mobile-menu-close mt-3">
					<span class="icofont-close js-menu-toggle"></span>
				</div>
			</div>
			<div class="site-mobile-menu-body"></div>
		</div>

		<main id="viewPort"> <header
			class="site-navbar js-sticky-header site-navbar-target" role="banner">
			<div class="container">
				<div class="row align-items-center">

					<div class="col-6 col-lg-2">
						<h1 class="mb-0 site-logo">
							<a href="indexUsu.jsp" class="mb-0">RecApp</a>
						</h1>
					</div>

					<div class="col-12 col-md-10 d-none d-lg-block">
						<nav class="site-navigation position-relative text-right"
							role="navigation">

							<ul
								class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">

								<li><a href="Login?option=logout" class="registrarse">log
										out</a></li>
								<li><a href="contactoUsu.jsp" class="nav-link">contacto</a></li>
								<li><a href="sobreNosotrosUsu.jsp" class="nav-link">nosotros</a></li>
								<li><a href="GestionAnuncios?option=anuncios"
									class="nav-link">empleo</a></li>

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

		<div class="site-section pb-0">
			<div class="container">
				<div class="row align-items-center ">

					<div class="mr-auto"

						style="max-width: 500px; position: relative; left: 10px; top: -25px;">
						<h1 class="" style="color: white;">
							<span style="font-size: 14px;">El tipo de Eneagrama que
								eres es</span> <br> <b>El ${sessionScope.descTipo.tipo }</b>
						</h1>
						<p class="" style="color: white;">
							<span style="font-size: 14px;">Breve descripcion del tipo</span>
							<br>${sessionScope.descTipo.descripcion }</p>
						<p class="" style="color: white;">
							<span style="font-size: 14px;"><i>Quote</i></span> <br>${sessionScope.descTipo.quote }</p>

					</div>
					<div
						style="padding: 20px 20px 20px 20px; max-width: 450px; position: absolute; left: 720px; top: 220px; background-color: rgba(255, 255, 255); border-radius: 20px;">
						<img src="img/undraw_svg_2.svg" alt="Image" class="img-fluid">
					</div>
				</div>
			</div>
		</div>

		</main>
	</div>

	<!-- Template Main JS File -->
	<script src="js/main.js"></script>

</body>
</html>