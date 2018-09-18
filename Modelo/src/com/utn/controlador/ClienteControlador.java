package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.modelo.EnumGenero;

public class ClienteControlador {

	
	private PeliculaControlador pc;
	
	public ClienteControlador() {
		this.pc = new PeliculaControlador();
		
		
		
	}
	
	
	public void alquiloPelicula() {
	System.out.println("Quiero una de accion");
	Cliente c1 = new Cliente("Felipe","feliperez@pepe.com", 60.55, null );
	
	
	
	this.pc.creoPeliculaxGenero(EnumGenero.ACCION);
 //    c1.alquiloPelicula(this.pc.devuelvoListaPeliculas().get(1));
     
		
	}
}