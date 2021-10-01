package Modelo;

import java.util.Date;

public class Vendedor extends Persona{
	private int entradasVendidas;
	
	
	
	public Vendedor(int entradasVendidas,String rut,String nombre,Date fechaDeNac) {
		super(rut, nombre, fechaDeNac);
		this.entradasVendidas = entradasVendidas;
	}



	
	
	
	
	
	
	
	
	
	
	
	public int getEntradasVendidas() {
		return entradasVendidas;
	}

	public void setEntradasVendidas(int entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}
	
}
