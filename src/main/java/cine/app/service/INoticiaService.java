package cine.app.service;

import java.sql.SQLException;

import cine.app.model.Noticia;
public interface INoticiaService {

	public abstract void guardar(Noticia noticia);
}
