package com.utn.modelo;

public class Actor {

	private String nombre;
	private String apellido;
	private int a�oNacimiento;
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getA�oNacimiento() {
		return a�oNacimiento;
	}
	public void setA�oNacimiento(int a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}
	
	
	public Actor(String nombre, String apellido, int a�oNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.a�oNacimiento = a�oNacimiento;
	}
	
	
	
	
}
