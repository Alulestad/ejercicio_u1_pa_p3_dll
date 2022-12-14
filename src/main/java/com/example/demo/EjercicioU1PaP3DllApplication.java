package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ant.modelo.Matricula;
import com.example.demo.ant.modelo.Propietario;
import com.example.demo.ant.modelo.Vehiculo;
import com.example.demo.ant.service.IMatriculaService;
import com.example.demo.ant.service.IPropietarioService;
import com.example.demo.ant.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3DllApplication implements CommandLineRunner{

	@Autowired 
	private IMatriculaService iMatriculaService;
	@Autowired 
	private IVehiculoService iVehiculoService;
	@Autowired 
	private IPropietarioService iPropietarioService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3DllApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Propietario propietario1= new Propietario();
		propietario1.setApellido("Llumiquinga");
		propietario1.setCedula("168146465");
		propietario1.setFechaNacimeinto(LocalDateTime.now());
		propietario1.setNombre("Daniel");
		
		iPropietarioService.insertar(propietario1);
		
		Vehiculo vehiculo1=new Vehiculo();
		vehiculo1.setMarca("CHEBROLET");
		vehiculo1.setPlaca("PCI153");
		vehiculo1.setPrecio(new BigDecimal(1000));
		vehiculo1.setTipo("LIVIANO");
		
		iVehiculoService.insertar(vehiculo1);
		
		
		System.out.println("Vehiculo1: "+iVehiculoService.buscarPlaca("PCI153"));
		System.out.println("DESPUES DE MODIFICACION");
		Vehiculo vehiculo2=new Vehiculo();
		vehiculo2.setMarca("KIA");
		vehiculo2.setPlaca("PCI153");
		vehiculo2.setPrecio(new BigDecimal(1200000000));
		vehiculo2.setTipo("LIVIANO");
		iVehiculoService.actualizar(vehiculo2);
		System.out.println("Vehiculo1: "+iVehiculoService.buscarPlaca("PCI153"));
		
		System.out.println("Propietario1: "+iPropietarioService.buscarCedula("168146465"));
		
		
		
		Matricula matricula1= iMatriculaService.matricular("168146465", "PCI153");
		
		System.out.println("matricula1: "+matricula1);
		
		
	}

}
