package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@SuppressWarnings("unused")
@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRepository{
	
	/*@Query("select p from Profesor p where p.carrera.nombre = ?1")
	public Iterable<Persona> findProfesoresByCarrera(String carrera);
*/
}
