package cine.app.service;

import java.util.List;

import cine.app.model.Pelicula;

public interface IPeliculasService {
	public abstract int insertar(Pelicula pelicula);
	public abstract List<Pelicula> buscarTodas();
	public abstract Pelicula buscarPelicula(int id);
	public abstract List<String>buscarGeneros();
	public abstract List<String>buscarClasificacion();

}
