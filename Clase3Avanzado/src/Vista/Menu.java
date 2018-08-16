package Vista;

import servicios.GestorEmpleados;
import modelo.Employee;
import modelo.Votante;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", Votante.SENADO);
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(400,"Jefe Diputado", Votante.DIPUTADO);
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
		
		for (Votante empleado : presidente.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getDecisionVoto());
		}

	}

}
