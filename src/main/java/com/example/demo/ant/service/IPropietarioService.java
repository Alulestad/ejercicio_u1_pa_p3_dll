package com.example.demo.ant.service;

import com.example.demo.ant.modelo.Propietario;

public interface IPropietarioService {
	public void insertar(Propietario propietario);
	public Propietario buscarCedula(String cedula);
	public void actualizar(Propietario propietario);
	public void eliminarCedula(String cedula);
}
