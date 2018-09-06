package modelo;

public class Persona implements Saludable, 	Comparable <Persona> {
	
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
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Persona other = (Persona) obj;
//		if (nombre == null) {
//			if (other.nombre != null)
//				return false;
//		} else if (!nombre.equals(other.nombre))
//			return false;
//		return true;
//	}
	private String nombre;
	private int dni;
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
		return String.format("Persona [nombre=%s, dni=%s, ubicacion=%s]", nombre, dni, ubicacion);
	

	}
	@Override
	public void imprimirPeso() {
		// TODO Auto-generated method stub
		System.out.println("soy " + getNombre());
		System.out.println("Peso 80kg");
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
	

}
