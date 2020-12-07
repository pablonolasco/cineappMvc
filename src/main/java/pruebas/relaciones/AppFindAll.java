package pruebas.relaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

import cine.app.model.Pelicula;
import cine.app.repository.PeliculaRepository;

public class AppFindAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
			PeliculaRepository peliculaRepository = context.getBean("peliculaRepository", PeliculaRepository.class);
			List<Pelicula> lista = peliculaRepository.findAll();
			for (Pelicula pelicula : lista) {
				System.out.println(pelicula);
			}
			context.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		

	}

}
