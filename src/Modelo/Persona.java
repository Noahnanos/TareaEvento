package Modelo;

import java.util.Date;

public class Persona {
	protected String rut;
	protected String nombre;
	protected Date fechaDeNac;
	
	
	public Persona(String rut,String nombre,Date fechaDeNac) {
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
	public Date getFechaDeNac() {
		return fechaDeNac;
	}
	public void setFechaDeNac(Date fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
	
	
}
