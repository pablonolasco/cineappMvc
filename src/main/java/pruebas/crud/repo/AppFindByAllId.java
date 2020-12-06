package pruebas.crud.repo;


import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppFindByAllId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		List<Integer>listNoticias= new LinkedList<Integer>();
		listNoticias.add(1);
		listNoticias.add(2);

		Iterable<Noticia> lista=noticiaRepository.findAllById(listNoticias);
		for(Noticia a:lista){
			System.out.println(a);
		}
		
		context.close();
	}

}
