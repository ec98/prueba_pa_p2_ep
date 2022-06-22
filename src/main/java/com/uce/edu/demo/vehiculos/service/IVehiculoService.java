package com.uce.edu.demo.vehiculos.service;

import com.uce.edu.demo.vehiculos.Vehiculo;

public interface IVehiculoService {
	
	public void ingresar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo v);

	public void eliminar(String placa);
}
