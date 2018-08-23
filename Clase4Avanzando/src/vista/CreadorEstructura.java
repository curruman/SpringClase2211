package vista;

import servicios.GestorEmpleados;
import modelo.Employee;
import modelo.Votante;

public class CreadorEstructura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", Votante.SENADO);
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(400,"Jefe Diputado", Votante.DIPUTADO);
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
		
		for (int i= 0; i <jefeSenado.getReportees().size(); i++) {
			GestorEmpleados.generarAsesores(jefeSenado.getReportees().get(i));
		}
		
		for (int i= 0; i <jefeDiputado.getReportees().size(); i++) {
			GestorEmpleados.generarAsesores(jefeDiputado.getReportees().get(i));
		}
		
		for (Votante empleado : presidente.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getDecisionVoto());
			System.out.println(empleado);
		}
		
		for (Votante empleado : jefeSenado.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getDecisionVoto());
			System.out.println(empleado);
		}
		for (Votante empleado : jefeDiputado.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getDecisionVoto());
			System.out.println(empleado);
		}



	}

}
