package cine.app.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cine.app.service.IContacto;
import cine.app.service.IPeliculasService;
import cine.app.model.Contacto;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
	
	@Autowired
	private IContacto contactoService;
	@Autowired
	private IPeliculasService peliculaService;

	//== Form Tag Library 
	@GetMapping("/create")
	public String show(@ModelAttribute("instanciaContacto") Contacto contacto, Model modelo) {
		try {
			
			modelo.addAttribute("generos", peliculaService.buscarGeneros());
			modelo.addAttribute("notificacion", this.tipo());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "contacto/create";
	}
	
	@PostMapping("send-comment")
	public String store(@ModelAttribute("instanciaContacto") Contacto contacto,BindingResult result, 
			RedirectAttributes redirectAttributes, HttpServletRequest request) {
		try {		
			if (result.hasErrors()) {
				return "contacto/create";
			}
			System.out.println(contacto);
			this.contactoService.insertar(contacto);
			redirectAttributes.addFlashAttribute("msg", "El comentario se envio");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/contacto/create";
	}

	private List<String>tipo(){
		List<String>listTipo= new LinkedList<String>();
		listTipo.add("Estrenos");
		listTipo.add("Promociones");
		listTipo.add("Noticias");
		listTipo.add("Preventas");
		return listTipo;
	}
	
}
