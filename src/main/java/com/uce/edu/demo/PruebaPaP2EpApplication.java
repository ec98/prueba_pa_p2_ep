package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.vehiculos.Propietario;
import com.uce.edu.demo.vehiculos.Vehiculo;
import com.uce.edu.demo.vehiculos.service.IMatriculaGestorService;
import com.uce.edu.demo.vehiculos.service.IPropietarioService;
import com.uce.edu.demo.vehiculos.service.IVehiculoService;


@SpringBootApplication
public class PruebaPaP2EpApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	@Autowired
	private Propietario propietario;
	
	@Autowired
	private Propietario propietario2;
	
	@Autowired
	private Vehiculo vehiculo;

	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.vehiculo.setMarca("Totota");
		this.vehiculo.setPlaca("ABD-2021");
		this.vehiculo.setPrecio(new BigDecimal(50000));
		this.vehiculo.setTipo("L");

		this.iVehiculoService.ingresar(this.vehiculo);

		// 2
		//Aplicando scope tipo Singleton
		this.vehiculo.setPrecio(new BigDecimal(40000));
		this.vehiculo.setMarca("Toyota");
		this.iVehiculoService.actualizar(vehiculo);

		// 3
		//Aplicando scope tipo Prototype
		this.propietario.setApellido("Piruch");
		this.propietario.setCedula("1725860553");
		this.propietario.setFechaNacimiento(LocalDateTime.now());
		this.propietario.setNombre("Edwin");
		
		this.propietario2.setNombre("Maria");
		this.propietario2.setApellido("De los Angeles");
		this.propietario2.setCedula("1239322821");
		this.propietario2.setFechaNacimiento(LocalDateTime.now());
		

		this.iPropietarioService.crear(this.propietario);
		this.iPropietarioService.crear(this.propietario2);
		
		//4
		this.iMatriculaGestorService.generar("1725860553", "ABD-2021");
		
	}

}
