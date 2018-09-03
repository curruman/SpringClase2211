package persistencia;

import java.util.List;

import modelo.Employee;

public interface EmployeeDAO {
	
	public void guardar(Employee empleado); 
			
	public List<Employee> recuperar();
	
	public List<String> recuperarString();
	
	public void guardar2(Employee empleado);

}
