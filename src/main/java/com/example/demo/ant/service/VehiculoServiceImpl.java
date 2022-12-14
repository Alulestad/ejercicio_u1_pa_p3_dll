package com.example.demo.ant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ant.modelo.Vehiculo;
import com.example.demo.ant.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void insertar(Vehiculo matricula) {
		// TODO Auto-generated method stub
		iVehiculoRepository.insertar(matricula);

	}

	@Override
	public Vehiculo buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		return iVehiculoRepository.buscarPlaca(placa);
	}

	@Override
	public void actualizar(Vehiculo matricula) {
		// TODO Auto-generated method stub
		iVehiculoRepository.actualizar(matricula);
	}

	@Override
	public void eliminarPlaca(String placa) {
		// TODO Auto-generated method stub
		iVehiculoRepository.eliminarPlaca(placa);
	}

}
