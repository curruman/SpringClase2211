package modelo;

public interface Votante {
	public Boolean votar();
	public void elegirVoto();
	public static final String SENADO = "senado";
	public static final String DIPUTADO = "congreso";
	public Boolean getDecisionVoto();
	public void quienVoto(String votador);
	
}
