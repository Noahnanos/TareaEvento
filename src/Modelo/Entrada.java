package Modelo;

public class Entrada {
	private int precio;
	private int numeroAsiento;
	private boolean entradaUsada;
	
	public Entrada(int precio,int numeroAsiento,boolean entradaUsada) {
		
		this.precio = precio;
		this.numeroAsiento = numeroAsiento;
		this.entradaUsada = entradaUsada;
	}
	
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getNumeroAsiento() {
		return numeroAsiento;
	}
	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	public boolean isEntradaUsada() {
		return entradaUsada;
	}
	public void setEntradaUsada(boolean entradaUsada) {
		this.entradaUsada = entradaUsada;
	}
	
}
