package Modelo;

public class EntradaVip extends Entrada{
	private String regalo;
	
	public EntradaVip(
			String regalo,
			Cliente cliente, 
			Evento evento, 
			int precio, 
			int numeroAsiento, 
			boolean entradaUsada) {
		
		super(cliente, evento, precio, numeroAsiento, entradaUsada);
		this.regalo = regalo;
	}

	public String getRegalo() {
		return regalo;
	}

	public void setRegalo(String regalo) {
		this.regalo = regalo;
	}
}
