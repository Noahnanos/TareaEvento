package MainPackage;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Modelo.Cliente;
import Modelo.Entrada;
import Modelo.EntradaNormal;
import Modelo.EntradaVip;
import Modelo.Evento;
import Modelo.Vendedor;


public class Main {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		List<EntradaNormal> normal = new ArrayList<EntradaNormal>();
		List<EntradaVip> vip = new ArrayList<EntradaVip>();
		
		List<Cliente> clientes = new ArrayList<Cliente>(Arrays.asList(
				new Cliente("19876858-8", "Juan Carlos Bodoque", LocalDate.of(1997, 8, 15)),
				new Cliente("15625858-8", "Miguel Riquelme", LocalDate.of(1992, 8, 15)),
				new Cliente("14562357-8", "Carlos Contreras", LocalDate.of(1990, 8, 15)),
				new Cliente("16981532-8", "Francisco Sas", LocalDate.of(1994, 4, 24)),
				new Cliente("18725436-8", "Max Jara", LocalDate.of(1996, 8, 15)),
				new Cliente("5000000-8", "Rodrigos", LocalDate.of(1970, 8, 15))
		));
	
		Vendedor vendedor1 = new Vendedor(0, 0, "16586487-6", "Guaripolo", LocalDate.of(1990, 5, 4));
		
		Evento evento1 = new Evento(
				"MetalChefLive", 
				16, 60, 12, 0, 2,
				LocalDateTime.of(LocalDate.of(2021, 04, 24), LocalTime.of(16, 00)),
				normal, vip);
		
		venderEntradaNomal(evento1, clientes, normal, vendedor1, "16981532-8");
		venderEntradaNomal(evento1, clientes, normal, vendedor1, "19876858-8");
		venderEntradaVip(evento1, clientes, vip, vendedor1, "15625858-8");
		usarEntrada(evento1, "19876858-8");
		usarEntrada(evento1, "19876858-8");
		System.out.println("El vendedor " + vendedor1.getNombre() + "ha vendido: \n"
			+ vendedor1.getEntradasNormaVendidas() + " entradas normales\n"
			+ vendedor1.getEntradasVipVendidas() + " entradas VIP"
			
		);
	}
	
	public static void venderEntradaNomal(Evento evento, List<Cliente> clientes, List<EntradaNormal> normal, Vendedor vendedor, String rut) {
		Cliente cliente = null;
		EntradaNormal entrada = null;
		normal = evento.getEntradasNormales();
		
		for(Cliente c: clientes) {
			if(c.getRut() == rut) {
				cliente = c;
				entrada = new EntradaNormal(cliente, evento, 5000, 20, false);
			}
		}
		
		if(cliente == null) {
			System.out.println("No existe el clientes");
		}else {
			int edad = cliente.obtenerEdad(evento.getFechaEvento().toLocalDate());
			
			if(edad >= evento.getEdadMinimaEvento()) {
				System.out.println(cliente.getNombre() + " Tiene acceso al evento");
				evento.agregarEntradaNormal(entrada);
				vendedor.venderEntradaNormal();
			}else {
				System.out.println("Vayanse para la casa");
			}
			
		}
	}
	
	public static void venderEntradaVip(Evento evento, List<Cliente> clientes, List<EntradaVip> normal, Vendedor vendedor, String rut) {
		Cliente cliente = null;
		EntradaVip entrada = null;
		normal = evento.getEntradasVip();
		
		for(Cliente c: clientes) {
			if(c.getRut() == rut) {
				cliente = c;
				entrada = new EntradaVip("sas", cliente, evento, 5000, 20, false);
			}
		}
		
		if(cliente == null) {
			System.out.println("No existe el clientes");
		}else {
			int edad = cliente.obtenerEdad(evento.getFechaEvento().toLocalDate());
			
			if(edad >= evento.getEdadMinimaEvento()) {
				System.out.println(cliente.getNombre() + " Tiene acceso al evento");
				evento.agregarEntradaVip(entrada);
				vendedor.venderEntradaVip();
			}else {
				System.out.println("Vayanse para la casa");
			}
			
		}
	}
	
	public static void usarEntrada(Evento evento, String rut) {
		
		EntradaNormal eNormal = null;
		for(EntradaNormal e: evento.getEntradasNormales()) {
			if(e.getCliente().getRut().equals(rut)) {
				eNormal = e;
			}
		}
		
		Period validarDia = Period.between(evento.getFechaEvento().toLocalDate(), LocalDate.of(2021, 04, 24));
		
		if(validarDia.getDays() == 0 && !eNormal.isEntradaUsada()) {
			eNormal.setEntradaUsada(true);
			System.out.println("Usando entrada con cliente "
					+ eNormal.getCliente().getNombre() +" "
					+ eNormal.getCliente().getRut() +"\npara evento "
					+ eNormal.getEvento().getNombreEvento());
		}else if(validarDia.getDays() > 0) {
			System.out.println("El evento ya se hizo - no sea weta");
		}else if(validarDia.getDays() < 0){
			System.out.println("Faltan " + (validarDia.getDays()*-1) + " dia(s) para el evento.");
		}else {
			System.out.println("Entrada para rut "+ eNormal.getCliente().getRut() +" ya fue usada, no puede pasar.");
		}
	}

}
