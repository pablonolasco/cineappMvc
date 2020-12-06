package pruebas.jpa;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppFindByAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		Iterable<Noticia> lista=noticiaRepository.findAll();
		for(Noticia a:lista){
			System.out.println(a);
		}
		
		context.close();
	}

}
