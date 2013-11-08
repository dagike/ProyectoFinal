import java.sql.Connection;
import java.sql.*;

public class Prueba{
	public static void main(String args[]) {
		Connection coneccion;
		Statement instruccion;
		ResultSet resultados;
		try {
			Class.forName("org.postgresql.Driver"); 
			
			coneccion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/tienda","prueba","hola");
			
			System.out.println("Conexion Exitosa");
			
			coneccion.close();
		}
		catch (SQLException excepcionSql) {
			System.out.println("la cagaste");
		}
		catch( ClassNotFoundException e){
				System.out.println("Where is your PostgreSQL JDBC Driver? "+ "Include in your library path!");
				return;
		} 
	}
} 
		
		
			
