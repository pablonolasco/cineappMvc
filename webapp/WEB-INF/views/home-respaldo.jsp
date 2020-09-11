<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jtsl"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmtFecha"%>
<!-- libreria para crear la variable relativa -->
<%@taglib uri="http://www.springframework.org/tags"
prefix="spring"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Principal</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet" href="${urlPublic }/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h1>Bienvenido a la pagina Principal</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">First</th>
				<th scope="col">Last</th>
				<th scope="col">Handle</th>
			</tr>
		</thead>
		<tbody>
			<jtsl:forEach items="${ peliculas}" var="pelicula">
				<tr>
					<th scope="row">1</th>
					<td>${pelicula.pId}</td>
					<td>${pelicula.pTitulo }</td>
					<td>${pelicula.pDuracion }</td>
					<td>${pelicula.pClasificacion }</td>
					<td>${pelicula.pGenero }</td>
					<td><img src="${urlPublic}/images/${pelicula.pImage}"></td>
					<td><fmtFecha:formatDate value="${pelicula.pFechaEstreno}" pattern="dd-MM-yyyy"/>
					</td>
					<td>
					<jtsl:choose>
						<jtsl:when test="${pelicula.pStatus}">
							<span>Activa</span>
						</jtsl:when>
						<jtsl:otherwise>
							<span>Inactiva</span>
						</jtsl:otherwise>
					</jtsl:choose>
					</td>
				</tr>
			</jtsl:forEach>
		</tbody>
	</table>

</body>
</html>