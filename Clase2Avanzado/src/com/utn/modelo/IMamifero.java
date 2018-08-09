package com.utn.modelo;

public interface IMamifero {
	
	public void comer(String bebida, int litros, String...comida); // se puede pasar muchas comidas ejem: comer("jamon"), comer ("jamon","queso","pan");
	public abstract void dormir (double horas); // abstract es obligado a escribirlo desde JDK 1.4 para atrás
	public default double caminar(int metros) {
		// default java 1.8 o superior
	return metros*2;
	}
}
