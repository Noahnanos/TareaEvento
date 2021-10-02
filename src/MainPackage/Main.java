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
	
		Vendedor vendedor1 = new Vendedor(0, "16586487-6", "Guaripolo", LocalDate.of(1990, 5, 4));
		
		Evento evento1 = new Evento(
				"MetalChefLive", 
				16, 60, 12, 0, 2,
				LocalDateTime.of(LocalDate.of(2021, 04, 24), LocalTime.of(16, 00)),
				normal, vip);
		
		
		Cliente cliente1 = null;
		EntradaNormal entrada1 = null;
		normal = evento1.getEntradasNormales();
		String rut =  "16981532-8";
		String nombreEvento = "MetalChefLive";
		
		for(Cliente cliente: clientes) {
			if(cliente.getRut() == rut) {
				cliente1 = cliente;
				entrada1 = new EntradaNormal(cliente1, evento1, 5000, 20, false);
			}
		}
		
		if(cliente1 == null) {
			System.out.println("No existe el clientes");
		}else {
			Period edad = Period.between(cliente1.getFechaDeNac(), evento1.getFechaEvento().toLocalDate());
			
			System.out.println(edad.getYears());
			if(edad.getYears() >= evento1.getEdadMinimaEvento()) {
				System.out.println(cliente1.getNombre() + " Tiene acceso al evento");
				evento1.agregarEntradaNormal(entrada1);
				System.out.println(evento1.getEntradasNormales().get(0).getCliente().getNombre());
			}else {
				System.out.println("Vayase pa la casa");
			}
			
		}
	}

}
