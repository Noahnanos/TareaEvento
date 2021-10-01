package Modelo;

public class Entrada {
	protected Cliente cliente;
	protected Evento evento;
	protected int precio;
	protected int numeroAsiento;
	protected boolean entradaUsada;
	
	public Entrada(Cliente cliente, Evento evento, int precio, int numeroAsiento, boolean entradaUsada) {
		super();
		this.cliente = cliente;
		this.evento = evento;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}


	@Override
	public String toString() {
		return "Entrada [cliente=" + cliente + ", evento=" + evento + ", precio=" + precio + ", numeroAsiento="
				+ numeroAsiento + ", entradaUsada=" + entradaUsada + "]";
	}
}
