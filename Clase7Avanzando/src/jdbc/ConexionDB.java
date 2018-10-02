package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;



public class ConexionDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "java2", "utn");
			Statement stat = connection.createStatement();
			String query = "SELECT * FROM alumnos";
			ResultSet rs = stat.executeQuery(query);
			int id, edad;
			String nombre;
			while (rs.next()) {
				id = rs.getInt("idAlumnos");
				edad = rs.getInt("edad");
				nombre = rs.getString("nombreAlumno");
				System.out.println(String.format("id : %d, nombre: %s, edad: %d ",id,nombre,edad)); 
				
			}
			rs.first();
			int numCols = rs.getMetaData().getColumnCount();
			String [] colNames = new String[numCols];
			String [] colTypes = new String[numCols];
			for (int i= 0; i < numCols; i++) {
			     colNames[i] = rs.getMetaData().getColumnName(i+1);
			     colTypes[i] = rs.getMetaData().getColumnTypeName(i+1);
			 }
			 System.out.println ("Number of columns returned: " + numCols);
			 System.out.println ("Column names/types returned: ");
			 for (int i = 0; i < numCols; i++) {
			     System.out.println (colNames[i] + " : " + colTypes[i]);
			 }
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		    while(e != null) {
		         System.out.println("SQLState:  " + e.getSQLState());
		         System.out.println("Error Code:" + e.getErrorCode());
		         System.out.println("Message:   " + e.getMessage());
		         Throwable t = e.getCause();
		         while(t != null) {
		             System.out.println("Cause:" + t);
		             t = t.getCause();
		         }
		         e = e.getNextException();
		    }

			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		


	}


}
