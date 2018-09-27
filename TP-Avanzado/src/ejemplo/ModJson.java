package ejemplo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ModJson {
	
	public void modjson() {
		ObjectMapper mapa = new ObjectMapper();
		File file = new File("c:\\Zcurso\\bibliografia\\jsonTrabajo.json");
		
		List<Precios> precios = new ArrayList<>();
		
		try {
			precios = mapa.readValue(file,precios.getClass());
			
			for (Precios p : precios) {
				System.out.println(p.getName());
				System.out.printf("%.2f ", p.getPrice());
				System.out.println(" ");
				System.out.println(p.getCurrency());
			}
		} catch (JsonParseException e) {
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
