package com.ibm.academia.restapi.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.servicios.EmpleadoDAO;
import com.ibm.academia.restapi.universidad.servicios.PersonaDAO;

@SuppressWarnings("unused")
@Component
public class TestEmpleado implements CommandLineRunner{

	@Autowired
	@Qualifier("empleadoDAOImpl")
	private PersonaDAO personaDAO;
	
	@Override
	public void run(String... args) throws Exception {
		
		//BUSCAR EMPLEADO TIPO EMPLEADO
		Iterable<Persona> tipoEmpleado = ((EmpleadoDAO)personaDAO).findEmpleadoByTipoEmpleado(TipoEmpleado.MANTENIMIENTO); 
		tipoEmpleado.forEach(System.out::println);
	}

}
