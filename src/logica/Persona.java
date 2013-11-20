package logica;
public class Persona{
	private Nombre nombre;
	private String email,direccion,nombreCompleto,tarjeta,numTarjeta;
	private String nombreUsuario;
	private String password;
	private int tipo;
	
	public String getNombreCompleto(){return nombreCompleto;}
	public String getDireccion(){return direccion;}
	public String getTarjeta(){return tarjeta;}
	public String getNumTarjeta(){return numTarjeta;}
	
	public Nombre getNombre(){return nombre;}
	public String getEmail(){return email;}
	public String getNombreUsuario(){return nombreUsuario;}
	public String getPassword(){return password;}
	public int getTipo(){return tipo;}
	public void setTipo(int tipo){this.tipo=tipo;}
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
	public Persona(String nombreCompleto,String email,String direccion,String tarjeta,String numTarjeta){
		this.nombreCompleto=nombreCompleto;
		this.email=email;
		this.direccion=direccion;
		this.tarjeta=tarjeta;
		this.numTarjeta=numTarjeta;
	}
	public String toString(){
		return "Cliente: "+nombreCompleto+"\nDireccion: "+direccion+"\nEmail: "+email+"\nTarjeta: "+tarjeta+"\tNumero: "+numTarjeta+"\nPedido:";
	}
	public Persona(){}
}
