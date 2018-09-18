package com.utn.modelo;

import java.util.ArrayList;

public abstract class Peliculas {

	private ArrayList<Actor> repartoActores;
	private EnumGenero genero;
	private double Precio;
	
	
	
	
	
	
	
	public ArrayList<Actor> getRepartoActores() {
		return repartoActores;
	}






	public void agregarActorAPelicula(Actor actor) {
		this.repartoActores.add(actor);
	}






	public EnumGenero getGenero() {
		return genero;
	}






	public void setGenero(EnumGenero genero) {
		this.genero = genero;
	}






	public double getPrecio() {
		return Precio;
	}






	public void setPrecio(double precio) {
		Precio = precio;
	}






	


	public Peliculas(EnumGenero genero, double precio) {
		super();
		this.genero = genero;
		Precio = precio;
		
	
	this.repartoActores = new ArrayList<Actor>();
	
	
	
	}






	public abstract String tipoFormato();
	
	
	
}
