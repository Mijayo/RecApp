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
<body onload="spinner()">

	<!-- Spinner -->
	<div class="contSpiner">
		<h1 id="inicio">Calculando resultado</h1>
		<div class="lds-ring">
			<div></div>
			<div></div>
			<div></div>
			<div></div>
		</div>
	</div>

	<!-- Template Main JS File -->
	<script src="js/main.js"></script>

</body>
</html>