package com.uce.edu.demo.vehiculos.service;

import java.math.BigDecimal;

import com.uce.edu.demo.vehiculos.Matricula;
import com.uce.edu.demo.vehiculos.Vehiculo;

public interface IMatriculaService {

	public void crear(Matricula m);
	public void eliminar(Matricula m);
	
	public BigDecimal calcular(Matricula m, Vehiculo v);
}
