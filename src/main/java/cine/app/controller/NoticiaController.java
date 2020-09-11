package cine.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cine.app.model.Noticia;
import cine.app.service.INoticiaService;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {
	@Autowired
	private INoticiaService noticiaService;
	
	@GetMapping(value = "/create-noticia")
	public String create() {
		return "noticias/create";
	}
	
	//==DataBinding
	@PostMapping(value = "/save-noticia")
	public String store(Noticia noticia) {		
	
		noticiaService.guardar(noticia);
		return "noticias/create";
	}
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Noticia>listNoticia=null;
		return "noticias/index";
	}

}
