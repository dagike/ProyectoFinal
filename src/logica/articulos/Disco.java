package logica.articulos;
import logica.*;
public class Disco extends Articulo{	
	private String nombre,artista,genero;
	private Fecha fecha;
	public Disco(String nombre,String artista,String genero,String precio,String existencias){
		this.nombre=nombre;
		this.artista=artista;
		this.genero=genero;
		this.precio=Integer.parseInt(precio);
		this.existencias=Integer.parseInt(existencias);
		fecha= new Fecha();
	}
	public String getFecha(){return fecha.toString();}
	public String getNombre(){return nombre;}
	public String getArtista(){return artista;}
	public String getGenero(){return genero;}
	
	public boolean setFecha(String fecha){
			return this.fecha.setFecha(fecha);
	}
	
}
