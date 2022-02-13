package com.ibm.academia.restapi.universidad;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.servicios.AlumnoDAO;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;
import com.ibm.academia.restapi.universidad.servicios.PersonaDAO;

@SuppressWarnings("unused")
@Component
public class TestAlumnoJPQL implements CommandLineRunner{
	
	@Autowired
	private CarreraDAO carreraDAO;
	
	@Autowired
	@Qualifier("alumnoDAOImpl")
	private PersonaDAO personaDAO;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Optional<Carrera> industrial = carreraDAO.buscarPorId(3L);
		
		Iterable<Persona> alumnos = personaDAO.buscarTodos();
		
		
		alumnos.forEach(alumno -> {
			((Alumno)alumno).setCarrera(industrial.get());
			personaDAO.guardar(alumno);
		});*/
		
		/*alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(sistemas.get()));
		alumnos.forEach(alumno -> personaDAO.guardar(alumno));*/
		
		/*Optional<Persona> alumnoUno = personaDAO.buscarPorId(2L);
		Optional<Persona> personaNombreApellido = personaDAO.buscarPorNombreYApellido(alumnoUno.get().getNombre(), alumnoUno.get().getApellido());
		System.out.println(personaNombreApellido.toString());
		
		Optional<Persona> personaDNI = personaDAO.buscarPorDni(alumnoUno.get().getDni());
		System.out.println(personaDNI.toString());
		
		Iterable<Persona> personasApellido = personaDAO.buscarPersonaPorApellido(alumnoUno.get().getApellido());
		personasApellido.forEach(System.out::println);*/
		
		/*Optional<Carrera> sistemas = carreraDAO.buscarPorId(4L);
		Iterable<Persona> alumnosCarrera = ((AlumnoDAO)personaDAO).buscarAlumnosPorNombreCarrera(sistemas.get().getNombre());
		alumnosCarrera.forEach(System.out::println);*/
	}

}
