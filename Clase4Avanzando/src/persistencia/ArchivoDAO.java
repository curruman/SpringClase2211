package persistencia;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

import conversor.Conversor;
import modelo.Employee;

public class ArchivoDAO implements EmployeeDAO {
	//private File file = new File("empleados.txt");
	public  ArchivoDAO() {

	}
		//private List<Employee> empl = new ArrayList<>();
	@Override
	public void guardar(Employee empleado)  {
		// TODO Auto-generated method stub
		
		try {
			FileWriter filewriter = new FileWriter ("empleados.txt",true); 
			BufferedWriter buffer = new BufferedWriter(filewriter);
			Writer output = buffer;
			output.write("Hola Diego " + "\n");
			output.write(empleado.toString() + "\n");
				
				//buffer.write(empleado.getName());
				//buffer.write(e.getUbicacion());
			
			buffer.close();
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		/*finally {
			if (filewriter != null) {
				try {//cierra el flujo principal
					filewriter.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/	

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
	@Override
	public void guardar2(Employee empl) {
		// TODO Auto-generated method stub
	ObjectMapper mapper = new ObjectMapper();
		/*
		try(Writer output = new BufferedWriter(new FileWriter(empleado.getName(), true));){
			output.write(mapper.writeValueAsString(Conversor.convert(emp)) + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	FileWriter filewriter;
	try {
		filewriter = new FileWriter ("empleados2.txt",true);
		BufferedWriter buffer = new BufferedWriter(filewriter);
		Writer output = buffer;
		output.write(mapper.writeValueAsString(Conversor.convert(empl)) + "\n");
		buffer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	}

}

//https://www.ecodeup.com/como-escribir-y-leer-archivos-de-texto-plano-en-java/
