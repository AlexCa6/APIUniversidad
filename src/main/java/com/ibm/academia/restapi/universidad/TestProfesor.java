package com.ibm.academia.restapi.universidad;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;
import com.ibm.academia.restapi.universidad.servicios.PersonaDAO;
import com.ibm.academia.restapi.universidad.servicios.ProfesorDAO;

@SuppressWarnings("unused")
@Component
public class TestProfesor implements CommandLineRunner{

	@Autowired
	private CarreraDAO carreraDAO;
	
	@Autowired
	@Qualifier("profesorDAOImpl")
	private PersonaDAO personaDAO; 
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
	}
	
	

}
