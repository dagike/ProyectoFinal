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
	//faltan checar los permisos de los empleados de acceso a tablas
	public int agregarUsuario(Persona p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT u.usesuper FROM pg_catalog.pg_user u WHERE u.usename='"+p.getNombreUsuario()+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
			else{
				if(p.getTipo()==ADMINISTRADOR){
					instruccion.execute("CREATE USER "+p.getNombreUsuario()+" WITH PASSWORD '"+p.getPassword()+"' CREATEROLE;");
					instruccion.execute(" INSERT INTO nombre values('0','"+p.getNombre().getApellidoPaterno()+"','"+p.getNombre().getApellidoMaterno() +"','"+p.getNombre().getNombrePila()+"')" );
					instruccion.execute("INSERT INTO administrador (cve_administrador,cve_nombre,email,usuario) SELECT 0,max(cve_nombre),'"+p.getEmail()+"','"+p.getNombreUsuario()+"' from nombre");
					instruccion.execute("  GRANT ALL PRIVILEGES ON tienda to "+p.getNombreUsuario());
				}
				else{
					instruccion.execute("CREATE USER "+p.getNombreUsuario()+" WITH PASSWORD '"+p.getPassword()+"'");
					instruccion.execute(" INSERT INTO nombre values('0','"+p.getNombre().getApellidoPaterno()+"','"+p.getNombre().getApellidoMaterno() +"','"+p.getNombre().getNombrePila()+"')" );
					instruccion.execute("INSERT INTO empleado (cve_empleado,cve_tienda,cve_nombre,email,usuario) SELECT 0,1,max(cve_nombre),'"+p.getEmail()+"','"+p.getNombreUsuario()+"' from nombre");
				}
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
	public Persona obtenerInfo(String nombreUsuario){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		int i;
		Persona p=null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT u.usesuper FROM pg_catalog.pg_user u WHERE u.usename='"+nombreUsuario+"'");
			if(conjuntoResultados.next()){
				conjuntoResultados = instruccion.executeQuery("SELECT nombrepila,paterno,materno,email,usuario from administrador,nombre where administrador.cve_nombre=nombre.cve_nombre and usuario='"+nombreUsuario+"'");
				if(conjuntoResultados.next()){
					Nombre n= new Nombre(conjuntoResultados.getString(1),conjuntoResultados.getString(2),conjuntoResultados.getString(3));
					p= new Persona(n,conjuntoResultados.getString(4),conjuntoResultados.getString(5),ADMINISTRADOR);	
				}
				else{
					conjuntoResultados = instruccion.executeQuery("SELECT nombrepila,paterno,materno,email,usuario from empleado,nombre where empleado.cve_nombre=nombre.cve_nombre and usuario='"+nombreUsuario+"'");
					if(conjuntoResultados.next()){
						Nombre n= new Nombre(conjuntoResultados.getString(1),conjuntoResultados.getString(2),conjuntoResultados.getString(3));
						p= new Persona(n,conjuntoResultados.getString(4),conjuntoResultados.getString(5),EMPLEADO);	
					}
					else
						p=new Persona();
				}
			}
			else{
				return null;
			}
		}catch(SQLException e){
			return null;
		}
		return p;
	}
	public boolean eliminarUsuario(Persona p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			if(p.getTipo()==ADMINISTRADOR)
				instruccion.execute("DELETE FROM administrador WHERE usuario='"+p.getNombreUsuario()+"'");
			else
				instruccion.execute("DELETE FROM empleado WHERE usuario='"+p.getNombreUsuario()+"'");
			instruccion.execute("DELETE FROM nombre WHERE nombrepila='"+p.getNombre().getNombrePila()+"'");
			instruccion.execute("DROP ROLE "+p.getNombreUsuario());
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	public boolean cambiarUsuario(Persona p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			if(p.getTipo()==EMPLEADO){
				conjuntoResultados = instruccion.executeQuery("SELECT * FROM administrador WHERE usuario='"+p.getNombreUsuario()+"'");
				if(conjuntoResultados.next()){
					p.setTipo(ADMINISTRADOR);
					eliminarUsuario(p);
					p.setTipo(EMPLEADO);
					agregarUsuario(p);
				}
				else{
					int cve_nombre=0;
					conjuntoResultados = instruccion.executeQuery("SELECT nombre.cve_nombre from empleado,nombre where empleado.cve_nombre=nombre.cve_nombre and usuario='"+nombreUsuario+"'");
					if(conjuntoResultados.next()){
						cve_nombre=conjuntoResultados.getInt(1);
						instruccion.executeUpdate("UPDATE nombre set nombrepila='"+p.getNombre().getNombrePila()+"' paterno='"+p.getNombre().getApellidoPaterno()+"' materno='"+p.getNombre().getApellidoMaterno()+"' where cve_nombre="+cve_nombre);
						instruccion.executeUpdate("UPDATE administrador set email='"+p.getEmail()+"' where usuario='"+p.getNombreUsuario()+"'");
					}
				}
			}	
			else{
				conjuntoResultados = instruccion.executeQuery("SELECT * FROM empleado WHERE usuario='"+p.getNombreUsuario()+"'");
				if(conjuntoResultados.next()){
					p.setTipo(EMPLEADO);
					eliminarUsuario(p);
					p.setTipo(ADMINISTRADOR);
					agregarUsuario(p);
				}
				else{
					int cve_nombre=0;
					conjuntoResultados = instruccion.executeQuery("SELECT nombre.cve_nombre from administrador,nombre where administrador.cve_nombre=nombre.cve_nombre and usuario='"+nombreUsuario+"'");
					if(conjuntoResultados.next()){
						cve_nombre=conjuntoResultados.getInt(1);
						instruccion.executeUpdate("UPDATE nombre set nombrepila='"+p.getNombre().getNombrePila()+"' ,paterno='"+p.getNombre().getApellidoPaterno()+"' ,materno='"+p.getNombre().getApellidoMaterno()+"' where cve_nombre="+cve_nombre);
						instruccion.executeUpdate("UPDATE empleado set email='"+p.getEmail()+"' where usuario='"+p.getNombreUsuario()+"'");
					}
				}
			}	
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
}
