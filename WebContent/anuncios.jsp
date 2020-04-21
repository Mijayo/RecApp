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
<link rel="stylesheet" href="style.css">
<!--  -->
<title>Anuncios</title>

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

		<main id="viewPort" > 
			<header	class="site-navbar js-sticky-header site-navbar-target" role="banner">
	
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
									<!-- <li><a href="#" class="nav-link">Regístrate</a></li> -->
									<li><a href="Login?option=logout" class="registrarse">log
											out</a></li>
									<li><a href="contactoUsu.jsp" class="nav-link">contacto</a></li>
									<li><a href="sobreNosotrosUsu.jsp" class="nav-link">nosotros</a></li>
									<li><a href="#" class="nav-link">empleo</a></li>
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
			<div style="max-width: 100%; min-height: 100vh; border: 1px solid;">
				<div class="d-flex flex-wrap justify-content-around" style="border: 1px solid hidden; width: 86%; height: 84vh; 
				 margin: 100px 0px 0px 80px; ">
			
					<c:forEach items="${sessionScope.anuncio}" var="trabajo">
						<div class="card" style="width: 40%; 
						height: 40vh; margin: 0px 0px 0px 20px;">
							<div class="card-body">
								<h5 class="card-title">${trabajo.cargo }</h5>
								<p class="card-text">${trabajo.requerimientos }</p>
								<p class="card-text">${trabajo.detalle }</p>
								<p class="card-text">
									<span>Salario </span>${trabajo.salario} €
								</p>
								<a href="https://www.indeed.es/ofertas?q=${trabajo.keyword}" class="btn btn-primary"
									target="_blank">¿quizas a indeed por probar?</a>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</main>
	</div>
	
</body>
</html>
