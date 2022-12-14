package com.example.demo.ant.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ant.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> baseDatos=new ArrayList<>();
	
	@Override
	public void insertar(Vehiculo matricula) {
		// TODO Auto-generated method stub
		baseDatos.add(matricula);
	}

	@Override
	public Vehiculo buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		Vehiculo matriculatemp=null;
		for (Vehiculo m:baseDatos) {
			if(m.getPlaca().equals(placa)) {
				matriculatemp=m;
			}
		}
		return matriculatemp;
	}

	@Override
	public void actualizar(Vehiculo matricula) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Vehiculo matriculatemp=null;
				matriculatemp=this.buscarPlaca(matricula.getPlaca());
				baseDatos.remove(matriculatemp);
				baseDatos.add(matricula);
	}

	@Override
	public void eliminarPlaca(String placa) {
		// TODO Auto-generated method stub
		Vehiculo matriculatemp=null;
		matriculatemp=this.buscarPlaca(placa);
		baseDatos.remove(matriculatemp);
	}

}
