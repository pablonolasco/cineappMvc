package pruebas.crud.repo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.repository.NoticiaRepository;

public class AppExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository", NoticiaRepository.class);
		//==metodo que verifica si existe un registro o entidad en la base de datos
		int idNoticia=0;
		System.out.println(noticiaRepository.existsById(idNoticia));
		context.close();
		

	}

}
