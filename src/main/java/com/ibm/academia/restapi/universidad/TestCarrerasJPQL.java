package com.ibm.academia.restapi.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;

import java.util.List;

@SuppressWarnings("unused")
@Component
public class TestCarrerasJPQL implements CommandLineRunner{

	@Autowired
	private CarreraDAO carreraDAO;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60, 5, "alexca");
		Carrera ingindustrial = new Carrera(null, "Ingenieria Industrial", 55, 5, "alexca");
		Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos", 53, 5, "alexca");
		Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica", 45, 5, "alexca");
		Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas", 40, 4, "alexca");
		Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo", 42, 4, "alexca");
		Carrera licYoga = new Carrera(null, "Licenciatura en Yoga", 25, 5, "alexca");
		Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos", 35, 5, "alexca");
		
		carreraDAO.guardar(ingSistemas);
		carreraDAO.guardar(ingindustrial);
		carreraDAO.guardar(ingAlimentos);
		carreraDAO.guardar(ingElectronica);
		carreraDAO.guardar(licSistemas);
		carreraDAO.guardar(licTurismo);
		carreraDAO.guardar(licYoga);
		carreraDAO.guardar(licRecursos);*/
		
		/*List<Carrera> carreras = (List<Carrera>) carreraDAO.findCarrerasByNombreContains("Sistemas");
		carreras.forEach(System.out::println);*/
		/*List<Carrera> carrerasIgnoreCaseUno = (List<Carrera>) carreraDAO.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
		carrerasIgnoreCaseUno.forEach(System.out::println);*/
		/*List<Carrera> carrerasIgnoreCaseUno = (List<Carrera>) carreraDAO.findCarrerasByCantidadAniosAfter(3);
		carrerasIgnoreCaseUno.forEach(System.out::println);*/
		
	}
	
	

}
