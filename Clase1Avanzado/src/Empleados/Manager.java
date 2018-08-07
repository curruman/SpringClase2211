package Empleados;

import java.util.List;

public class Manager extends Employee {
	

	List<Employee>  reportados;
	public List<Employee> getReportados() {
		return reportados;
	}
	public void setReportados(List<Employee> reportados) {
		this.reportados = reportados;
	}  

}
