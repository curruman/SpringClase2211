package com.utn.modelo;

public class Actor {

	private String nombre;
	private String apellido;
	private int añoNacimiento;
	
	
	
	
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
	public int getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	
	
	public Actor(String nombre, String apellido, int añoNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.añoNacimiento = añoNacimiento;
	}
	
	
	
	
}
