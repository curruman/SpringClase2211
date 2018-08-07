package Empleados;

public class Employee {
	int legajo;
	String ubicacion;
	String nombre;
	Manager reportTo;
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Manager getReportTo() {
		return reportTo;
	}
	public void setReportTo(Manager reportTo) {
		this.reportTo = reportTo;
	}

}
