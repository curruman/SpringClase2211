package vistas;

import colecciones.ArreglosLista;
import colecciones.PilasyColas;
import colecciones.Sets;
import genericos.CacheGenerica;
import genericos.CachePersona;
import genericos.CacheString;
import modelo.Persona;
import ordenamiento.Ordenar;

public class CreadorGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CachePersona cp = new CachePersona();
		CacheString cs = new CacheString();
		
/*		CacheGenerica<Persona> cpg = new CacheGenerica <>();
		CacheGenerica<String> csg = new CacheGenerica <>();
		Persona p = new Persona();
		p.setDni(123);
		p.setNombre("Diego");
		p.setUbicacion("Buenos Aires");
		cpg.guardar(p);
		csg.guardar(new String("Soy un String"));
		
		cpg.imprimirContenido();
		csg.imprimirContenido();
		
		ArreglosLista arr = new ArreglosLista();
		arr.listas();
		
		Sets coleccionSet = new Sets();
		coleccionSet.metodoSet();
	*/	
	//	PilasyColas pyc = new PilasyColas();
		//pyc.PilasColas();
		
		Ordenar o = new Ordenar();
		o.ordenarmiento();

	}

}
