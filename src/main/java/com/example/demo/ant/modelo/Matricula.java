package com.example.demo.ant.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	private String id;
	private LocalDateTime fecha;
	private BigDecimal valor;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	//GETS y SETS
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getValro() {
		return valor;
	}
	public void setValro(BigDecimal valro) {
		this.valor = valro;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", valor=" + valor + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}

	
	
	
}
