<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="style.css">

<title>Preguntas</title>


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

<script type="text/javascript">
	
	function noBackButton(){
		window.location.hash="no-back-button";
		window.location.hash="Again-No-back-button" //for chrome

		window.onhashchange=function(){window.location.hash="no-back-button";}
	}
</script>

</head>
<body onload="noBackButton();">


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
							<a href="Login?option=validar" class="mb-0">RecApp</a>
						</h1>
					</div>

					<div class="col-12 col-md-10 d-none d-lg-block">
						<nav class="site-navigation position-relative text-right"
							role="navigation">

							<ul
								class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
								<li></li>
								<li></li>
								<li></li>
								<li><a href="Login?option=cerrar-test" class="registrarse"
									onclick="cerrarTest()">cerrar test</a></li>
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

					<div class="mr-auto" style="max-width: 600px; margin-top: -20px;">

						<form class="" action="GestionPreguntas?option=question"
							method="POST">
							<div style="position: relative;">

								<h2 class="mb-4" style="color: white;">
									<span>${requestScope.tipoEne.idEneagrama } </span><span>-
										${requestScope.tipoEne.tipo } </span>
								</h2>

							</div>
							<div style="max-width: 450px; position: absolute; z-index: 99;">
								<c:forEach items="${requestScope.preguntas}" var="pregunta"
									begin="0" end="4">
									<div style="display: flex;">
										<table>
											<tr>

												<td><input
													style="position: relative; top: -22px; border: 1px solid red; visibility: hidden;"
													type="checkbox" name="isbn" value="${pregunta.idAux}"
													checked></td>
												<td><p
														style="color: white; padding: 0px 10px 0px 10px; min-width: 450px;">
														${pregunta.pregunta }</p></td>
												<td><select name="cantidad${pregunta.idAux }">
														<option value="1">1</option>
														<option value="2">2</option>
														<option value="3">3</option>
														<option value="4">4</option>
														<option value="5">5</option>
												</select></td>

											</tr>
										</table>
									</div>
								</c:forEach>

								<button style="margin-left: 25px;" type="submit"
									class="registro btn btn-outline-white">siguiente</button>
							</div>
						</form>

					</div>

					<div
						style="padding: 40px 80px 40px 80px; max-width: 400px; position: absolute; left: 780px; bottom: 75px; background-color: rgba(255, 255, 255); border-radius: 20px; box-shadow: 10px -2px 22px -4px rgba(0, 0, 0, 0.2);">
						<h4 class="mb-4" style="color: grey;">sistema de puntos</h4>
						<ul style="list-style-type: none; margin-left: -35px;">
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									1 ...</span>
								<p style="color: steelblue; font-size: 12px;">nunca</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									2 ...</span>
								<p style="color: steelblue; font-size: 12px;">rara vez</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									3 ...</span>
								<p style="color: steelblue; font-size: 12px;">quizás</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">
									... 4 ...</span>
								<p style="color: steelblue; font-size: 12px;">normalmente</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									5 ...</span>
								<p style="color: steelblue; font-size: 12px;">siempre</p></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		</main>
	</div>

</body>
</html>