package prueba.jpa.repo;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppFindAllOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		//List<Noticia> lista=noticiaRepository.findAll(Sort.by("nTitulo").descending());
		List<Noticia> lista=noticiaRepository.findAll(Sort.by("nTitulo").ascending().and(Sort.by("nFecha").ascending()));

		for(Noticia a:lista){
			System.out.println(a);
		}
		
		context.close();
	}

}
