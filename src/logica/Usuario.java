package logica;
import java.sql.*;

public class Usuario{
	public static int ADMINISTRADOR=0,EMPLEADO=1,CLIENTE=2;
	public static int ECONEXION=1,EREPETIDO=2;
	
	protected String nombreUsuario;
	protected Connection coneccion;
	protected int tipo;
	public String getNombreUsuario(){return nombreUsuario;}
	public Usuario(String nombre,Connection coneccion){
		this.nombreUsuario=nombre;
		this.coneccion=coneccion;
		setTipo();
	}
	public int getTipo(){return tipo;}
	private void setTipo(){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT u.usesuper FROM pg_catalog.pg_user u WHERE u.usename='"+nombreUsuario+"'");
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
	public int agregarUsuario(Persona p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT u.usesuper FROM pg_catalog.pg_user u WHERE u.usename='"+nombreUsuario+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
}
