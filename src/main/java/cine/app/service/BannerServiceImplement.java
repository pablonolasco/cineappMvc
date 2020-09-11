package cine.app.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import cine.app.model.Banner;
@Service
public class BannerServiceImplement implements IBannerService{

	private List<Banner> listaBanner=null;
	
	public BannerServiceImplement() {
		// TODO Auto-generated constructor stub
		this.getListaBanner();
	}
	@Override
	public void insertarBanner(Banner banner) {
		// TODO Auto-generated method stub
		listaBanner.add(banner);
	}
	
	public void getListaBanner() {
		try {
			listaBanner= new LinkedList<>();
			Banner banner1= new Banner();
			banner1.setId(1);
			banner1.setTitulo("Imagen 1");
			banner1.setArchivo("images/slide1.jpg");
			Banner banner2= new Banner();
			banner2.setId(2);
			banner2.setTitulo("Imagen 2");
			banner2.setArchivo("images/slide2.jpg");
			banner2.setEstatus("inactiva");
			Banner banner3= new Banner();
			banner3.setId(3);
			banner3.setTitulo("Imagen 3");
			banner3.setArchivo("images/slide3.jpg");
			Banner banner4= new Banner();
			banner4.setId(4);
			banner4.setTitulo("Imagen 4");
			banner4.setArchivo("images/slide4.jpg");
			this.listaBanner.add(banner1);
			this.listaBanner.add(banner2);
			this.listaBanner.add(banner3);
			this.listaBanner.add(banner4);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println();
		}
	}

	@Override
	public List<Banner> buscarTodas() {
		// TODO Auto-generated method stub
		return this.listaBanner;
	}

}
