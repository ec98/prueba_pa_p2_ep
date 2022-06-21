package com.uce.edu.demo.vehiculos.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vehiculos.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Creando matricula "+m);
	}

	@Override
	public void eliminar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando matricula "+m);
	}

}
