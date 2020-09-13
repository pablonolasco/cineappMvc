/*
 Componentes que proporcionan acceso al funcionamiento de la aplicación.
 Procesan la lógica de la aplicación (se apoyan de componentes de la capa de servicio).
 Reciben los datos de entrada del usuario (ej. datos de un formulario HTML).
 Crean el modelo (datos de la aplicación) y regresan el nombre de la vista al DispatcherServlet.
 Anotaciones específicas de Spring MVC. @Controller, @RequestMapping, @RequestParam, @ModelAttribute, etc.

 */
package cine.app.controller; //Configuración del DispatcherServlet

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cine.app.model.Banner;
import cine.app.model.Pelicula;
import cine.app.service.IBannerService;
import cine.app.service.IPeliculasService;
import cine.app.util.Util;

@Controller
public class HomeController {
	@Autowired
	private IPeliculasService peliculasService;
	@Autowired
	private IBannerService bannerService;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");

	/*
	 * -Un Controller en Spring MVC es una clase normal a la cual se le agrega la
	 * anotación @Controller a nivel de la clase. -Puede tener varios métodos con la
	 * anotación @RequestMapping (Action Controller). -Los métodos pueden tener
	 * cualquier nombre y deben regresar un String (VIEW). 
	 * -Los métodos son ejecutados al ser invocados por medio de la URL especificada en el parámetro
	 * value de @RequestMapping. El parámetro method es opcional. Si no se
	 * especifica, responderá a cualquier tipo de petición (GET, POST, DELETE, PUT,
	 * etc).
	 */
	/*
	 * @RequestMapping(value = "/home", method = RequestMethod.GET) public String
	 * goHome() { return "home"; }
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		List<Pelicula> peliculas = peliculasService.buscarTodas();
		List<String>fechas=Util.getNextDay(5);
		List<Banner>banners=bannerService.buscarTodas();
		model.addAttribute("fechaBusqueda", dateFormat.format(new Date()));
		model.addAttribute("peliculas", peliculas);
		model.addAttribute("banners",banners);
		model.addAttribute("fechas",fechas);
		return "home";
	}

	@RequestMapping(value="buscarFecha",method=RequestMethod.POST)
	public String buscarFecha(@RequestParam("fecha") String fechaBusqueda, Model model) {
		List<Pelicula> peliculas =peliculasService.buscarTodas();
		List<String>fechas=Util.getNextDay(5);
		model.addAttribute("fechaBusqueda",fechaBusqueda );
		model.addAttribute("peliculas", peliculas);
		model.addAttribute("fechas",fechas);
		return "home";
	}
	

	
	// ==Metodo con @PathVariable
	@RequestMapping(value = "detalle/{pId}/{fecha}", method = RequestMethod.GET)
	public String detalle(Model model, @PathVariable("pId") int idPelicula,
			@PathVariable("fecha") String fechaBusqueda) {
		model.addAttribute("fechaBusqueda", fechaBusqueda);
		model.addAttribute("pelicula", peliculasService.buscarPelicula(idPelicula));

		return "detalle";
	}

	//==========@RequestParam
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam("idPelicula") int idMovie,
			@RequestParam("fecha") String fechaBusqueda) {
		String nombre = "Rapidos y Furisos";
		int entrada = 4;
		double precio = 40.00;
		model.addAttribute("titulo", nombre);
		model.addAttribute("entrada", entrada);
		model.addAttribute("precio", precio);
		model.addAttribute("fechaBusqueda", fechaBusqueda);
		model.addAttribute("idPelicula", idMovie);

		return "detalle";

	}
	
	
}
