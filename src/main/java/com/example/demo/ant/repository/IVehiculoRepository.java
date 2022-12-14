package com.example.demo.ant.repository;

import com.example.demo.ant.modelo.Vehiculo;


public interface IVehiculoRepository {

	//CRUD
	public void insertar(Vehiculo matricula);
	public Vehiculo buscarPlaca(String placa);
	public void actualizar(Vehiculo matricula);
	public void eliminarPlaca(String placa);
}
