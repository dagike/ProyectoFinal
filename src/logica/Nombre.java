package logica;
public class Nombre{
	private String nombrePila;
	private String apellidoPaterno;
	private String apellidoMaterno;
   public String getNombrePila(){return nombrePila;}
   public String getApellidoPaterno(){return apellidoPaterno;}
   public String getApellidoMaterno(){return apellidoMaterno;}
   public void setNombrePila(String nombrePila){this.nombrePila=nombrePila;}
   public void setApellidoPaterno(String apellidoPaterno){this.apellidoPaterno=apellidoPaterno;}
   public void setApellidoMaterno(String apellidoMaterno){this.apellidoMaterno=apellidoMaterno;}
	public Nombre(String nombrePila,String apellidoPaterno,String apellidoMaterno){
		this.nombrePila=nombrePila;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
	}
}
