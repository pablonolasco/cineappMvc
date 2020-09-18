package cine.app.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Contacto implements Serializable{

	private int id;
	private String nombre;
	private String email;
	private int rating;
	private String [] generos;
	private List<String>notificaciones;
	private String comentarios;
	
	public Contacto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int raiting) {
		this.rating = raiting;
	}

	public String[] getGeneros() {
		return generos;
	}

	public void setGeneros(String[] generos) {
		this.generos = generos;
	}

	public List<String> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<String> notificaciones) {
		this.notificaciones = notificaciones;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", email=" + email + ", raiting=" + rating + ", generos="
				+ Arrays.toString(generos) + ", notificaciones=" + notificaciones + ", comentarios=" + comentarios
				+ "]";
	}


	
	
	
	
	
}
