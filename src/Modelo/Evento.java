package Modelo;


import java.time.LocalDateTime;
import java.util.List;



public class Evento {
	private String nombreEvento;
	private int edadMinimaEvento;
	private int limiteEntradaNormales;
	private int limiteEntradaVip;
	private int entradasVendidas;
	private int duracionHoras;
	private LocalDateTime fechaEvento;
	private List <EntradaNormal> entradasNormales;
	private List <EntradaVip> entradasVip;
	
	public Evento(
			String nombreEvento,
			int edadMinimaEvento,
			int limiteEntradaNormales,
			int limiteEntradaVip,
			int entradasVendidas,
			int duracionHoras,
			LocalDateTime fechaEvento,
			List <EntradaNormal> entradasNormales,
			List <EntradaVip> entradaVip) {
		
		this.nombreEvento = nombreEvento;
		this.edadMinimaEvento = edadMinimaEvento;
		this.limiteEntradaNormales = limiteEntradaNormales;
		this.limiteEntradaVip = limiteEntradaVip;
		this.entradasVendidas = entradasVendidas;
		this.duracionHoras = duracionHoras;
		this.fechaEvento = fechaEvento;
		this.entradasNormales = entradasNormales;
		this.entradasVip = entradaVip;
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
		return limiteEntradaNormales;
	}

	public void setLimiteEntrada(int limiteEntrada) {
		this.limiteEntradaNormales = limiteEntrada;
	}

	public int getEntradasVendidas() {
		return entradasVendidas;
	}

	public void setEntradasVendidas(int entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}


	public int getLimiteEntradaNormales() {
		return limiteEntradaNormales;
	}


	public void setLimiteEntradaNormales(int limiteEntradaNormales) {
		this.limiteEntradaNormales = limiteEntradaNormales;
	}


	public int getLimiteEntradaVip() {
		return limiteEntradaVip;
	}


	public void setLimiteEntradaVip(int limiteEntradaVip) {
		this.limiteEntradaVip = limiteEntradaVip;
	}

	
	
	public int getDuracionHoras() {
		return duracionHoras;
	}



	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}



	public LocalDateTime getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDateTime fechaEvento) {
		this.fechaEvento = fechaEvento;
	}



	public List<EntradaNormal> getEntradasNormales() {
		return entradasNormales;
	}


	public void setEntradasNormales(List<EntradaNormal> entradasNormales) {
		this.entradasNormales = entradasNormales;
	}


	public List<EntradaVip> getEntradasVip() {
		return entradasVip;
	}


	public void setEntradasVip(List<EntradaVip> entradasVip) {
		this.entradasVip = entradasVip;
	}

	@Override
	public String toString() {
		return "Evento [nombreEvento=" + nombreEvento + ", edadMinimaEvento=" + edadMinimaEvento
				+ ", limiteEntradaNormales=" + limiteEntradaNormales + ", limiteEntradaVip=" + limiteEntradaVip
				+ ", entradasVendidas=" + entradasVendidas + ", duracionHoras=" + duracionHoras + ", fechaEvento="
				+ fechaEvento + ", entradasNormales=" + entradasNormales + ", entradasVip=" + entradasVip + "]";
	}
	
}
