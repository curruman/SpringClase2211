package persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import modelo.Employee;

public class ArchivocDAO implements EmployeeDAO{
	FileWriter filewriter = null;
	@Override
	public void guardar(Employee empleado) {
		// TODO Auto-generated method stub
		try {
			
			filewriter = new FileWriter ("empleados.txt");
			BufferedWriter buffer = new BufferedWriter(filewriter);
		//	buffer.write("Hola Diego " + "\n");
			buffer.write(empleado.toString() + "\n");
			buffer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
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

	@Override
	public void guardar2(Employee empleado) {
		// TODO Auto-generated method stub
		
	}

}
