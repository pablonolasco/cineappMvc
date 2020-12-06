package pruebas.crud.repo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppDeleteAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		Iterable<Noticia> lista=noticiaRepository.findAll();
		//==se elimina todos los registros
		noticiaRepository.deleteAll();
		context.close();
	}

}
