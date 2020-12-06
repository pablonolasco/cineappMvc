package pruebas.crud.repo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.repository.NoticiaRepository;

public class AppCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		long count=noticiaRepository.count();
		System.out.println(count);
		context.close();
	}

}
