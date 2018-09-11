package ordenamiento;

import java.util.Comparator;

public class CompararLegajo implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		// TODO Auto-generated method stub
		return o1.getLegajo().compareTo(o2.getLegajo());
	}

}
