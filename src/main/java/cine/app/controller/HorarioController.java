package cine.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cine.app.model.Horario;
import cine.app.model.Pelicula;
import cine.app.service.IPeliculasService;

@Controller
@RequestMapping("/horarios")
public class HorarioController {
	@Autowired
	IPeliculasService peliculaService;
	@GetMapping("/listado")
	public String index() {
		
		return "horario/index";
	}
	
	@GetMapping("/create-horario")
	public String create(@ModelAttribute Horario horario ,Model model) {
		List<Pelicula> listaPelicula=peliculaService.buscarTodas();
		model.addAttribute("peliculas", listaPelicula);
		return "horario/create";
	}
	
	@PostMapping("/save-horario")
	public String store(@ModelAttribute Horario horario, BindingResult result, RedirectAttributes redirectAttributes) {
		try {
			if (result.hasErrors()) {

				return "horario/create";
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("errors save:"+e.getMessage());
		}
		
		System.out.print("horario:"+horario);
		return "redirect:/horario/index";
	}
	

}
