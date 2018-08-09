package com.utn.modelo;

public class Persona implements IMamifero {
	
	private boolean cansado;
	private String nombre;
	private String apellido;
	
	//constructor
	public Persona(boolean cansado, String nombre, String apellido, int dni) {
		super();
		this.cansado = cansado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	// sobre carga constructor
	public Persona() {
		
	}

	// Get and Set
	public boolean isCansado() {
		return cansado;
	}

	public void setCansado(boolean cansado) {
		this.cansado = cansado;
	}

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

	public int getDni() {
		return dni;
	}
// mutabilidad
	public void setDni(int dni) {
		dni = 111;
		this.dni = dni;
	}
//inmutable
//	public void setDni(final int dni) {
	//	dni = 111;
		//this.dni = dni;
//	}

	private int dni;
	
	public void dormir (double horas) {
		
	}

	@Override
	public void comer(String bebida, int litros, String... comida) {
		// TODO Auto-generated method stub
		System.out.println("la persona bebio: " + bebida + "de" + litros);
		System.out.println("Comio: ");
		for (String item : comida) {
			
		}
	}
}
