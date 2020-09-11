<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jtsl"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmtFecha"%>
<!-- libreria para crear la variable relativa -->
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Listado de Noticias</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<link href="${ urlPublic }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ urlPublic} }/bootstrap/css/theme.css" rel="stylesheet">

</head>

<body>

	<!-- Fixed navbar -->
	<jsp:include page="../layout/menu/menu.jsp"></jsp:include>

	<div class="container theme-showcase" role="main">

		<h3>Listado de Noticias</h3>

		<a href="#" class="btn btn-success" role="button"
			title="Nueva Pelicula">Nueva</a><br>
		<br>

		<div class="table-responsive">
			<table class="table table-hover table-striped table-bordered">
				<tr>
					<th>Id</th>
					<th>Titulo</th>
					<th>Fecha</th>
					<th>Estatus</th>
					<th>Opciones</th>
				</tr>
				<tr>
					<td>1</td>
					<td>Noticia 1</td>
					<td>2017-05-05</td>
					<td><span class="label label-success">estatus</span></td>
					<td><a href="#" class="btn btn-success btn-sm" role="button"
						title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
						<a href="#" class="btn btn-danger btn-sm" role="button"
						title="Eliminar"><span class="glyphicon glyphicon-trash"></span></a>
					</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Noticia 2</td>
					<td>2017-05-05</td>
					<td><span class="label label-success">estatus</span></td>
					<td><a href="#" class="btn btn-success btn-sm" role="button"
						title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
						<a href="#" class="btn btn-danger btn-sm" role="button"
						title="Eliminar"><span class="glyphicon glyphicon-trash"></span></a>
					</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Noticia 3</td>
					<td>2017-05-05</td>
					<td><span class="label label-success">estatus</span></td>
					<td><a href="#" class="btn btn-success btn-sm" role="button"
						title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
						<a href="#" class="btn btn-danger btn-sm" role="button"
						title="Eliminar"><span class="glyphicon glyphicon-trash"></span></a>
					</td>
				</tr>
			</table>
		</div>
		<hr class="featurette-divider">

		<!-- FOOTER -->
		<jsp:include page="../layout/menu/menu.jsp"></jsp:include>

	</div>
	<!-- /container -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="${ urlPublic }/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
