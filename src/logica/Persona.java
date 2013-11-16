package logica;
public class Persona{
	private Nombre nombre;
	private String email;
	private String nombreUsuario;
	private String password;
	private int tipo;
	
	public Nombre getNombre(){return nombre;}
	public String getEmail(){return email;}
	public String getNombreUsuario(){return nombreUsuario;}
	public String getPassword(){return password;}
	public int getTipo(){return tipo;}
	
	public void setNombre(String nombrePila,String apellidoPaterno,String apellidoMaterno){
		if(nombre==null)
			nombre=new Nombre(nombrePila,apellidoPaterno,apellidoMaterno);
		else{
			nombre.setNombrePila(nombrePila);
			nombre.setApellidoPaterno(apellidoPaterno);
			nombre.setApellidoMaterno(apellidoMaterno);
		}
	}
	public void setNombre(Nombre n){nombre=n;}
	public void setEmail(String email){this.email=email;}
	public void setNombreUsuario(String u){nombreUsuario=u;}
	public void setPassword(String p){password=p;}
	
	public Persona(Nombre nombre,String email,String nombreUsuario,int tipo){
		this.nombre=nombre;
		this.email=email;
		this.nombreUsuario=nombreUsuario;
		this.tipo=tipo;
	}
}
