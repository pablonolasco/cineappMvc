package cine.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cine.app.model.Noticia;
@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {

}
