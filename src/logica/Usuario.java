package logica;
import java.sql.*;
import logica.articulos.*;
import java.util.*;

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

	public Vector<String> getAutores(){
		Vector <String>autores= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT autor FROM libro group by autor order by autor");
			if(conjuntoResultados.next()){
				do{
					autores.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener autores");
		} 
		return autores;
	}
	public Vector<String> getLibroNombres(String autor){
		Vector <String>titulos= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre FROM libro where autor='"+autor+"' order by nombre");
			if(conjuntoResultados.next()){
				do{
					titulos.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener titulos");
		} 
		return titulos;
	}
	
	public Vector<String> getArtistasDisco(){
		Vector <String>artistas= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT artista FROM disco group by artista order by artista");
			if(conjuntoResultados.next()){
				do{
					artistas.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener autores");
		} 
		return artistas;
	}
	public Vector<String> getDiscoNombres(String artista){
		Vector <String>titulos= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre FROM disco where artista='"+artista+"' order by nombre");
			if(conjuntoResultados.next()){
				do{
					titulos.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener titulos");
		} 
		return titulos;
	}
	
	public Vector<String> getDirectorPelicula(){
		Vector <String>directores= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT director FROM pelicula group by director order by director");
			if(conjuntoResultados.next()){
				do{
					directores.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener directores");
		} 
		return directores;
	}
	public Vector<String> getPeliculaNombres(String director){
		Vector <String>titulos= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre FROM pelicula where director='"+director+"' order by nombre");
			if(conjuntoResultados.next()){
				do{
					titulos.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener titulos de pelicula");
		} 
		return titulos;
	}
	
	public Vector<String> getFabricanteJuguete(){
		Vector <String>fabricantes= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT fabricante FROM juguete group by fabricante order by fabricante");
			if(conjuntoResultados.next()){
				do{
					fabricantes.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener fabricantes");
		} 
		return fabricantes;
	}
	public Vector<String> getJugueteNombres(String fabricante){
		Vector <String>titulos= new Vector<String>();
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre FROM juguete where fabricante='"+fabricante+"' order by nombre");
			if(conjuntoResultados.next()){
				do{
					titulos.add(conjuntoResultados.getString(1));
				}while(conjuntoResultados.next());
			}
		}catch(SQLException e){
			System.out.println("Error en obtener nombres de juguetes");
		} 
		return titulos;
	}
	
	
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
					instruccion.execute("CREATE USER "+p.getNombreUsuario()+" WITH PASSWORD '"+p.getPassword()+"' CREATEROLE");
					instruccion.execute(" INSERT INTO nombre values('0','"+p.getNombre().getApellidoPaterno()+"','"+p.getNombre().getApellidoMaterno() +"','"+p.getNombre().getNombrePila()+"')" );
					instruccion.execute("INSERT INTO administrador (cve_administrador,cve_nombre,email,usuario) SELECT 0,max(cve_nombre),'"+p.getEmail()+"','"+p.getNombreUsuario()+"' from nombre");
					instruccion.execute("  GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public to "+p.getNombreUsuario());
				}
				else{
					instruccion.execute("CREATE USER "+p.getNombreUsuario()+" WITH PASSWORD '"+p.getPassword()+"'");
					instruccion.execute(" INSERT INTO nombre values('0','"+p.getNombre().getApellidoPaterno()+"','"+p.getNombre().getApellidoMaterno() +"','"+p.getNombre().getNombrePila()+"')" );
					instruccion.execute("INSERT INTO empleado (cve_empleado,cve_tienda,cve_nombre,email,usuario) SELECT 0,1,max(cve_nombre),'"+p.getEmail()+"','"+p.getNombreUsuario()+"' from nombre");
					instruccion.execute("  GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public to "+p.getNombreUsuario());
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
			instruccion.execute("  REVOKE ALL PRIVILEGES ON ALL TABLES IN SCHEMA public FROM "+p.getNombreUsuario());
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

	public int agregarJuguete(Juguete j){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM juguete WHERE nombre='"+j.getNombre().toLowerCase()+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
			else{
				instruccion.execute(" INSERT INTO juguete values(0,'"+j.getNombre().toLowerCase()+"','"+j.getFabricante() +"',"+j.getEdad()+","+j.getPrecio()+","+j.getExistencias()+")" );
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
	public Juguete obtenerInfoJuguete(String nombre){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		int i;
		Juguete j=null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre,fabricante,edad_apropiada,precio,existencias FROM juguete WHERE nombre='"+nombre+"'");
			if(conjuntoResultados.next()){
				j= new Juguete(conjuntoResultados.getString(1),conjuntoResultados.getString(2),conjuntoResultados.getString(3),conjuntoResultados.getString(4),conjuntoResultados.getString(5));
			}
			else{
				return null;
			}
		}catch(SQLException e){
			return null;
		}
		return j;
	}
	public boolean eliminarJuguete(Juguete j){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.execute("DELETE FROM juguete WHERE nombre='"+j.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	public boolean cambiarJuguete(Juguete j){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.executeUpdate("UPDATE juguete set fabricante='"+j.getFabricante()+"',edad_apropiada="+j.getEdad()+",precio="+j.getPrecio()+",existencias="+j.getExistencias()+" where nombre='"+j.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
		
	}
	
	public int agregarPelicula(Pelicula p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM pelicula WHERE nombre='"+p.getNombre().toLowerCase()+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
			else{
				instruccion.execute(" INSERT INTO pelicula values(0,'"+p.getNombre().toLowerCase()+"','"+p.getFecha() +"','"+p.getGenero()+"',"+p.getPrecio()+",'"+p.getIdioma()+"',1,1,'"+p.getDirector()+"',"+p.getExistencias()+")" );
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
	public Pelicula obtenerInfoPelicula(String nombre){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		int i;
		Pelicula p=null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre,director,genero,idioma,precio,existencias,fecha_estreno FROM pelicula WHERE nombre='"+nombre+"'");
			if(conjuntoResultados.next()){
				p= new Pelicula(conjuntoResultados.getString(1),conjuntoResultados.getString(2),conjuntoResultados.getString(3),conjuntoResultados.getString(4),conjuntoResultados.getString(5),conjuntoResultados.getString(6));
				p.setFecha(conjuntoResultados.getString(7));
			}
			else{
				return null;
			}
		}catch(SQLException e){
			return null;
		}
		return p;
	}
	public boolean eliminarPelicula(Pelicula p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.execute("DELETE FROM pelicula WHERE nombre='"+p.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	public boolean cambiarPelicula(Pelicula p){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.executeUpdate("UPDATE pelicula set fecha_estreno='"+p.getFecha()+"',genero='"+p.getGenero()+"',idioma='"+p.getIdioma()+"',director='"+p.getDirector()+"',precio="+p.getPrecio()+",existencias="+p.getExistencias()+" where nombre='"+p.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	
	public int agregarDisco(Disco d){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre FROM disco WHERE nombre='"+d.getNombre().toLowerCase()+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
			else{
				instruccion.execute(" INSERT INTO disco values(0,1,1,'"+d.getNombre().toLowerCase()+"','"+d.getFecha()+"','"+d.getGenero()+"',"+d.getPrecio()+",'"+d.getArtista()+"',"+d.getExistencias()+")" );
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
	public Disco obtenerInfoDisco(String nombre){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		int i;
		Disco d=null;
		try{
			nombre.toLowerCase();
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre,artista,genero,precio,existencias,fecha_lanzamiento FROM disco WHERE nombre='"+nombre+"'");
			if(conjuntoResultados.next()){
				d= new Disco(conjuntoResultados.getString(1),conjuntoResultados.getString(2),conjuntoResultados.getString(3),conjuntoResultados.getString(4),conjuntoResultados.getString(5));
				d.setFecha(conjuntoResultados.getString(6));
			}
			else{
				return null;
			}
		}catch(SQLException e){
			return null;
		}
		return d;
	}
	public boolean eliminarDisco(Disco d){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.execute("DELETE FROM disco WHERE nombre='"+d.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	public boolean cambiarDisco(Disco d){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.executeUpdate("UPDATE disco set fecha_lanzamiento='"+d.getFecha()+"',genero='"+d.getGenero()+"',artista='"+d.getArtista()+"',precio="+d.getPrecio()+",existencias="+d.getExistencias()+" where nombre='"+d.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	
	public int agregarLibro(Libro l){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM libro WHERE nombre='"+l.getNombre().toLowerCase()+"'");
			if(conjuntoResultados.next()){
				return EREPETIDO;
			}
			else{
				instruccion.execute(" INSERT INTO libro values(0,1,'"+l.getFecha()+"','"+l.getFecha()+"','"+l.getGenero()+"',"+l.getPrecio()+",'"+l.getIdioma()+"','"+l.getNombre().toLowerCase()+"','"+l.getIsbn()+"','"+l.getEditorial()+"','"+l.getAutor()+"','"+l.getEdicion()+"',"+l.getExistencias()+")");
			}
		}catch(SQLException e){
			return ECONEXION;
		}
		return 0; 
	}
	public Libro obtenerInfoLibro(String nombre){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		int i;
		Libro l=null;
		try{
			instruccion =coneccion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT nombre,autor,editorial,idioma,isbn,genero,edicion,precio,existencias,fecha_impresion FROM libro WHERE nombre='"+nombre+"'");
			if(conjuntoResultados.next()){
				l= new Libro(conjuntoResultados.getString(1),conjuntoResultados.getString(2),conjuntoResultados.getString(3),conjuntoResultados.getString(4),conjuntoResultados.getString(5),conjuntoResultados.getString(6),conjuntoResultados.getString(7),conjuntoResultados.getString(8),conjuntoResultados.getString(9));
				l.setFecha(conjuntoResultados.getString(10));
			}
			else{
				return null;
			}
		}catch(SQLException e){
			return null;
		}
		return l;
	}
	public boolean eliminarLibro(Libro l){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.execute("DELETE FROM libro WHERE nombre='"+l.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
	public boolean cambiarLibro(Libro l){
		Statement instruccion = null; 
		ResultSet conjuntoResultados = null;
		try{
			instruccion =coneccion.createStatement();
			instruccion.executeUpdate("UPDATE libro set fecha_impresion='"+l.getFecha()+"',genero='"+l.getGenero()+"',idioma='"+l.getIdioma()+"',isbn='"+l.getIsbn()+"',editorial='"+l.getEditorial()+"',autor='"+l.getAutor()+"',edicion='"+l.getEdicion()+"',precio="+l.getPrecio()+",existencias="+l.getExistencias()+" where nombre='"+l.getNombre().toLowerCase()+"'");
		}catch(SQLException e){
			System.out.println("Error en la conexion");
			return false;
		}
		return true; 
	}
}
