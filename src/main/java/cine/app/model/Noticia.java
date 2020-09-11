package cine.app.model;

import java.util.Date;

public class Noticia {
	private int nId;
	private String nTitulo;
	private Date nFecha;
	private String nDetalle;
	private String nEstatus;

	public Noticia() {
		this.nFecha=new Date();
		this.nEstatus="Activa";
	}

	public int getnId() {
		return nId;
	}

	public void setnId(int nId) {
		this.nId = nId;
	}

	public Date getnFecha() {
		return nFecha;
	}

	
	public String getnTitulo() {
		return nTitulo;
	}

	public void setnTitulo(String nTitulo) {
		this.nTitulo = nTitulo;
	}

	public void setnFecha(Date nFecha) {
		this.nFecha = nFecha;
	}

	public String getnDetalle() {
		return nDetalle;
	}

	public void setnDetalle(String nDetalle) {
		this.nDetalle = nDetalle;
	}

	public String getnEstatus() {
		return nEstatus;
	}

	public void setnEstatus(String nEstatus) {
		this.nEstatus = nEstatus;
	}

	@Override
	public String toString() {
		return "Noticia [nId=" + nId + ", nFecha=" + nFecha + ", nDetalle=" + nDetalle + ", nEstatus=" + nEstatus + "]";
	}
	
	
}
