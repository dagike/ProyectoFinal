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
			conjuntoResultados = instruccion.executeQuery("SELECT u.rolcreaterole FROM pg_catalog.pg_roles u WHERE u.rolname='"+nombreUsuario+"'");
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
			conjuntoResultados = instruccion.executeQuery("SELECT u.rolcreaterole FROM pg_catalog.pg_roles u WHERE u.rolname='"+p.getNombreUsuario()+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
			else{
				if(p.getTipo()==ADMINISTRADOR){
					instruccion.execute("CREATE USER "+p.getNombreUsuario()+" WITH PASSWORD '"+p.getPassword()+"' CREATEROLE;");
					instruccion.execute(" INSERT INTO nombre values('0','"+p.getNombre().getApellidoPaterno()+"','"+p.getNombre().getApellidoMaterno() +"','"+p.getNombre().getNombrePila()+"')" );
					instruccion.execute("INSERT INTO administrador (cve_administrador,cve_nombre,email,usuario) SELECT 0,max(cve_nombre),'"+p.getEmail()+"','"+p.getNombreUsuario()+"' from nombre");
					//no probado
					instruccion.execute("  GRANT ALL PRIVILEGES ON tienda to "+p.getNombreUsuario());
				}
				else{
					instruccion.execute("CREATE USER "+p.getNombreUsuario()+" WITH PASSWORD '"+p.getPassword()+"'");
					instruccion.execute(" INSERT INTO nombre values('0','"+p.getNombre().getApellidoPaterno()+"','"+p.getNombre().getApellidoMaterno() +"','"+p.getNombre().getNombrePila()+"')" );
					instruccion.execute("INSERT INTO empleado (cve_empleado,cve_tienda,cve_nombre,email,usuario) SELECT 0,0,max(cve_nombre),'"+p.getEmail()+"','"+p.getNombreUsuario()+"' from nombre");
				}
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
}
