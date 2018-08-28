package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Employee;

public class ArchivoDAO implements EmployeeDAO {
	private FileWriter filewriter;
	public  ArchivoDAO() {
		try {
			filewriter = new FileWriter ("empleados.txt"); 
		}
		catch (IOException error) {
			error.printStackTrace();
		}
	}
		//private List<Employee> empl = new ArrayList<>();
	@Override
	public void guardar(Employee empleado)  {
		// TODO Auto-generated method stub
		
		try {	
			BufferedWriter buffer = new BufferedWriter(filewriter);
			buffer.write("Hola Diego " + "\n");
			buffer.write(empleado.toString() + "\n");
				
				//buffer.write(empleado.getName());
				//buffer.write(e.getUbicacion());
			
			buffer.close();

		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			if (filewriter != null) {
				try {//cierra el flujo principal
					filewriter.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	

	}

	@Override
	public List<Employee> recuperar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> recuperarString() {
		// TODO Auto-generated method stub
		return null;
	}

}

//https://www.ecodeup.com/como-escribir-y-leer-archivos-de-texto-plano-en-java/
