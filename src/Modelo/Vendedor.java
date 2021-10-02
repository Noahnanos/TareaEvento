package Modelo;

import java.time.LocalDate;
import java.util.List;

public class Vendedor extends Persona{
	private int entradasNormaVendidas;
	private int entradasVipVendidas;
	
	public Vendedor(int entradasNormaVendidas, int entradasVipVendidas, String rut, String nombre, LocalDate fechaDeNac) {
		super(rut, nombre, fechaDeNac);
		this.entradasNormaVendidas = entradasNormaVendidas;
		this.entradasVipVendidas = entradasVipVendidas;
	}
	
	public void venderEntradaNormal() {
		entradasNormaVendidas += 1;
	}
	
	public void venderEntradaVip() {
		entradasVipVendidas += 1;
	}

	public int getEntradasNormaVendidas() {
		return entradasNormaVendidas;
	}

	public void setEntradasNormaVendidas(int entradasNormaVendidas) {
		this.entradasNormaVendidas = entradasNormaVendidas;
	}

	public int getEntradasVipVendidas() {
		return entradasVipVendidas;
	}

	public void setEntradasVipVendidas(int entradasVipVendidas) {
		this.entradasVipVendidas = entradasVipVendidas;
	}
	
	
}
