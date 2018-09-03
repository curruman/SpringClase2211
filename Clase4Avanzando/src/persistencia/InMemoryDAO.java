package persistencia;

import java.util.ArrayList;
import java.util.List;

import modelo.Employee;

public class InMemoryDAO implements EmployeeDAO {

	private List<Employee> empleados = new ArrayList<>();
	@Override
	public void guardar(Employee empleado) {
		// TODO Auto-generated method stub
		empleados.add(empleado);

	}

	@Override
	public List<Employee> recuperar() {
		// TODO Auto-generated method stub
		return empleados;
	}

	@Override
	public List<String> recuperarString() {
		// TODO Auto-generated method stub
		
		List<String> empleadoString = new ArrayList<>();
		for(Employee empl : empleados)
			empleadoString.add(empl.toString());
			return empleadoString;
	}

	@Override
	public void guardar2(Employee empleado) {
		// TODO Auto-generated method stub
		
	}

}
