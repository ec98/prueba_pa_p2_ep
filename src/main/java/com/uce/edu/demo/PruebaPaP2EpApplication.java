package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.vehiculos.Matricula;
import com.uce.edu.demo.vehiculos.Propietario;
import com.uce.edu.demo.vehiculos.Vehiculo;
import com.uce.edu.demo.vehiculos.service.IMatriculaService;
import com.uce.edu.demo.vehiculos.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2EpApplication implements CommandLineRunner {

	@Autowired
	private Propietario propietario;

	@Autowired
	private Vehiculo vehiculo;
	
	@Autowired
	private Vehiculo vehiculo1;

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// 1
		this.propietario.setNombre("Edwin");
		this.propietario.setApellido("Piruch");
		this.propietario.setCedula("1725860553");

		System.out.println(this.propietario);

		// 2
		this.vehiculo.setMarca("Toyo");
		this.vehiculo.setModelo("Toyota");
		this.vehiculo.setPlaca("PDU-2021");
		this.vehiculo.setPrecio(new BigDecimal("1200"));
		this.vehiculo.setTipo("Pesado");

		this.vehiculo.setPlaca("ABD-1932");

		// 3
		// Aplicando scope tipo PROTOTYPE EP
		this.iVehiculoService.actualizar(vehiculo);

		// 4
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.of(2020, 8, 23, 14, 32, 12));
		matricula.setPropietario(propietario);
		matricula.setValor(new BigDecimal("1500"));
		matricula.setVehiculo(vehiculo);
				
		this.vehiculo1.setMarca("Mercedes");
		this.vehiculo1.setModelo("Mazda");
		this.vehiculo1.setPlaca("EDP-2321");
		this.vehiculo1.setPrecio(new BigDecimal("2500"));
		this.vehiculo1.setTipo("Liviano");
		
		//Comprobando calculo valor de matricula del vehiculo 1 PESADO
		this.iMatriculaService.crear(matricula);
		this.iMatriculaService.calcular(matricula, vehiculo);
		
		Matricula matricula1 = new Matricula();
		matricula1.setFecha(LocalDateTime.of(2022, 2, 12, 21, 12, 22));
		matricula1.setPropietario(propietario);
		matricula1.setValor(new BigDecimal("2500"));
		matricula1.setVehiculo(vehiculo1);
		
		//Comprobando calculo valor de matricula del vehiculo 1 LIVIANO
		this.iMatriculaService.crear(matricula1);
		this.iMatriculaService.calcular(matricula, vehiculo1);
	}

}
