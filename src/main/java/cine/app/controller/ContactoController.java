package cine.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import cine.app.service.IContacto;
import cine.app.model.Contacto;

@Controller

public class ContactoController {
	
	@Autowired
	private IContacto contactoService;

	//== Form Tag Library 
	@RequestMapping("/contacto")
	public String show(@ModelAttribute Contacto contacto) {
		try {
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "contacto/create";
	}
}
