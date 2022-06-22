package com.uce.edu.demo.vehiculos.repository;

import com.uce.edu.demo.vehiculos.Vehiculo;

public interface IVehiculoRepository {

	public void ingresar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo v);

	public void eliminar(String placa);
}
