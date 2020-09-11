package cine.app.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import cine.app.model.Pelicula;

@Service
public class PeliculaServiceImplement implements IPeliculasService {

	private List<Pelicula> lista = null;

	public PeliculaServiceImplement() {
		this.getLista();
	}

	public void getLista() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		try {
			lista = new LinkedList<>();
			Pelicula pelicula1 = new Pelicula(1, "la momia", 2, "A", "Accion", format.parse("02-05-2017"));
			Pelicula pelicula2 = new Pelicula(2, "Ted", 2, "C", "Comedia", format.parse("22-07-2017"));
			pelicula2.setpImage("estreno1.png");
			Pelicula pelicula3 = new Pelicula(3, "rapidos y furiosos", 2, "C", "Accion", format.parse("12-10-2017"));
			pelicula3.setpImage("estreno1.png");
			pelicula3.setpStatus("Activa");
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);

		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage());
		}

	}

	@Override
	public List<Pelicula> buscarTodas() {
		// TODO Auto-generated method stub
		return this.lista;
	}

	@Override
	public Pelicula buscarPelicula(int id) {
		// TODO Auto-generated method stub
		
		for (Pelicula pelicula : lista) {

			if (pelicula.getpId() == id) {
				return pelicula;
			}
			
		}
		
		return null;

	}

	@Override
	public int insertar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.lista.add(pelicula);
		return 0;
	}

}
