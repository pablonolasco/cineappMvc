package cine.app.controller;

import java.lang.ProcessBuilder.Redirect;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cine.app.model.Pelicula;
import cine.app.service.IPeliculasService;
import cine.app.util.Util;

@Controller
@RequestMapping("/peliculas")
public class PeliculaController {
	@Autowired
	private IPeliculasService peliculaService;

	@GetMapping("/create-pelicula")
	
	//== Form Tag Library 
	public String create(@ModelAttribute Pelicula pelicula, Model model) {
		model.addAttribute("generos", peliculaService.buscarGeneros());
		model.addAttribute("clasificaciones", peliculaService.buscarClasificacion());
		return "peliculas/create";
	}

	//== Form Tag Library 
	@PostMapping("/save-pelicula")
	public String store(@ModelAttribute Pelicula pelicula, BindingResult result, RedirectAttributes redirectAttributes,
			@RequestParam("archivoImagen") MultipartFile multipartFile, HttpServletRequest request) {
		// ===valida si los datos son mapeados de manera correcta con el modelo
		if (result.hasErrors()) {

			return "peliculas/create";
		}
		/*
		 * for (ObjectError error : result.getAllErrors()) { System.err.println(error);
		 * }
		 */
		//System.out.println(peliculaService.buscarTodas().size());
		// ==valida si se trae un archivo
		if (!multipartFile.isEmpty()) {
			try {
				String nombreImagen = Util.guardarImage(multipartFile, request);
				pelicula.setpImage(nombreImagen);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
				//e.printStackTrace();
				redirectAttributes.addFlashAttribute("msgError", 
						"La pelicula no se ha registrado ocurrio un error al subir la imagen.");
				return "redirect:/peliculas/index";
				
			}
			
		}
		
		this.peliculaService.insertar(pelicula);
		// ==variable flag
		redirectAttributes.addFlashAttribute("msg", "La pelicula se ha resgitrado");
		System.out.println(peliculaService.buscarTodas().size());
		System.out.print(pelicula);
		// return "peliculas/create";
		// ===redireccion
		return "redirect:/peliculas/index";
	}

	@GetMapping("/index")
	public String index(Model model) {
		List<Pelicula> listaPeliculas = peliculaService.buscarTodas();
		model.addAttribute("peliculas", listaPeliculas);
		return "peliculas/index";
	}

	/*
	 * TODO: metodo que formatea la fecha que se obtiene del formulario
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBanderDate(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));

	}

}
