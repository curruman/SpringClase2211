package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import modelo.Persona;

public class Mapa {
	
	public void maps() {
		Map<String, Persona> mapaPersona = new HashMap<>();
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		p1.setNombre("AA");
		p2.setNombre("BB");
		p3.setNombre("CC");
		p4.setNombre("BB");
		
		mapaPersona.put("A", p1);
		mapaPersona.put("B", p2);
		mapaPersona.put("C", p3);
		mapaPersona.put("B", p4); // Sobre escribe la clave b con el valor del objeto p4
		
		Set<String> claves = mapaPersona.keySet();
		
		for (String p : claves) {
			System.out.println("Clave: " + p + " valor: " + mapaPersona.get(p));
		}
	}

}
