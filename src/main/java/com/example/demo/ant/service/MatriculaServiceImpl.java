package com.example.demo.ant.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Service;

import com.example.demo.ant.modelo.Matricula;
import com.example.demo.ant.modelo.Propietario;
import com.example.demo.ant.modelo.Vehiculo;
import com.example.demo.ant.repository.IMatriculaRepository;
import com.example.demo.ant.repository.IPropietarioRepository;
import com.example.demo.ant.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public Matricula matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario propietario=new Propietario();
		propietario=iPropietarioRepository.buscarCedula(cedula);
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo=iVehiculoRepository.buscarPlaca(placa);
		
		BigDecimal valorVehiculo=vehiculo.getPrecio();
		BigDecimal valorMatr=new BigDecimal(0);
		if (vehiculo.getTipo().equals("PESADO")){
			valorMatr=valorVehiculo.multiply(new BigDecimal(0.15));
		}else if(vehiculo.getTipo().equals("LIVIANO")) {
			valorMatr=valorVehiculo.multiply(new BigDecimal(0.10));
		}
		System.out.println("Procesando.... valor por tipo: "+valorMatr);
		
		BigDecimal valorApagar=this.aplicarDescuento(valorMatr);
		
		Matricula matriculas= new Matricula();
		
		
		matriculas.setFecha(LocalDateTime.now());
		matriculas.setId(cedula.concat(placa));
		matriculas.setPropietario(propietario);
		matriculas.setValro(valorApagar);
		matriculas.setVehiculo(vehiculo);
		
		
		
		iMatriculaRepository.insertar(matriculas);
		
		
		System.out.println("Procesando.... valor con descuento: "+valorApagar);
		return matriculas;
	}
	
	private BigDecimal aplicarDescuento(BigDecimal valor) {
		BigDecimal valorConDescuento= valor;
		BigDecimal descuento= new BigDecimal(0);
		

		if (valor.floatValue()>2000) {
			
			descuento=descuento.add(valor.multiply(new BigDecimal(0.07)));
			
		}else {
			valorConDescuento=valor;
		}

		valorConDescuento=valorConDescuento.subtract(descuento);


		return valorConDescuento;
		
	}

}
