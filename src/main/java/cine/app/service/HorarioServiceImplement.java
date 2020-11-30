package cine.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cine.app.model.Horario;

@Service
public class HorarioServiceImplement implements IHorario{

	private List<Horario>listaHorario= null;
	@Override
	public void insertar(Horario horario) {
		// TODO Auto-generated method stub
		listaHorario.add(horario);
		
		
	}

}
