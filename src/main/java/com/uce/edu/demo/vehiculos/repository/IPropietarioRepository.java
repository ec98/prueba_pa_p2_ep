package com.uce.edu.demo.vehiculos.repository;

import com.uce.edu.demo.vehiculos.Propietario;

public interface IPropietarioRepository {

	public void crear(Propietario p);

	public void eliminar(String cedula);

	public Propietario consultar(String cedula);
}
