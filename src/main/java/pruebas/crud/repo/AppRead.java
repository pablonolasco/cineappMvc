package pruebas.crud.repo;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppRead {

	public static void main(String [] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository=context.getBean("noticiaRepository", NoticiaRepository.class);
		Optional<Noticia> noticia=noticiaRepository.findById(1);
		System.out.println(noticia.get());
		context.close();
	}
}
