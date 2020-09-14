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
<title>Listado de Peliculas</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<link href="${ urlPublic }/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${ urlPublic }/bootstrap/css/theme.css" rel="stylesheet">

</head>

<body>

	<!-- Fixed navbar -->
	<jsp:include page="../layout/menu/menu.jsp"></jsp:include>

	<div class="container theme-showcase" role="main">

		<h3>Listado de Peliculas</h3>
		<jtsl:if test="${ msg != null }">
			<div class="alert alert-success" role="alert">${ msg }</div>
		</jtsl:if>
		<jtsl:if test="${ msgError != null }">
			<div class="alert alert-danger" role="alert">${ msgError }</div>
		</jtsl:if>
		<br>
		<spring:url value="/peliculas/create-pelicula" var="urlFrm"></spring:url>

		<a href="${ urlFrm }" class="btn btn-success" role="button"
			title="Nueva Pelicula">Nueva</a><br> <br>


		<div class="table-responsive">
			<table class="table table-hover table-striped table-bordered">
				<tr>
					<th>Titulo</th>
					<th>Genero</th>
					<th>Clasificacion</th>
					<th>Duracion</th>
					<th>Fecha Estreno</th>
					<th>Estatus</th>
					<th>Opciones</th>
				</tr>
				<jtsl:forEach items="${ peliculas }" var="pelicula">
					<tr>
						
						<td>${ pelicula.pTitulo }</td>
						<td>${ pelicula.pGenero }</td>
						<td>${ pelicula.pClasificacion }</td>
						<td>${ pelicula.pDuracion }</td>
						<td>${ pelicula.pFechaEstreno }</td>
						<td><jtsl:choose>
								<jtsl:when test="${ pelicula.pStatus eq 'Activa'}">
									<span class="label label-success">Activa</span>
								</jtsl:when>
								<jtsl:otherwise>
									<span class="label label-danger">Inactiva</span>
								</jtsl:otherwise>
							</jtsl:choose></td>
						<td><a href="#" class="btn btn-success btn-sm" role="button"
							title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
							<a href="#" class="btn btn-danger btn-sm" role="button"
							title="Eliminar"><span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>

				</jtsl:forEach>


			</table>
		</div>

		<hr class="featurette-divider">

		<!-- FOOTER -->
		<jsp:include page="../layout/footer/footer.jsp"></jsp:include>

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
