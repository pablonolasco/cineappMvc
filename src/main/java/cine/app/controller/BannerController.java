package cine.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import cine.app.model.Banner;
import cine.app.service.IBannerService;
import cine.app.util.Util;

@Controller
@RequestMapping("/banners")
public class BannerController {

	@Autowired
	private IBannerService bannerService;
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Banner> listaBanner= bannerService.buscarTodas();
		model.addAttribute("listaBanner",listaBanner);
		return "banner/index";
	}
	
	@GetMapping("/create-banner")
	public String create() {
		return "banner/create";
	}
	
	@PostMapping("/save-banner")
	public String store(Banner banner, BindingResult result, RedirectAttributes attributes, 
			@RequestParam("archivoImagen") MultipartFile multipartFile, HttpServletRequest request) {
		
		try {
			// ===valida si los datos son mapeados de manera correcta con el modelo
			if (result.hasErrors()) {
				return "banner/create";
			}
			System.out.println(this.bannerService.buscarTodas());
			// ==valida si se trae un archivo
			if(!multipartFile.isEmpty()) {
				try {
					String nombreImagen=Util.guardarImage(multipartFile, request);
					banner.setArchivo(nombreImagen);;
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("Error obtener imagen:"+e.getMessage());
					attributes.addFlashAttribute("msgError","El banner no se ha registrado, ocurrio un error al subir la imagen");
					return "redirect:/banners/index";
				}
				
			}
			
			this.bannerService.insertarBanner(banner);
			//==flag
			attributes.addFlashAttribute("msg", "La imagen del banner se ha guardado correctamente");
			System.out.println(banner);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error metodo guardar imagen banner:"+e.getMessage());
			attributes.addFlashAttribute("msgError","Error:"+e.getMessage());
		}
		return "redirect:/banners/index";
	}
}
