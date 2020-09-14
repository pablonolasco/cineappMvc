/**
 * 
 */
package cine.app.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Windows10
 *
 */
public class Pelicula implements Serializable{
	private int pId;
	private String pTitulo;
	private int pDuracion;
	private String pClasificacion;
	private String pGenero;
	private String pImage="cinema.png";//===imagen por defecto
	private Date pFechaEstreno;
	private String pStatus="Activa";
	private Detalle detalle;
	
	public Pelicula() {
		super();
	}
	public Pelicula(int pId, String pTitulo, int pDuracion, String pClasificacion, String pGenero, Date pFechaEstreno) {
		super();
		this.pId = pId;
		this.pTitulo = pTitulo;
		this.pDuracion = pDuracion;
		this.pClasificacion = pClasificacion;
		this.pGenero = pGenero;
		this.pFechaEstreno = pFechaEstreno;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpTitulo() {
		return pTitulo;
	}
	public void setpTitulo(String pTitulo) {
		this.pTitulo = pTitulo;
	}
	public int getpDuracion() {
		return pDuracion;
	}
	public void setpDuracion(int pDuracion) {
		this.pDuracion = pDuracion;
	}
	public String getpClasificacion() {
		return pClasificacion;
	}
	public void setpClasificacion(String pClasificacion) {
		this.pClasificacion = pClasificacion;
	}
	public String getpGenero() {
		return pGenero;
	}
	public void setpGenero(String pGenero) {
		this.pGenero = pGenero;
	}
	public String getpImage() {
		return pImage;
	}
	public void setpImage(String pImage) {
		this.pImage = pImage;
	}
	public Date getpFechaEstreno() {
		return pFechaEstreno;
	}
	public void setpFechaEstreno(Date pFechaEstreno) {
		this.pFechaEstreno = pFechaEstreno;
	}
	public String getpStatus() {
		return pStatus;
	}
	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}
	
	public Detalle getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "Pelicula [pId=" + pId + ", pTitulo=" + pTitulo + ", pDuracion=" + pDuracion + ", pClasificacion="
				+ pClasificacion + ", pGenero=" + pGenero + ", pImage=" + pImage + ", pFechaEstreno=" + pFechaEstreno
				+ ", pStatus=" + pStatus + ", detalle=" + detalle + "]";
	}
	


	
}
