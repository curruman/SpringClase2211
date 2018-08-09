package com.utn.controlador;

import com.utn.modelo.IMamifero;
import com.utn.modelo.Persona;

public class PersonaControlador {
	private IMamifero mamifero;
	
	
	public void dormir(IMamifero mamifero) {
		mamifero.dormir(8);
	}
	// new Persona()
	public PersonaControlador(IMamifero mamifero) {
		super();
		this.mamifero = mamifero;
	}

	public void dormir() {
		System.out.println(this.mamifero.getClass().getSimpleName());
		this.mamifero.dormir(10);
		
		if (mamifero instanceof Persona) {
			Persona objPersona = (Persona) mamifero;
			System.out.println(objPersona);
			System.out.println(objPersona.getApellido());
		}
	}

}
