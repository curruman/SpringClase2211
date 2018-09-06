package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import modelo.Persona;

public class Sets {
	public void metodoSet() {
		Set<String> sets = new TreeSet<>();
		
		sets.add("uno");
		sets.add("dos");
		sets.add("tres");
		sets.add("tres");
		for(String lista: sets) {
			System.out.println(lista);
		}
		
		Set<Persona> set = new HashSet<>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		p1.setNombre("AA");
		p2.setNombre("BB");
		p3.setNombre("CC");
		p4.setNombre("BB");
		System.out.println("HashSet");
		System.out.println(set.add(p1));
		System.out.println(set.add(p2));
		System.out.println(set.add(p3));
		System.out.println(set.add(p4));
		
		for (Persona p : set) {
			System.out.println(p.getNombre());
		}
		
		Set<Persona> set2 = new TreeSet<>();
		System.out.println("TreeSet");
		System.out.println(set2.add(p1));
		System.out.println(set2.add(p2));
		System.out.println(set2.add(p3));
		System.out.println(set2.add(p4));
		
		for (Persona pe : set2) {
			System.out.println(pe.getNombre());
		}		
	}
}
