package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.EnumGenero;
import com.utn.modelo.Peliculas;
import com.utn.modelo.formato.BlueRay;
import com.utn.modelo.formato.DVD;
import com.utn.modelo.formato.VHS;

@SuppressWarnings("unused")
public class PeliculaControlador {

	
	
	
	private ArrayList<Peliculas> listaPeliculas;
	
	
	
	
	

	public PeliculaControlador() {
	this.listaPeliculas=new ArrayList<Peliculas>();
	
}
	
	
	public void creoPeliculas(EnumGenero genero) {
		Peliculas p = null;
		
		
		
		switch (genero) {
		case ACCION:
		      this.listaPeliculas.add(new DVD(genero, 40.0));
		      this.listaPeliculas.add(new BlueRay(genero, 50.0));
		      this.listaPeliculas.add(new VHS(genero, 90.0));
		      
		      break;
		case TERROR:
			this.listaPeliculas.add(new DVD(genero, 56.0));
			this.listaPeliculas.add(new BlueRay(genero, 96.0));
			this.listaPeliculas.add(new VHS(genero, 76.0));
			
			
			break;
			
		case DRAMA:
			this.listaPeliculas.add(new DVD(genero, 37.2));
			this.listaPeliculas.add(new BlueRay(genero, 27.2));
			this.listaPeliculas.add(new VHS(genero, 97.2));
			
			
			break;
			
			
			default:
				
				break;
		
		}
	}
	
	
	public void muestroReportePelicula() {
		for (Peliculas item : listaPeliculas) {
			System.out.println("Genero" + item.getGenero() + "precio" + item.getPrecio() );
		
		}
	
		System.out.println("*****************************");
		
		
		
		this.listaPeliculas.forEach(item -> {
			System.out.println("Genero" + item.getGenero() + "precio" + item.getPrecio());
		});
			
		}
	
	
public ArrayList<Peliculas> devuelvoPelicula(){
	return this.listaPeliculas;
	
	
}


public void creoPeliculaxGenero(EnumGenero accion) {
	// TODO Auto-generated method stub
	
}


public Object devuelvoListaPeliculas() {
	// TODO Auto-generated method stub
	return null;
}



}

