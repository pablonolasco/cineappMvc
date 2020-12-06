package prueba.jpa.repo;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppFindAllPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		//==numero de pagina numero de registros por pagina
		//Page<Noticia> lista=noticiaRepository.findAll(PageRequest.of(0, 1));
		//==numero de pagina numero de registros por pagina con ordenamiento
				Page<Noticia> lista=noticiaRepository.findAll(PageRequest.of(0, 1, Sort.by("nTitulo").descending()));
		for(Noticia a:lista){
			System.out.println(a);
		}
		
		context.close();
	}

}
