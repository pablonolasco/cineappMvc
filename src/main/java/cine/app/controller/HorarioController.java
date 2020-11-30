package cine.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cine.app.model.Horario;
import cine.app.model.Pelicula;
import cine.app.service.IHorario;
import cine.app.service.IPeliculasService;

@Controller
@RequestMapping("/horarios")
public class HorarioController {
	@Autowired
	IPeliculasService peliculaService;
	IHorario horarioService;
	
	@GetMapping("/listado")
	public String index() {
		
		return "horario/index";
	}
	
	/**
	 * Metodo para mostrar el formulario para crear un nuevo horario
	 * @return
	 */
	@GetMapping("/create-horario")
	public String create(@ModelAttribute Horario horario ,Model model) {
		List<Pelicula> listaPelicula=peliculaService.buscarTodas();
	
		model.addAttribute("peliculas", listaPelicula);
		return "horario/create";
	}
	
	/**
	 * Metodo para guardar el registro del Horario
	 * @param horario
	 * @param model
	 * @return0.
	 * cazadorccc
	 */
	@PostMapping("/save-horario")
	public String store(@ModelAttribute Horario horario, BindingResult result, 
			RedirectAttributes redirectAttributes, Model model) {
		try {
			if (result.hasErrors()) {
				List<Pelicula> listaPelicula=peliculaService.buscarTodas();
				model.addAttribute("peliculas", listaPelicula);
				return "horario/create";
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("errors save:"+e.getMessage());
			redirectAttributes.addFlashAttribute("msgError", 
					"El horario no se ha registrado ocurrio un error");
			return "redirect:/horarios/listado";
		}
		
		System.out.print("horario:"+horario);
		//horarioService.insertar(horario);
		return "redirect:/horarios/listado";
	}
	
	/**
	 * Personalizamos el Data Binding para todas las propiedades de tipo Date
	 * @param binder
	 */
	@InitBinder
	public void initBanderDate(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));

	}

}
