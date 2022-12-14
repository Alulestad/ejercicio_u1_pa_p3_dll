package com.example.demo.ant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ant.modelo.Propietario;
import com.example.demo.ant.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		iPropietarioRepository.insertar(propietario);

	}

	@Override
	public Propietario buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return iPropietarioRepository.buscarCedula(cedula);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		iPropietarioRepository.actualizar(propietario);
	}

	@Override
	public void eliminarCedula(String cedula) {
		// TODO Auto-generated method stub
		iPropietarioRepository.eliminarCedula(cedula);
	}

}
