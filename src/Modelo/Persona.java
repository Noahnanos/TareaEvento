package Modelo;

import java.time.LocalDate;

public class Persona {
	protected String rut;
	protected String nombre;
	protected LocalDate fechaDeNac;
	
	
	public Persona(String rut,String nombre, LocalDate fechaDeNac) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.fechaDeNac = fechaDeNac;
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}
	public void setFechaDeNac(LocalDate fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
	
	
}
