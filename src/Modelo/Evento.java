package Modelo;

import java.util.List;

public class Evento {
	private String nombreEvento;
	private int edadMinimaEvento;
	private int limiteEntrada;
	private int entradasVendidas;
	private List <Entrada> entradas;
	
	public Evento(String nombreEvento,int edadMinimaEvento,int limiteEntrada,int entradasVendidas,List <Entrada> entradas) {
		
		this.nombreEvento = nombreEvento;
		this.edadMinimaEvento = edadMinimaEvento;
		this.limiteEntrada = limiteEntrada;
		this.entradasVendidas = entradasVendidas;
		this.entradas = entradas;
	}
	
	
	
	
	
	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	public void verificarEdad() {
		
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public int getEdadMinimaEvento() {
		return edadMinimaEvento;
	}

	public void setEdadMinimaEvento(int edadMinimaEvento) {
		this.edadMinimaEvento = edadMinimaEvento;
	}

	public int getLimiteEntrada() {
		return limiteEntrada;
	}

	public void setLimiteEntrada(int limiteEntrada) {
		this.limiteEntrada = limiteEntrada;
	}

	public int getEntradasVendidas() {
		return entradasVendidas;
	}

	public void setEntradasVendidas(int entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}
	
	
	
}
