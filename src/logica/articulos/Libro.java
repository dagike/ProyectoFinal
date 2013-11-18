package logica.articulos;
import logica.*;
public class Libro extends Articulo{
	private String nombre,autor,editorial,idioma,isbn,genero;
	private int edicion;
	private Fecha fecha;
	public Libro(String nombre,String autor,String editorial,String idioma,String isbn,String genero,String edicion,String precio,String existencias){
		this.nombre=nombre;
		this.autor=autor;
		this.editorial=editorial;
		this.idioma=idioma;
		this.isbn=isbn;
		this.genero=genero;
		this.edicion=Integer.parseInt(edicion);
		this.precio=Integer.parseInt(precio);
		this.existencias=Integer.parseInt(existencias);
		fecha= new Fecha();
	}
	public String getFecha(){return fecha.toString();}
	public String getNombre(){return nombre;}
	public String getAutor(){return autor;}
	public String getEditorial(){return editorial;}
	public String getIdioma(){return idioma;}
	public String getIsbn(){return isbn;}
	public String getGenero(){return genero;}
	public int getEdicion(){return edicion;}
	
	public boolean setFecha(String fecha){
			return this.fecha.setFecha(fecha);
	}
	public Libro(){}
}
