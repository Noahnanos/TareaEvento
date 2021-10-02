package Modelo;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Persona {
	
	public Cliente(String rut, String nombre, LocalDate fechaDeNac) {
		super(rut, nombre, fechaDeNac);
	}
	
	public int obtenerEdad(LocalDate evento) {
		Period edad = Period.between(this.fechaDeNac, evento);
		return edad.getYears();
	}
}