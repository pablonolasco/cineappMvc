

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!-- Fixed navbar -->
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="..${ urlPublic }">My CineSite</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
		<spring:url value="/" var="urlMenu"></spring:url>
			<ul class="nav navbar-nav">
				<li><a href="${urlMenu }peliculas/index">Pelicula</a></li>
				<li><a href="${urlMenu }noticias/index">Noticia</a></li>
				<li><a href="${urlMenu }banners/index">Banner</a></li>
				<li><a href="#">Acerca</a></li>
				<li><a href="#">Login</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>