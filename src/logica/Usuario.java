package logica;
import java.sql.*;

public class Usuario{
	public static int ADMINISTRADOR=0,EMPLEADO=1,CLIENTE=2;
	
	protected String nombre;
	protected Connection coneccion;
	protected int tipo;
	public String getNombre(){return nombre;}
	public Usuario(String nombre,Connection coneccion){
		this.nombre=nombre;
		this.coneccion=coneccion;
		setTipo();
	}
	public int getTipo(){return tipo;}
	private void setTipo(){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT u.usesuper FROM pg_catalog.pg_user u WHERE u.usename='"+nombre+"'");
			ResultSetMetaData metaDatos = conjuntoResultados.getMetaData();
			if(conjuntoResultados.next()){
				if(conjuntoResultados.getBoolean(1)){
					tipo=ADMINISTRADOR;
				}
				else 
					tipo=EMPLEADO;
			}
		}catch(SQLException e){
			System.out.println("Error al determinar el tipo de usuario");
		} 
	}
}
