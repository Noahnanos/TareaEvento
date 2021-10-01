package MainPackage;



import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Modelo.EntradaNormal;
import Modelo.EntradaVip;
import Modelo.Evento;


public class Main {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		List<EntradaNormal> normal = new ArrayList<EntradaNormal>();
		List<EntradaVip> vip = new ArrayList<EntradaVip>();
		
		Evento evento1 = new Evento(
				"MetalChefLive", 
				16, 60, 12, 0, 2,
				LocalDateTime.of(LocalDate.of(2021, 04, 24), LocalTime.of(16, 00)),
				normal, vip);
		
		
	}

}
