package serializable;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8786370985728157046L;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		return p.getNombre().equals(this.getNombre());
	}
	
//-------------- Constructor clase persona--------------------------	
	
	public Persona(String nombre, int dni, Date fechaNacimiento, Double edad, String ubicacion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.ubicacion = ubicacion;
	}



	private String nombre;
	private int dni;
	private Date fechaNacimiento;
	private transient Double edad;
	
	
	public Double getEdad() {
		return edad;
	}
	public void setEdad(Double edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	private String ubicacion;


	@Override
	public String toString() {
		return String.format("Persona [nombre=%s, dni=%s, fechaNacimiento=%s, ubicacion=%s]", nombre, dni,
				fechaNacimiento, ubicacion);
	}


	

}
