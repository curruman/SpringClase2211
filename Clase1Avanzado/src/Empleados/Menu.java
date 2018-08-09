package Empleados;

import java.util.Random;

public class Menu {
	
	public static void main(String[] args) {
		int cant;
		// TODO Auto-generated method stub
		Manager Presidente = createManager("Presidente", "presidencia", 100);
		Manager jefeSenado = createManager("Jefe Senado", "senado", 200);
		Manager jefeDiputado = createManager("Jefe Diputado", "congreso", 300);
		cant = generar();
		//Employee Empleados = crearEmpleados(cant); 


	}
	private static Manager createManager (String nombre, String ubicacion, int legajo) {
		Manager man = new Manager();
		man.setLegajo(legajo);
		man.setNombre(nombre);
		man.setUbicacion(ubicacion);
		
		return man;
	}
//	private static Employee crearEmpleados(int numEmpleados) {
		
	//}	
	private static int generar() {
	
		// TODO Auto-generated method stub
		int cantidad;
		Random empleados;
		empleados = new Random();
		cantidad = empleados.nextInt(99);
		System.out.println(cantidad);
		//Employee  = new Employee();
		return cantidad;
	}


}
