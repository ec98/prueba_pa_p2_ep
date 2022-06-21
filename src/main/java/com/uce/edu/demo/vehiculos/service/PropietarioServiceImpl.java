package com.uce.edu.demo.vehiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vehiculos.Propietario;
import com.uce.edu.demo.vehiculos.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.crear(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario = new Propietario();
		propietario.setCedula(cedula);
		this.iPropietarioRepository.eliminar(propietario);
	}

}
