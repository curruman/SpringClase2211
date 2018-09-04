package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EmployeeDAOFactory {
	
	static String implementacion = "";
	
	public static EmployeeDAO createEmployee() {
		//Abrir archivo application.propieties
		// Buscar el valor de la propiedad dao.impl
		// si la propiedad es file devolver el FileDAO
		// caso contrario devolver InMemoryDAO
		// para buscar y cargar la propiedad usar java.io.FileInputStream / InputStream
		// Las propiedadses usando java.util.Properties
		
		
		Properties propiedades = new Properties();
		try {
			propiedades.load(new FileInputStream ("c:/Zcurso/Clase4Avanzando/src/application.properties"));
			implementacion = propiedades.getProperty("dao.impl");
			if (implementacion.equals("file")) {
				//return new ArchivoDAO();
				ArchivoDAO archivo = new ArchivoDAO();
				return archivo;
			}
			else {
				return new InMemoryDAO();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no existe");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede leer el archivo");
			e.printStackTrace();
		}
		
			return null;
	}

}
