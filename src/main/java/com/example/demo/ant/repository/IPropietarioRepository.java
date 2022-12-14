package com.example.demo.ant.repository;

import com.example.demo.ant.modelo.Propietario;

public interface IPropietarioRepository {
	//CRUD
	
	public void insertar(Propietario propietario);
	public Propietario buscarCedula(String cedula);
	public void actualizar(Propietario propietario);
	public void eliminarCedula(String cedula);
}
