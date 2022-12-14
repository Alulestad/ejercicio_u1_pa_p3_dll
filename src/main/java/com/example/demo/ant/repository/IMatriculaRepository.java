package com.example.demo.ant.repository;

import com.example.demo.ant.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD
	
	public void insertar(Matricula matricula);
	public Matricula buscar(String id);
	public void actualizar(Matricula matricula);
	public void eliminar(String id);
	

}
