/**
 * 
 */
package cine.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Windows10
 *
 */
@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int pId;

	@Column(name = "titulo", nullable = false)
	private String pTitulo;

	@Column(name = "duracion", nullable = true)
	private int pDuracion;

	@Column(name = "duracion", nullable = false)
	private String pClasificacion;

	@Column(name = "genero", nullable = false)
	private String pGenero;

	@Column(name = "image", nullable = false)
	private String pImage = "cinema.png";// ===imagen por defecto

	@Column(name = "fechaEstreno", nullable = false)
	private Date pFechaEstreno;

	@Column(name = "estatus", nullable = false)
	private String pStatus = "Activa";

	@Transient//==ignora este atributo durante la persistencia
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
