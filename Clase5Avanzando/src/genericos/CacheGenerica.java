package genericos;

public class CacheGenerica <T> {
	
	private T x;
	
	public void guardar (T nombre) {
		this.x = nombre;
	}
	
	public T obtener() {
		return this.x;
	}
	
	public void imprimirContenido() {
		System.out.println(this.x);
	//	System.out.println(this.x);
	}

}
