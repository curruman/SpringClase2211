package colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

import modelo.Persona;

public class PilasyColas {
	public void PilasColas() {
		Deque<Persona> pila = new ArrayDeque<>();
		Deque<Persona> cola = new ArrayDeque<>();
	
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		Persona p5 = new Persona();
	
		p1.setNombre("AA");
		p2.setNombre("BB");
		p3.setNombre("CC");
		p4.setNombre("DD");
		p5.setNombre("EE");
		
		cola.add(p1);
		cola.add(p2);
		cola.add(p3);
		cola.add(p4);
		cola.add(p5);
/*	
		cola.push(p1);
		cola.push(p2);
		cola.push(p3);
		cola.push(p4);
		cola.push(p5);
	*/	
		pila.push(p1);
		pila.push(p2);
		pila.push(p3);
		pila.push(p4);
		pila.push(p5);
		
		for(Persona per : cola) {
			System.out.println("Objeto removido " + cola.pop().getNombre());
		}
		
		for (Persona por : pila) {
			String nombre;
			nombre = pila.pop().getNombre();
			System.out.println("Objeto removido " + nombre);
		}
	}
}
