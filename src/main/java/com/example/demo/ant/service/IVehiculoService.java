package com.example.demo.ant.service;

import com.example.demo.ant.modelo.Vehiculo;

public interface IVehiculoService {
	public void insertar(Vehiculo matricula);
	public Vehiculo buscarPlaca(String placa);
	public void actualizar(Vehiculo matricula);
	public void eliminarPlaca(String placa);
}
