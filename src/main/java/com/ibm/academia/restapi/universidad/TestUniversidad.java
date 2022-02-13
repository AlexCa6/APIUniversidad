package com.ibm.academia.restapi.universidad;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;
import com.ibm.academia.restapi.universidad.servicios.AlumnoDAO;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;
import com.ibm.academia.restapi.universidad.servicios.EmpleadoDAO;
import com.ibm.academia.restapi.universidad.servicios.ProfesorDAO;

@SuppressWarnings("unused")
@Component
public class TestUniversidad implements CommandLineRunner{

	@Autowired
	private CarreraDAO carreraDAO;
	
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	@Autowired
	private ProfesorDAO profesorDAO;
	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@Override
	public void run(String... args) throws Exception {
		
		//TODO INSERT
		
		/*Carrera ingenieriaSistemas = new Carrera(null, "Sistemas", 60, 5, "alexca");
		Carrera carrera = carreraDAO.guardar(ingenieriaSistemas);
		System.out.println(carrera.toString());*/
		
		/*Direccion direccionAlumno = new Direccion("Calle Molotla", "18", "62855", "1", "1", "CDMX");
		Persona alumno = new Alumno(null, "Enrique", "Perez", "789556663", "alexca", direccionAlumno);
		Persona personaAlumno = alumnoDAO.guardar(alumno);
		System.out.println(personaAlumno.toString());
		*/
		//INSERT PROFESOR
		/*BigDecimal sueldoProfesor = new BigDecimal(15000);
		Direccion direccionProfesor = new Direccion("Calle Jicote","151","01750","85","96","CDMX");
		Persona profesor = new Profesor(null, "Juan","Canizal","998877663","alexca", direccionProfesor, sueldoProfesor);
		Persona personaProfesor = profesorDAO.guardar(profesor);
		System.out.println(personaProfesor.toString());*/
		
		//INSERT EMPLEADO
		/*BigDecimal sueldoEmpleado = new BigDecimal(1100);
		Direccion direccionEmpleado = new Direccion("Calle Uno", "1", "10053", "11", "12", "Colima");
		Persona empleado = new Empleado(null, "Jose", "Perez", "112233456", "alexca", direccionEmpleado, sueldoEmpleado, TipoEmpleado.ADMINISTRATIVO);
		Persona personaEmpleado = empleadoDAO.guardar(empleado);
		System.out.println(personaEmpleado);*/
		//TODO CONSULTA
		/*List<Persona> alumnos = (List<Persona>)alumnoDAO.buscarTodos();
		alumnos.forEach(System.out::println);*/
		
		//Carrera carrera = null;
		/*Carrera carrera = new Carrera(null, "Quimica", 59, 5, "alexca");
		
		Optional<Carrera> oCarrera = carreraDAO.buscarPorId(5L);
		
		if(oCarrera.isPresent()) {
			
			carrera = oCarrera.get();
			System.out.println(carrera.toString());
			
		}else {
			
			System.out.println("Carrera no existe");
			
		}
		
		//TODO UPDATE
		
		carrera.setCantidadAnios(3);
		carrera.setCantidadMaterias(10);
		carreraDAO.guardar(carrera);
		
		System.out.println("Carrera Actualizada: " + carreraDAO.buscarPorId(1L).orElse(new Carrera()).toString());
		*/
		//TODO Delete
		/*carreraDAO.eliminarPorId(2L);
		System.out.println("Eliminado")*/;
		/*profesorDAO.eliminarPorId(2L);
		System.out.println("ELIMINADO");*/
	}

}