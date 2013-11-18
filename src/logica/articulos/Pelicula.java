package logica.articulos;
import logica.*;
public class Pelicula extends Articulo{
	private String nombre,director,genero,idioma;
	private Fecha fecha;
	public Pelicula(String nombre,String director,String genero,String idioma,String precio,String existencias){
		this.nombre=nombre;
		this.director=director;
		this.genero=genero;
		this.idioma=idioma;
		this.precio=Integer.parseInt(precio);
		this.existencias=Integer.parseInt(existencias);
		fecha= new Fecha();
	}
	public String getFecha(){return fecha.toString();}
	public String getNombre(){return nombre;}
	public String getDirector(){return director;}
	public String getGenero(){return genero;}
	public String getIdioma(){return idioma;}
	
	public boolean setFecha(String fecha){
			return this.fecha.setFecha(fecha);
	}
	public Pelicula(){}
}
