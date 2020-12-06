package prueba.jpa.repo;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppDeleteAllBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		List<Noticia> lista=noticiaRepository.findAll();
		//==se elimina todos los registros es mas eficiente que el de la libreria crud
		//==debido que hace un delete masivo y no uno por uno
		noticiaRepository.deleteAllInBatch();
		context.close();
	}

}
