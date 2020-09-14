<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jtsl"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Creacion de Peliculas</title>
<spring:url value="/resources" var="urlPublic"></spring:url>

<link href="${urlPublic}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${urlPublic }/bootstrap/css/theme.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
</head>

<body>

	<!-- Fixed navbar -->

	<jsp:include page="../layout/menu/menu.jsp"/>
	<div class="container theme-showcase" role="main">

		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Datos de la Pelicula</span>
			</h3>
		</div>
		<!-- nombre del modelo -->
		<spring:hasBindErrors name="pelicula">
			<div class="alert alert-danger" role="alert">
				<p>Por favor corriga los siguientes errores</p>
				<ul>
					<jtsl:forEach items="${ errors.allErrors }" var="error">
						<li><spring:message message="${ error }"></spring:message></li>
					</jtsl:forEach>

				</ul>
			</div>
		</spring:hasBindErrors>

		<spring:url value="/peliculas/save-pelicula" var="urlFrm"></spring:url>
		<form:form action="${ urlFrm }" method="post" enctype="multipart/form-data" modelAttribute="pelicula">
			<div class="row">
				<div class="col-sm-3">
					<div class="form-group">
						<label for="titulo">Título</label> 
						<form:hidden path="pId"/>
						<form:input type="text"
							class="form-control" path="pTitulo" id="titulo"
							required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="duracion">Duracion</label> 
						<form:input type="text"
							class="form-control" path="pDuracion" id="duracion"
							required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="clasificacion" class="control-label">Clasificacion</label>
						<form:select id="clasificacion" path="pClasificacion"
							class="form-control">
							<jtsl:forEach items="${ clasificaciones }" var="clasificacion">
								<form:option value="${clasificacion} }">Clasificacion ${ clasificacion }</form:option>
							</jtsl:forEach>
						</form:select>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="genero" class="control-label">Genero</label> 
						<form:select
							id="genero" path="pGenero" class="form-control" items="${ generos }">
						
						</form:select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-sm-3">
					<div class="form-group">
						<label for="estatus" class="control-label">Estatus</label> 
						<form:select
							id="genero" path="pStatus" class="form-control">
							<form:option value="Activa">Activa</form:option>
							<form:option value="Inactiva">Inactiva</form:option>
						</form:select>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="fechaEstreno">Fecha Estreno</label>
						 <form:input type="text"
							class="form-control" path="pFechaEstreno" id="fechaEstreno"
							required="required" />
					</div>
				</div>

				<div class="col-sm-3">
					<div class="form-group">
						<label for="imagen">Imagen</label> 
						<form:hidden path="pImage"/>
						<input type="file"
							id="archivoImagen" name="archivoImagen" />
						<p class="help-block">Imagen de la pelicula</p>
					</div>
				</div>
			</div>

		
        <div class="page-header">
            <h3 class="blog-title"><span class="label label-success">Detalles</span></h3>
        </div>

        <div class="row">
          <div class="col-sm-3">
            <div class="form-group">
              <label for="director">Director</label>
              <form:input type="text" class="form-control" path="detalle.director" id="director" required="required" />
            </div>  
          </div>
          <div class="col-sm-3">
            <div class="form-group">
              <label for="actores">Actores</label>
              <form:input type="text" class="form-control" path="detalle.actores" id="actores" required="required" />
            </div>  
          </div>

          <div class="col-sm-6">
            <div class="form-group">
              <label for="trailer">URL del Trailer (Youtube)</label>
              <form:input type="text" class="form-control" path="detalle.trailer" id="trailer" placeholder="URL completa del video de YOUTUBE" required="required" />
            </div>  
          </div> 
        </div> 

        <div class="row">
          <div class="col-sm-6">
            <div class="form-group">
              <label for="sinopsis">Sinopsis</label>
              <form:textarea class="form-control" rows="5" path="detalle.sinopsis" id="sinopsis"></form:textarea>
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
			$("#fechaEstreno").datepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
	</script>
</body>
</html>
