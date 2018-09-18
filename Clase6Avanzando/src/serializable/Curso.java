package serializable;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6142982218764266300L;
	private Persona[] personas;

	public Persona[] getPersonas() {
		return personas;
	}

	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}

	public Curso(Persona[] personas) {
		super();
		this.personas = personas;
	}
	public Curso(ArrayList<Persona> personas) {
		super();
		Persona [] personitas = new Persona[personas.size()];
	}
	
}
