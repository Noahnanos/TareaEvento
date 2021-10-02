package Modelo;

import java.time.LocalDate;

public class Cliente extends Persona {
	
	public Cliente(String rut, String nombre, LocalDate fechaDeNac) {
		super(rut, nombre, fechaDeNac);
	}
}