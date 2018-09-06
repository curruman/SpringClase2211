package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import modelo.Persona;

public class Sets {
	public void metodoSet() {
		Set<String> sets = new HashSet<>();
		
		sets.add("uno");
		sets.add("dos");
		sets.add("tres");
		sets.add("tres");
		for(String lista: sets) {
			System.out.println(lista);
		}
		
		Set<Persona> set = new HashSet<>();
		Persona p1 = new Persona();
		for (int i = 0; i < 5; i++) {
			p1.setNombre("Nombre " + i);
			set.add(p1);
		}
		
		for (Persona p : set) {
			System.out.println(p.getNombre());
		}
	}
}
