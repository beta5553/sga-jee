package mx.com.gm.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaServiceRemote;

public class ClientePersonaService {
	
	public static void main (String [] args) {
		
		try {
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
			
			//PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("");
			
			List<Persona> personas = personaService.listarPersonas();
			
			for (Persona persona: personas){
				System.out.println(persona);
			}
			
			System.out.println("\n Fin de llamada EJB desde el clinete local");
		}
		catch (NamingException e){
			e.printStackTrace();
		}
	}
}
