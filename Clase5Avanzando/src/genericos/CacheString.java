package genericos;

public class CacheString {
	private String s;
	public void guardar(String cadena) {
		this.s = cadena;
	}
	
	public String obtener() {
		return this.s;
	}
}
