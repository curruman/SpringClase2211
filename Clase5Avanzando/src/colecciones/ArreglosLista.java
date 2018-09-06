package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ArreglosLista {
	
	public void listas() {
		List<Integer> elevador = new ArrayList<>();
		
		for (int indice = 0; indice< 10; indice++) {
			elevador.add(indice, (int) Math.pow(indice, 2));
		}
		
		for (Integer eleva : elevador) {
			System.out.println(eleva);
		}
		
		System.out.println(String.format("La potencia de %d es %d", 4, elevador.get(4) ));
	}
}
