package pruebas.jpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.repository.NoticiaRepository;

public class AppDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository", NoticiaRepository.class);

		int idNoticia=1;
		if (noticiaRepository.existsById(idNoticia)) {
			noticiaRepository.deleteById(idNoticia);
		}
		
		context.close();

	}

}
