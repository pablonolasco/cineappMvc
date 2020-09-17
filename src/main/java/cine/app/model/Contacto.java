package cine.app.model;

import java.io.Serializable;
import java.util.Arrays;

public class Contacto implements Serializable{

	private int id;
	private String nombre;
	private String email;
	private int raiting;
	private String [] generos;
	private String [] notificaciones;
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

	public int getRaiting() {
		return raiting;
	}

	public void setRaiting(int raiting) {
		this.raiting = raiting;
	}

	public String[] getGeneros() {
		return generos;
	}

	public void setGeneros(String[] generos) {
		this.generos = generos;
	}

	public String[] getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(String[] notificaciones) {
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
		return "Contacto [id=" + id + ", nombre=" + nombre + ", email=" + email + ", raiting=" + raiting + ", generos="
				+ Arrays.toString(generos) + ", notificaciones=" + Arrays.toString(notificaciones) + ", comentarios="
				+ comentarios + "]";
	}
	
	
	
	
	
	
}