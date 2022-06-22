package com.uce.edu.demo.vehiculos.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vehiculos.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void ingresar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Ingresando el vehiculo " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Buscando el vehiculo con la placa  " + placa);
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setMarca("ABD-1992");
		vehiculo.setModelo("Mazda");
		vehiculo.setPrecio(new BigDecimal(54022));
		vehiculo.setTipo("Pesado");
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando vehiculo " + v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando vehiculo " + placa);
	}

}
