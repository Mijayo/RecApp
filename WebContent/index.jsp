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

<title>RecApp</title>

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

		<header class="site-navbar js-sticky-header site-navbar-target"
			role="banner">

			<div class="container">
				<div class="row align-items-center">

					<div class="col-6 col-lg-2">
						<h1 class="mb-0 site-logo">
							<a href="index.jsp" class="mb-0">RecApp</a>
						</h1>
					</div>

					<div class="col-12 col-md-10 d-none d-lg-block">
						<nav class="site-navigation position-relative text-right"
							role="navigation">

							<ul
								class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
								<!-- <li><a href="#" class="nav-link">Regístrate</a></li> -->
								<li><a href="Login?option=registrar" class="registrarse">registrate</a></li>
								<li><a href="contacto.jsp" class="nav-link">contacto</a></li>
								<li><a href="sobreNosotros.jsp" class="nav-link">nosotros</a></li>
								<li><a href="logear.jsp" class="nav-link">login</a></li>
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


		<main id="main">
		<div class="hero-section">
			<div class="wave">

				<svg width="100%" height="355px" viewBox="0 0 1920 355"
					version="1.1" xmlns="http://www.w3.org/2000/svg"
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

			<div class="container">
				<div class="row align-items-center">
					<div class="col-12 hero-text-image">
						<div class="row" id="idImg">
							<div class="col-lg-7 text-center text-lg-left">
								<h1 data-aos="fade-right">Tú nos hablas sobre ti, y
									nosotros encontramos el trabajo que mejor encaja contigo.</h1>
								<p class="mb-5" data-aos="fade-right" data-aos-delay="100">Regístrate
									y accede a nuestro test de personalidad.</p>
								<p data-aos="fade-right" data-aos-delay="200"
									data-aos-offset="-500">
									<a href="Login?option=registrar"
										class="registrarse btn btn-outline-white">regístrate</a>
								</p>
							</div>
							<div class="col-lg-5 iphone-wrap">
								<!-- <img src="img/phone_1.png" alt="Image" class="phone-1" data-aos="fade-right"> -->
								<img src="img/iphone.png" alt="Image" class="phone-2"
									data-aos="fade-right" data-aos-delay="200">
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<div class="site-section">
			<div class="container">

				<div class="row justify-content-center text-center mb-5">
					<div class="col-md-5" data-aos="fade-up">
						<h2 class="section-heading">Beneficios de usar RecApp</h2>
					</div>
				</div>

				<div class="row">
					<div class="col-md-4" data-aos="fade-up" data-aos-delay="">
						<div class="feature-1 text-center">
							<div class="wrap-icon icon-1">
								<span class="icon la la-users"></span>
							</div>
							<h3 class="mb-3">Trabajos como tú</h3>
							<p>Cualidades personales que están relacionadas con tu
								trabajo soñado.</p>
						</div>
					</div>
					<div class="col-md-4" data-aos="fade-up" data-aos-delay="100">
						<div class="feature-1 text-center">
							<div class="wrap-icon icon-1">
								<span class="icon la la-toggle-off"></span>
							</div>
							<h3 class="mb-3">A un click del ascenso</h3>
							<p>El 75% del éxito en el trabajo a largo plazo tiene más que
								ver con las habilidades blandas.</p>
						</div>
					</div>
					<div class="col-md-4" data-aos="fade-up" data-aos-delay="200">
						<div class="feature-1 text-center">
							<div class="wrap-icon icon-1">
								<span class="icon la la-umbrella"></span>
							</div>
							<h3 class="mb-3">Ventajas competitivas</h3>
							<p>Capacidad de comunicación. Gestión del tiempo. Capacidad
								crítica. Estabilidad emocional...</p>
						</div>
					</div>
					<div>
						<p data-aos="fade-right" data-aos-delay="200"
							data-aos-offset="-500">
							<a href="Login?option=registrar" class="reg btn btn-outline-blue">regístrate</a>
						</p>
					</div>
				</div>
			</div>

		</div>
		<!-- .site-section -->

		<div class="site-section">
			<div class="container">
				<div class="row justify-content-center text-center mb-5"
					data-aos="fade">
					<div class="col-md-6 mb-5">
						<img src="img/undraw_svg_1.svg" alt="Image" class="img-fluid">
					</div>
				</div>

				<div class="row">
					<div class="col-md-4">
						<div class="step">
							<span class="number">01</span>
							<h3>Regístrate</h3>
							<p>Date de alta como usuario para realizar el test de la
								personalidad</p>
						</div>
					</div>
					<div class="col-md-4">
						<div class="step">
							<span class="number">02</span>
							<h3>Test eneagramas</h3>
							<p>Este test se realizará para detectar tus “soft skills”.</p>
						</div>
					</div>
					<div class="col-md-4">
						<div class="step">
							<span class="number">03</span>
							<h3>Encuentra trabajo</h3>
							<p>Encuentra el trabajo que mejor encaja contigo utilizando
								la App.</p>
						</div>
					</div>
				</div>
				<div>
					<p data-aos="fade-right" data-aos-delay="200"
						data-aos-offset="-500">
						<a href="Login?option=registrar" class="reg btn btn-outline-blue">regístrate</a>
					</p>
				</div>
			</div>
		</div>
		<!-- .site-section -->



		<div class="site-section pb-0">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 mr-auto">
						<h2 class="mb-4">Soft Skills o habilidades blandas</h2>
						<p class="mb-4">son aquellas cualidades personales que están
							relacionadas con la perspectiva emocional y social. Se adquieren
							en la vida día a día y forman parte del bagaje social del
							trabajador. Son una de las principales ventajas competitivas que
							diferencia un profesional cualquiera de uno a la altura de las
							grandes corporaciones.</p>
						<p>
							<a class="test btn btn-outline-blue"
								href="GestionTest?option=validar">test</a>
						</p>
					</div>
					<div class="col-md-6" data-aos="fade-left">
						<img src="img/undraw_svg_2.svg" alt="Image" class="img-fluid">
					</div>
				</div>
			</div>
		</div>
		<!-- .site-section -->

		<div class="site-section">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 ml-auto order-2">
						<h2 class="mb-4">Test personalidad</h2>
						<p class="mb-4">Consiste en un método de clasificación, para
							conocer el autoconocimiento y desarrollo personal. Existen varios
							tipos de personalidades principales, esta idea nace bajo el punto
							de vista de la psicología.</p>
						<p>
							<a class="test btn btn-outline-blue"
								href="GestionTest?option=validar">test</a>
						</p>
					</div>
					<div class="col-md-6" data-aos="fade-right">
						<img src="img/undraw_svg_3.svg" alt="Image" class="img-fluid">
					</div>
				</div>
			</div>
		</div>
		<!-- .site-section -->


		<div class="site-section border-top border-bottom">
			<div class="container">
				<div class="row justify-content-center text-center mb-5">
					<div class="col-md-4">
						<h2 class="section-heading">Review From Our Users</h2>
					</div>
				</div>
				<div class="row justify-content-center text-center">
					<div class="col-md-7">
						<div class="owl-carousel testimonial-carousel">
							<div class="review text-center">
								<p class="stars">
									<span class="icofont-star"></span> <span class="icofont-star"></span>
									<span class="icofont-star"></span> <span class="icofont-star"></span>
									<span class="icofont-star muted"></span>
								</p>
								<h3>Excellent App!</h3>
								<blockquote>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit. Eius ea delectus pariatur, numquam aperiam dolore nam
										optio dolorem facilis itaque voluptatum recusandae deleniti
										minus animi, provident voluptates consectetur maiores quos.</p>
								</blockquote>



								<p class="review-user">
									<img src="img/person_1.jpg" alt="Image"
										class="img-fluid rounded-circle mb-3"> <span
										class="d-block"> <span class="text-black">Jean
											Doe</span>, &mdash; App User
									</span>
								</p>

							</div>

							<div class="review text-center">
								<p class="stars">
									<span class="icofont-star"></span> <span class="icofont-star"></span>
									<span class="icofont-star"></span> <span class="icofont-star"></span>
									<span class="icofont-star muted"></span>
								</p>
								<h3>This App is easy to use!</h3>
								<blockquote>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit. Eius ea delectus pariatur, numquam aperiam dolore nam
										optio dolorem facilis itaque voluptatum recusandae deleniti
										minus animi, provident voluptates consectetur maiores quos.</p>
								</blockquote>



								<p class="review-user">
									<img src="img/person_2.jpg" alt="Image"
										class="img-fluid rounded-circle mb-3"> <span
										class="d-block"> <span class="text-black">Johan
											Smith</span>, &mdash; App User
									</span>
								</p>

							</div>


							<div class="review text-center">
								<p class="stars">
									<span class="icofont-star"></span> <span class="icofont-star"></span>
									<span class="icofont-star"></span> <span class="icofont-star"></span>
									<span class="icofont-star muted"></span>
								</p>
								<h3>Awesome functionality!</h3>
								<blockquote>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit. Eius ea delectus pariatur, numquam aperiam dolore nam
										optio dolorem facilis itaque voluptatum recusandae deleniti
										minus animi, provident voluptates consectetur maiores quos.</p>
								</blockquote>



								<p class="review-user">
									<img src="img/person_3.jpg" alt="Image"
										class="img-fluid rounded-circle mb-3"> <span
										class="d-block"> <span class="text-black">Jean
											Thunberg</span>, &mdash; App User
									</span>
								</p>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>



		<div class="site-section cta-section">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-6 mr-auto text-center text-md-left mb-5 mb-md-0">
						<h2>RecApp está disponible en</h2>
					</div>
					<div class="col-md-5 text-center text-md-right">
						<p>
							<a href="#" class="btn"><span
								class="icofont-brand-apple mr-3"></span>App store</a> <a href="#"
								class="btn"><span class="icofont-ui-play mr-3"></span>Google
								play</a>
						</p>
					</div>
				</div>
			</div>
		</div>

		</main>
		<footer class="footer" role="contentinfo">
			<div class="container">
				<div class="row">
					<div class="col-md-4 mb-4 mb-md-0">
						<h3>Sobre RecApp</h3>
						<p>Herramienta digital para encontrar trabajo en otra área
							profesional para gente que quiere reinventarse y/o cambiar. Está
							app valorara las Soft Skills personales previas importantes para
							el nuevo puesto de trabajo.</p>
						<p class="social">
							<a href="#"><span class="icofont-twitter"></span></a> <a href="#"><span
								class="icofont-facebook"></span></a>
						</p>
					</div>
					<div class="col-md-7 ml-auto">
						<div class="row site-section pt-0">
							<div class="col-md-4 mb-4 mb-md-0">
								<h3>Navigation</h3>
								<ul class="list-unstyled">
									<li><a href="#">Pricing</a></li>
									<li><a href="#">Features</a></li>
									<li><a href="#">Blog</a></li>
									<li><a href="#">Contact</a></li>
								</ul>
							</div>
							<div class="col-md-4 mb-4 mb-md-0">
								<h3>Servicios</h3>
								<ul class="list-unstyled">
									<li><a href="#">Equipo</a></li>
									<li><a href="#">Sinergias</a></li>
									<li><a href="#">Todos</a></li>
									<li><a href="#">Eventos</a></li>
								</ul>
							</div>
							<div class="col-md-4 mb-4 mb-md-0">
								<h3>Descarga RecApp</h3>
								<ul class="list-unstyled">
									<li><a href="#">App Store</a></li>
									<li><a href="#">Play Store</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>

				<div class="row justify-content-center text-center">
					<div class="col-md-7">
						<!-- <p class="copyright">&copy; Copyright SoftLand. All Rights Reserved</p> -->
						<div class="credits">Designed by Diego / Oriana / Jesus</div>
					</div>
				</div>

			</div>
		</footer>
	</div>
	<!-- .site-wrap -->

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