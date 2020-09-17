package cine.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ContactoController {

	@RequestMapping("/contacto")
	public String index() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "contacto/create";
	}
}
