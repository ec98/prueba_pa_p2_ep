package com.uce.edu.demo.vehiculos.repository;

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
	public void eliminar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando el propietario "+p);
	}

}
