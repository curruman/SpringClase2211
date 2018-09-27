package ejemplo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MenuClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ObjectMapper
		System.out.println("Hola ");
		
		ObjectMapper mapa = new ObjectMapper();
		
		File file = new File ("c:\\Zcurso\\bibliografia\\ejemploTP.txt");
		File file2 = new File("c:\\Zcurso\\bibliografia\\ejemploJ.json");
		
			Persona[] personas;
			try {
				personas = mapa.readValue(file, Persona[].class);
				for (Persona per : personas) {
					System.out.println(per.getApellido());
					System.out.println(per.getNombre());
				}	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
///------------------ guardar lista de objetos ---------------			
			List<Persona> personas2 = new ArrayList<>();
			int i=0;
			for (i=0;i<2;i++) {
				Persona p = new Persona();
				p.setNombre("Nombre " + i);
				p.setApellido("Apellido " + i);
				p.setEdad(i);
				personas2.add(p);
			}
// ---------------- Leer lista de objetos -----------------			
			for (Persona p : personas2) {
				System.out.println(p.getApellido());
			}
			
			try {
				mapa.writeValue(file2, personas2);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}

	}

