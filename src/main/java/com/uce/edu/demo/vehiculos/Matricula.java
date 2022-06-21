package com.uce.edu.demo.vehiculos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Matricula {

	private LocalDateTime fecha;
	private BigDecimal valor;

	//Aplicando DI por atributos EP
	@Autowired
	private Propietario propietario;

	@Autowired
	private Vehiculo vehiculo;

	@Override
	public String toString() {
		return "Matricula [fecha=" + fecha + ", valor=" + valor + ", propietario=" + propietario + ", vehiculo="
				+ vehiculo + "]";
	}

	// GET Y SET
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
