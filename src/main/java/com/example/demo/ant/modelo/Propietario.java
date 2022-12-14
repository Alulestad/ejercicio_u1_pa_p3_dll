package com.example.demo.ant.modelo;

import java.time.LocalDateTime;

public class Propietario {
	private String nombre;
	private String apellido;
	private String cedula;
	
	//GETS Y SETS
	private LocalDateTime fechaNacimeinto;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getFechaNacimeinto() {
		return fechaNacimeinto;
	}
	public void setFechaNacimeinto(LocalDateTime fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}
	
	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimeinto="
				+ fechaNacimeinto + "]";
	}
	
	

}
