package com.example.demo.ant.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ant.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	private static List<Propietario> baseDatos=new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public Propietario buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		Propietario matriculatemp=null;
		for (Propietario m:baseDatos) {
			if(m.getCedula().equals(cedula)) {
				matriculatemp=m;
			}
		}
		return matriculatemp;
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		Propietario matriculatemp=null;
		matriculatemp=this.buscarCedula(propietario.getCedula());
		baseDatos.remove(matriculatemp);
		baseDatos.add(propietario);
	}

	@Override
	public void eliminarCedula(String cedula) {
		// TODO Auto-generated method stub
		Propietario matriculatemp=null;
		matriculatemp=this.buscarCedula(cedula);
		baseDatos.remove(matriculatemp);
	}

}
