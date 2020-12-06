package cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cine.app.model.Noticia;

@Repository
//public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {
public interface NoticiaRepository extends JpaRepository<Noticia, Integer> {

	/**
	 * La interfaz principal de Spring Data Repositories es la interfaz Repository
	 * CrudRepository, No tenemos que escribir nada de c�digo SQL para crear, leer,
	 * actualizar y borrar registros. La interfaz CrudRepository de Spring lleva dos
	 * par�metros: Una clase de dominio o modelo (ej. Pelicula, Noticia, Banner). El
	 * tipo del Id de la clase de dominio (el. Integer, Long)
	 * 
	 * PagingAndSortingRepository: Esta interfaz extiende la interfaz CrudRepository
	 * y agrega m�todos adicionales para recuperar entidades usando paginaci�n y
	 * ordenamiento.
	 * 
	 * JpaRepository: Esta Interfaz extiende la interfaz PagingAndSortingRepository
	 * y agrega funcionalidad espec�fica para la tecnolog�a JPA.
	 */
}
