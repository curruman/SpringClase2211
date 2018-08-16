package modelo;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Votante {
	int legajo;
	String ubicacion;
	Employee reportTo;
	String name;
	List<Employee> reportees;
	private Boolean voto;
	
	public Employee() {
		reportees = new ArrayList<Employee>();
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Employee getReportTo() {
		return reportTo;
	}
	public void setReportTo(Employee reportTo) {
		this.reportTo = reportTo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	@Override
	public Boolean votar() {
		return (reportees != null && reportees.size() >2);
//			// TODO Auto-generated method stub

	}

	@Override
	public void elegirVoto() {
		// TODO Auto-generated method stub
		Boolean valorRetorno = null;
		if (reportees != null && reportees.size() >= 2) {
			valorRetorno = false;
			if(ubicacion.equals(SENADO) && legajo % 2 == 0)
				valorRetorno = Boolean.TRUE;
			if(ubicacion.equals(DIPUTADO) && legajo % 3 == 0)
				valorRetorno = Boolean.TRUE;
		}
		voto = valorRetorno;
	}

	@Override
	public Boolean getDecisionVoto() {
		// TODO Auto-generated method stub
		String nombre;
		nombre = name;
		quienVoto(nombre);
		return voto;
	}

	@Override
	public void quienVoto(String votador) {
		System.out.print(votador + " ");
		// TODO Auto-generated method stub
		
	}

	
}
