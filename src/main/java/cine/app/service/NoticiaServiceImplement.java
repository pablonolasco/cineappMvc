package cine.app.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import cine.app.model.Noticia;
@Service
public class NoticiaServiceImplement implements INoticiaService {

	public NoticiaServiceImplement() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void guardar(Noticia noticia){
		// TODO Auto-generated method stub
		System.out.print(noticia);
	}

}
