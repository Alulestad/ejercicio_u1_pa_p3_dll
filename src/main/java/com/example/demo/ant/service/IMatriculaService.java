package com.example.demo.ant.service;

import java.math.BigDecimal;

import com.example.demo.ant.modelo.Matricula;
import com.example.demo.ant.modelo.Propietario;
import com.example.demo.ant.modelo.Vehiculo;

public interface IMatriculaService {
	
	public Matricula matricular(String cedula, String placa);
}
