package vistas;

import genericos.CacheGenerica;
import genericos.CachePersona;
import genericos.CacheString;
import modelo.Persona;

public class CreadorGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CachePersona cp = new CachePersona();
		CacheString cs = new CacheString();
		
		CacheGenerica<Persona> cpg = new CacheGenerica <>();
		CacheGenerica<String> csg = new CacheGenerica <>();
		Persona p = new Persona();
		p.setDni(123);
		p.setNombre("Diego");
		p.setUbicacion("Buenos Aires");
		cpg.guardar(p);
		csg.guardar(new String("Soy un String"));
		
		cpg.imprimirContenido();
		csg.imprimirContenido();

	}

}
