package com.qb.sga_jee.servicio;

import java.util.List;
import javax.ejb.Remote;
import com.qb.sga_jee.domain.Persona;

@Remote
public interface PersonaServiceRemote {
	
	public List<Persona> listarPersonas();
	public Persona encontrarPersonaPorId(Persona persona);
	public Persona encontrarPersonaPorEmail(Persona persona);
	public void registrarPersona(Persona persona);
	public void modificarPersona(Persona persona);
	public void eliminarPersona(Persona persona);

}
