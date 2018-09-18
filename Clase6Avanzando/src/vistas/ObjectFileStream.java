package vistas;

import java.util.Date;

import serializable.Persona;

import java.util.ArrayList;
import java.util.Calendar;

public class ObjectFileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1994);
		Date FechaNacimiento = cal.getTime();
		Double edad = new Double(10);
		
		Persona p1 = new Persona("Diego", 123, FechaNacimiento, edad, "Argentina");
		Persona p2 = new Persona("Susana", 124, FechaNacimiento, edad, "Argentina");
		Persona p3 = new Persona("Hector", 125, cal.getTime(), edad, "Argentina");
		
		ArrayList<Persona> per = new ArrayList<>();
		per.add(p1);
		per.add(p2);
		per.add(p3);
		
		
		
		
	}

}
