package com.example.demo.ant.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ant.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	private static List<Matricula> baseDatos=new ArrayList<>();
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		baseDatos.add(matricula);
	}

	@Override
	public Matricula buscar(String id) {
		// TODO Auto-generated method stub
		Matricula matriculatemp=null;
		for (Matricula m:baseDatos) {
			if(m.getId().equals(id)) {
				matriculatemp=m;
			}
		}
		return matriculatemp;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		Matricula matriculatemp=null;
		matriculatemp=this.buscar(matricula.getId());
		baseDatos.remove(matriculatemp);
		baseDatos.add(matricula);
		
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Matricula matriculatemp=null;
		matriculatemp=this.buscar(id);
		baseDatos.remove(matriculatemp);
		
	}

}
