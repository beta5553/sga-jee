package com.qb.sga_jee.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import com.qb.sga_jee.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

	@Override
	public List<Persona> listarPersonas() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona(1, "Juan", "Perez", "Smith", "jperez@gmail.com", "5555555"));
		personas.add(new Persona(1, "Diego", "Fernandez", "Thrower", "jperez@gmail.com", "5555555"));
		personas.add(new Persona(1, "Carlos", "Salvador", "Lopez", "jperez@gmail.com", "5555555"));
		return personas;
	}

	@Override
	public Persona encontrarPersonaPorId(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona encontrarPersonaPorEmail(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}
}
