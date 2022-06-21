package com.uce.edu.demo.vehiculos.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vehiculos.Matricula;
import com.uce.edu.demo.vehiculos.Vehiculo;
import com.uce.edu.demo.vehiculos.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.crear(m);
	}

	@Override
	public void eliminar(Matricula m) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(m);
	}

	@Override
	public BigDecimal calcular(Matricula m, Vehiculo v) {
		// TODO Auto-generated method stub

		if (v.getTipo().equals("Pesado") && m.getValor().compareTo(BigDecimal.ZERO) < 2000) {
			System.out.println("OBTENIENDO VEHICULO TIPO PESADO");
			m.setValor(new BigDecimal("100").multiply(new BigDecimal("0.12")));
		} else {
			System.out.println("OBTENIENDO VEHICULO TIPO LIVIANO");
			m.setValor(new BigDecimal("100").multiply(new BigDecimal("0.14")).divide(new BigDecimal("0.7")));

		}

		return m.getValor();
	}

}
