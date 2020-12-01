/**
 * 
 */
package pruebas.jpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
//import cine.app.repository.NoticiaRepository;

/**
 * @author OPTIPLEX 9010
 *
 */
public class AppCreate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Noticia noticia = new Noticia();
			noticia.setnTitulo("Super man");
			noticia.setnDetalle("El hombre de acero");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
			//INoticiaRepository noticiaRepository = context.getBean("iNoticiaRepository", INoticiaRepository.class);
	//		NoticiaRepository repository=context.getBean("noticiaRepository", NoticiaRepository.class);
		//	repository.save(noticia);
			context.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

	}

}
