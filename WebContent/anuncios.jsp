<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Anuncios</title>
</head>
<body>

	<h1>Anuncios</h1>
	<p>Cargo: ${sessionScope.anuncio.cargo }</p>
	<p>Detalle: ${sessionScope.anuncio.detalle }</p>
	<p>Area: ${sessionScope.anuncio.keyword }</p>
	<p>Descripcion: ${sessionScope.anuncio.requerimientos }</p>
	<p>Salario: ${sessionScope.anuncio.salario }</p>

</body>
</html>