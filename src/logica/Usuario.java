package logica;
import java.sql.*;

public class Usuario{
	public static int ADMINISTRADOR=0,EMPLEADO=1,CLIENTE=2;
	
	protected String nombre;
	protected Connection coneccion;
	protected int tipo;
	public String getNombre(){return nombre;}
	public void setConnection(Connection coneccion){
		this.coneccion=coneccion;
		setTipo();
	}
	public Usuario(String nombre){
		this.nombre=nombre;
		tipo=-1;
	}
	private void setTipo(){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT u.usesuper FROM pg_catalog.pg_user u WHERE u.usename='"+nombre+"'");
			ResultSetMetaData metaDatos = conjuntoResultados.getMetaData();
			if(conjuntoResultados.next())
				if(conjuntoResultados.getBoolean(1))
					tipo=ADMINISTRADOR;
			/*if(tipo==-1){
				
			}*/
		}catch(SQLException e){
			System.out.println("Error al determinar el tipo de usuario");
		} 
	}
}
