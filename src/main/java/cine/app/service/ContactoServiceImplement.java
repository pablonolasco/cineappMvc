package cine.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cine.app.model.Contacto;
@Service
public class ContactoServiceImplement implements IContacto{

	private List<Contacto>listContacto=null;
	@Override
	public void insertar(Contacto contacto) {
		// TODO Auto-generated method stub
		try {
			listContacto.add(contacto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
