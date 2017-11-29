package mx.com.gm.cliente;

import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaServiceRemote;

public class ClientePerssonaServiceConIP {
	
public static void main (String [] args) {
		
		try {
			Properties props = new Properties();
			props.setProperty("java.naming.factoty.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
			props.setProperty("java.naming.factoty.url.pkgs", "com.sun.enterprise.naming");
			props.setProperty("java.naming.factoty.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactory");
			
			props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1"); //Localhost. 
			
			//Only change port if it is not 3700
			//props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
			
			Context jndi = new InitialContext(props);
			PersonaServiceRemote personaService = (PersonaServiceRemote)
					jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemoteConIP");
			
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
