package com.uce.edu.demo.vehiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vehiculos.Vehiculo;
import com.uce.edu.demo.vehiculos.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void ingresar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.ingresar(v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(placa);
	}
	
	
}
