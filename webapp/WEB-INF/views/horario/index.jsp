<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jtsl" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fecha" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">   
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Listado de Horarios</title>
  	<spring:url value="/resources" var="urlPublic"></spring:url>
  	
    <link href="${ urlPublic }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${ urlPublic }/bootstrap/css/theme.css" rel="stylesheet">
    
  </head>

  <body>

    <!-- Fixed navbar -->
   <jsp:include page="../layout/menu/menu.jsp"></jsp:include>
    <div class="container theme-showcase" role="main">

      <h3>Listado de Horarios</h3>
      <jtsl:if test="${msgError != null}">
      	<div class="alert alert-danger" role="alert">${ msgError }</div>
      </jtsl:if>
      <spring:url value="/horarios/create-horario" var="urlFrm"></spring:url>
      <a href="${ urlFrm }" class="btn btn-success" role="button" title="Nueva Horario" >Nuevo</a><br><br>
	
      <div class="table-responsive">
        <table class="table table-hover table-striped table-bordered">
            <tr>
                <th>Pelicula</th>
                <th>Fecha</th>
                <th>Hora</th>
                <th>Sala</th>
                <th>Precio</th>
                <th>Opciones</th>
            </tr>
            <tr>
                <td>titulo</td>
                <td>fecha</td>
                <td>hora</td>
                <td>sala</td>
                <td>precio</td>              
                <td>
					<a href="#" class="btn btn-success btn-sm" role="button" title="Edit" ><span class="glyphicon glyphicon-pencil"></span></a>
					<a href="#" class="btn btn-danger btn-sm" role="button" title="Delete" ><span class="glyphicon glyphicon-trash"></span></a>
				</td>
            </tr>
            <tr>
                <td>titulo</td>
                <td>fecha</td>
                <td>hora</td>
                <td>sala</td>
                <td>precio</td>     	    
                <td>
					<a href="#" class="btn btn-success btn-sm" role="button" title="Edit" ><span class="glyphicon glyphicon-pencil"></span></a>
					<a href="#" class="btn btn-danger btn-sm" role="button" title="Delete" ><span class="glyphicon glyphicon-trash"></span></a>
				</td>
            </tr>
            <tr>
                <td>titulo</td>
                <td>fecha</td>
                <td>hora</td>
                <td>sala</td>
                <td>precio</td>     			
                <td>
					<a href="#" class="btn btn-success btn-sm" role="button" title="Edit" ><span class="glyphicon glyphicon-pencil"></span></a>
					<a href="#" class="btn btn-danger btn-sm" role="button" title="Delete" ><span class="glyphicon glyphicon-trash"></span></a>
				</td>
            </tr>
        </table>
      </div>
      <hr class="featurette-divider">

      <!-- FOOTER -->
      <footer>        
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2017 My CineSite, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${ urlPublic }/bootstrap/js/bootstrap.min.js"></script> 

  </body>
</html>
