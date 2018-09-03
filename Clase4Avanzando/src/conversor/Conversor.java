package conversor;

import modelo.Employee;
import modelo.EmployeeDTO;

public class Conversor {
	public static EmployeeDTO convert(Employee emp) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setLegajo(emp.getLegajo());
		dto.setName(emp.getName());
		dto.setReportTo(emp.getReportTo() != null ? emp.getReportTo().getLegajo():0);
		dto.setUbicacion(emp.getUbicacion());
		return dto;
		
	}

}
