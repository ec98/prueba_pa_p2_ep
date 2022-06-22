package com.uce.edu.demo.vehiculos.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vehiculos.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Creando el propietario "+p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando el propietario "+cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario prope = new Propietario();
		prope.setApellido(cedula);
		prope.setNombre("Edwin");
		prope.setApellido("Piruch");
		prope.setFechaNacimiento(LocalDateTime.now());
		return prope;
	}
	
	

}
