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
								<li class="active"><a href="#" class="nav-link">nosotros</a></li>
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


		<main id="main">
		<div class="hero-section inner-page">
			<div class="wave">

				<svg width="1920px" height="265px" viewBox="0 0 1920 265"
					version="1.1" xmlns="http://www.w3.org/2000/svg"
					xmlns:xlink="http://www.w3.org/1999/xlink">
              <g id="Page-1" stroke="none" stroke-width="1" fill="none"
						fill-rule="evenodd">
                  <g id="Apple-TV"
						transform="translate(0.000000, -402.000000)" fill="#FFFFFF">
                      <path
						d="M0,439.134243 C175.04074,464.89273 327.944386,477.771974 458.710937,477.771974 C654.860765,477.771974 870.645295,442.632362 1205.9828,410.192501 C1429.54114,388.565926 1667.54687,411.092417 1920,477.771974 L1920,667 L1017.15166,667 L0,667 L0,439.134243 Z"
						id="Path"></path>
                  </g>
              </g>
          </svg>

			</div>

			<div class="container">
				<div class="row align-items-center">
					<div class="col-12">
						<div class="row justify-content-center">
							<div class="col-md-7 text-center hero-text">
								<h1 data-aos="fade-up" data-aos-delay="">
									Eneagrama de <br>la personalidad
								</h1>
								<p class="mb-5" data-aos="fade-up" data-aos-delay="100">Consiste
									en un sistema de clasificacion de la personalidad que divide a
									las personas en nueve tipos segun su perfil de comportamiento.</p>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>



		<div class="site-section pb-0">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 mr-auto">
						<h2 class="mb-4">Nuestro metodo</h2>
						<p class="mb-4">En RecApp tienes a tu disposicion un test
							creado para identificar tu eneatipo, y en base a eso te
							buscaremos las ofertas de trabajo que sean afines a tu
							personalidad.</p>
						<p>
							<a href="#">leer mas</a>
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
						<h2 class="mb-4">¿Por que RecApp?</h2>
						<p class="mb-4">RecApp fue creado para ofrecer a las personas
							que no estan agusto en su trabajo o sector un oportunidad de
							reinventarse y dar un giro a su carrera profesional. Para ello,
							creemos que enfocar tus "soft-skills" y aptitudes personales
							ayudares a enfocar que campos se adaptan a lo que quieres y donde
							esta¡s mas comodo</p>

					</div>
					<div class="col-md-6" data-aos="fade-right">
						<img src="img/undraw_svg_3.svg" alt="Image" class="img-fluid">
					</div>
				</div>
			</div>
		</div>
		<!-- .site-section -->

		<div class="site-section pb-0">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 mr-auto">
						<h2 class="mb-4">Sobre Nosotros</h2>
						<p class="mb-4">RecApp ha sido creado por tres estudiantes que
							buscan ayudar a otros a salir de esa rutina que acaba quemando a
							las personas cuando su trabajo no les gusta. Y para aprobar tb xd</p>

					</div>
					<div class="col-md-6" data-aos="fade-left">
						<img src="img/undraw_svg_3.svg" alt="Image" class="img-fluid">
					</div>
				</div>
			</div>
		</div>
		<!-- .site-section -->

		<div class="site-section">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 ml-auto order-2">
						<h2 class="mb-4">Powerful App Design</h2>
						<p class="mb-4">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Tenetur at reprehenderit optio, laudantium eius
							quod, eum maxime molestiae porro omnis. Dolores aspernatur
							delectus impedit incidunt dolore mollitia esse natus beatae.</p>

					</div>
					<div class="col-md-6" data-aos="fade-right">
						<img src="img/undraw_svg_4.svg" alt="Image" class="img-fluid">
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
						<h2>Starts Publishing Your Apps</h2>
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
						<h3>About SoftLand</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Eius ea delectus pariatur, numquam aperiam dolore nam optio
							dolorem facilis itaque voluptatum recusandae deleniti minus
							animi.</p>
						<p class="social">
							<a href="#"><span class="icofont-twitter"></span></a> <a href="#"><span
								class="icofont-facebook"></span></a> <a href="#"><span
								class="icofont-dribbble"></span></a> <a href="#"><span
								class="icofont-behance"></span></a>
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
								<h3>Services</h3>
								<ul class="list-unstyled">
									<li><a href="#">Team</a></li>
									<li><a href="#">Collaboration</a></li>
									<li><a href="#">Todos</a></li>
									<li><a href="#">Events</a></li>
								</ul>
							</div>
							<div class="col-md-4 mb-4 mb-md-0">
								<h3>Downloads</h3>
								<ul class="list-unstyled">
									<li><a href="#">Get from the App Store</a></li>
									<li><a href="#">Get from the Play Store</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>

				<div class="row justify-content-center text-center">
					<div class="col-md-7">
						<p class="copyright">&copy; Copyright SoftLand. All Rights
							Reserved</p>
						<div class="credits">
							<!--
                All the links in the footer should remain intact.
                You can delete the links only if you purchased the pro version.
                Licensing information: https://bootstrapmade.com/license/
                Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=SoftLand
              -->
							Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
						</div>
					</div>
				</div>

			</div>
		</footer>
	</div>
	<!-- .site-wrap -->

	<!-- Vendor JS Files -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/jquery/jquery-migrate.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/easing/easing.min.js"></script>
	<script src="vendor/php-email-form/validate.js"></script>
	<script src="vendor/sticky/sticky.js"></script>
	<script src="vendor/aos/aos.js"></script>
	<script src="vendor/owlcarousel/owl.carousel.min.js"></script>

	<!-- Template Main JS File -->
	<script src="js/main.js"></script>

</body>
</html>
