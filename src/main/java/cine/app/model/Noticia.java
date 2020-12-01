package cine.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//==liberia para persistir la clase
@Entity
//==nombre de la tabla donde se almacenara la entidad
@Table(name="noticias")
public class Noticia {
	
	/*
	 * es necesario que JPA identifique que 
	 * columna mapea contra cada atributo de la clase y es aquí donde entra @Column.
	 * Solo se usa cuando el nombre del campo es diferente al de la clase en la base de datos 
	 */
	
	//==indica campo como llave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//==dependiendo del gestor se indica la variable para referenciar que es autoincrement
	@Column(name = "id", nullable = false)
	private int nId;
	
	@Column(name = "titulo", nullable = true)
	private String nTitulo;
	@Column(name = "fecha", nullable = true)
	private Date nFecha;
	@Column(name = "detalle", nullable = true)
	private String nDetalle;
	@Column(name = "estatus", nullable = true)
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
