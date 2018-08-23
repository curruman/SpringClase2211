package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import modelo.Employee;

public class ArchivoDAO implements EmployeeDAO {

	File empleados = new File("empleados.txt");
	@Override
	public void guardar(Employee empleado) {
		// TODO Auto-generated method stub
		try{
			PrintWriter archivoEscritura = new PrintWriter("empleados.txt");
			archivoEscritura.write(empleado.getName());
		}
		catch (Exception e){
			
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
