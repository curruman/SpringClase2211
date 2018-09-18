package com.utn.modelo;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String mail;
	private double dinero;
	private ArrayList<Peliculas> listaPeliculasAlquiladas;
	
	
	
	
	
	
	
	
	
   
  public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getMail() {
		return mail;
	}





	public void setMail(String mail) {
		this.mail = mail;
	}





	public double getDinero() {
		return dinero;
	}





	public void setDinero(double dinero) {
		this.dinero = dinero;
	}





	public ArrayList<Peliculas> getListaPeliculasAlquiladas() {
		return listaPeliculasAlquiladas;
	}





public boolean alquiloPelicula(Peliculas peli) {
	  
	  System.out.println(" El valor de la pelicula a alquilar es de : " + peli.getPrecio());
	  
	  if(peli.getPrecio() <= this.dinero) {
	  this.dinero = this.dinero- peli.getPrecio();
	  this.listaPeliculasAlquiladas.add(peli);
	  System.out.println(" Su saldo actual es de: " + this.dinero);
	  return true;
  }else {
	  System.out.println(" No tiene dinero ");
	  return false;
	  
  }
 
  
  
  
  
  
  }





public Cliente(String nombre, String mail, double dinero, ArrayList<Peliculas> listaPeliculasAlquiladas) {
	super();
	this.nombre = nombre;
	this.mail = mail;
	this.dinero = dinero;
	this.listaPeliculasAlquiladas = listaPeliculasAlquiladas;
}
  }
  
  