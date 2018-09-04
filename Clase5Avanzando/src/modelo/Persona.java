package modelo;

public class Persona implements Saludable {
	
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
	
	
	

}
