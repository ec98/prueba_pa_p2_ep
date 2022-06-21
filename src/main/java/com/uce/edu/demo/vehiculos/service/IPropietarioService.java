package com.uce.edu.demo.vehiculos.service;

import com.uce.edu.demo.vehiculos.Propietario;

public interface IPropietarioService {
	public void crear(Propietario p);
	public void eliminar(String cedula);
}
