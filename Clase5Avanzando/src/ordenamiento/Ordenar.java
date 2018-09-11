package ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Ordenar {
	
	public void ordenarmiento() {
		List<Estudiante> lista = new ArrayList<>();
		
		lista.add(new Estudiante(121, 22, "Martin"));
		lista.add(new Estudiante(122, 23, "Tobias"));
		lista.add(new Estudiante(123, 44, "Adrian"));
		lista.add(new Estudiante(124, 22, "Juan"));
		lista.add(new Estudiante(125, 33, "Sebastian"));
		lista.add(new Estudiante(126, 33, "Susana"));
		lista.add(new Estudiante(127, 33, "Diego"));
		
		System.out.println("Lista sin ordenar ");
		
		for (Estudiante e : lista) {
			System.out.println(e.getNombre());
		}
		
		System.out.println("----------------------");
		
		System.out.println("Lista ordenada por edad");
		Collections.sort(lista, new Comparar());
		System.out.println(lista);
		
		for (Estudiante e : lista) {
			System.out.println(e.getNombre());
			System.out.println(e);
		}
		
		System.out.println("Orden legajo");
		Collections.sort(lista, new CompararLegajo());
		for (Estudiante e : lista) {
			System.out.println(e);
		}
		
		// comparador sin implementar metodo -----------
		
		Collections.sort(lista, new Comparator<Estudiante>(){
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		
		});
		
		System.out.println("Comparardor lamda");
		
		// hacer comparador lamda
		
	}

}
