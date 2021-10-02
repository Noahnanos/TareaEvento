package Modelo;

import java.time.LocalDate;
import java.util.List;

public class Vendedor extends Persona{
	private int entradasVendidas;
	
	public Vendedor(int entradasVendidas, String rut, String nombre, LocalDate fechaDeNac) {
		super(rut, nombre, fechaDeNac);
		this.entradasVendidas = entradasVendidas;
	}
	
	public int getEntradasVendidas() {
		return entradasVendidas;
	}

	public void setEntradasVendidas(int entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}
	
	public void venderEntradaNormal(List<EntradaNormal> normal) {
		entradasVendidas += 1;
	}
	
	public void venderEntradaVip(List<EntradaVip> vip) {
		entradasVendidas += 1;
	}
	
}
