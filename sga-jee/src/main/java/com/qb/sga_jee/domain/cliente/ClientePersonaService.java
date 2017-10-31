package com.qb.sga_jee.domain.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.qb.sga_jee.domain.Persona;
import com.qb.sga_jee.servicio.PersonaServiceRemote;

public class ClientePersonaService {
	
	public static void main (String [] args) {
		
		try {
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote)
					jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.qb.sga_jee.servicio.PersonaServiceRemote");
			
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
