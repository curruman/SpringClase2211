package com.utn.vista;

import com.utn.controlador.PersonaControlador;
import com.utn.modelo.IMamifero;
import com.utn.modelo.Persona;

public class MenuMamifero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// en este momento definimos la funcionalidad de la interfaz
		// esto se debe gracias a una clase anonima
		
	/*	PersonaControlador pc = new PersonaControlador();
		pc.dormir(new IMamifero() {

			@Override
			public void comer(String bebida, int litros, String... comida) {
				// TODO Auto-generated method stub
					System.out.println("COMIDA " + bebida);
			}

			@Override
			public void dormir(double horas) {
				// TODO Auto-generated method stub
				
			}
			
		}
			
	//	}
*/		
		System.out.println(" eJEMPLO DE MUTABILIDAD");
		Persona p = new Persona();
		p.setDni(222);
		System.out.println("dni " + p.getDni());
		
		PersonaControlador mc = new PersonaControlador (new Persona(true,"Diego", "Lopez", 1234));
		System.out.println(mc);
		mc.dormir();

	}

}
