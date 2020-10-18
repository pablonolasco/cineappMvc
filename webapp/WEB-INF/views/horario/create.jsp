<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jtsl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fecha"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="author" content="">
<title>Creacion de Horarios</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<link href="${ urlPublic }/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${ urlPublic }/bootstrap/css/theme.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
</head>

<body>

	<!-- Fixed navbar -->
	<jsp:include page="../layout/menu/menu.jsp"></jsp:include>

	<div class="container theme-showcase" role="main">

		<h3 class="blog-title">
			<span class="label label-success">Datos del Horario</span>
		</h3>
			<spring:hasBindErrors name="horario">
			<div class="alert alert-danger" role="alert">
				<p>Por favor corriga los siguientes errores</p>
				<ul>
					<jtsl:forEach items="${ errors.allErrors }" var="error">
						<li><spring:message message="${ error }"></spring:message></li>
					</jtsl:forEach>

				</ul>
			</div>
		</spring:hasBindErrors>
		<spring:url value="/horarios/save-horario" var="urlFrm"></spring:url>
		<form:form method="post" modelAttribute="horario" action="${ urlFrm }">
			<div class="row">
				<div class="col-sm-3">
					<div class="form-group">
						<label for="idPelicula" class="control-label">Pelicula</label>
						<form:select id="idPelicula" path="pelicula" class="form-control"
							items="${ peliculas }" itemValue="pId" itemLabel="pTitulo">
						</form:select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-3">
					<div class="form-group">
						<label for="fecha">Fecha</label> <input type="text"
							class="form-control" name="fecha" id="fecha" required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="hora">Hora</label> <input type="text"
							class="form-control" name="hora" id="hora"
							placeholder="Formato: HH:mm Ejemplo 21:30" required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="sala" class="control-label">Sala</label> <select
							id="sala" name="sala" class="form-control">
							<option value="Premium">Sala Premium</option>
							<option value="Sala 1">Sala 1</option>
							<option value="Sala 2">Sala 2</option>
							<option value="Sala 3">Sala 3</option>
						</select>
					</div>
				</div>

				<div class="col-sm-3">
					<div class="form-group">
						<label for="precio">Precio</label> <input type="text"
							class="form-control" name="precio" id="precio"
							required="required" />
					</div>
				</div>

			</div>

			<button type="submit" class="btn btn-danger">Guardar</button>
		</form:form>

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
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
		$(function() {
			$("#fecha").datepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
	</script>
</body>
</html>
