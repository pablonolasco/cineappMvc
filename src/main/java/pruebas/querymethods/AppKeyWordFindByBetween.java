package pruebas.querymethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cine.app.model.Noticia;
import cine.app.repository.NoticiaRepository;

public class AppKeyWordFindByBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("root-context.xml");
		NoticiaRepository noticiaRepository= context.getBean("noticiaRepository",NoticiaRepository.class);
		//List<Noticia> lista=noticiaRepository.findBynEstatus("Activa");
		SimpleDateFormat fecha= new SimpleDateFormat("yyyy-MM-dd");
		List<Noticia> listaFecha;
		try {
			listaFecha = noticiaRepository.findBynFechaBetweennFecha(fecha.parse("2020-12-1"), fecha.parse("2020-12-2"));
			for(Noticia noticia:listaFecha) {
				System.out.println(noticia);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		context.close();
	}

}
