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
		this.edicion=(edicion==null)?this.edicion=0:Integer.parseInt(edicion);
		this.precio=(precio==null)?this.precio=0:Integer.parseInt(precio);
		this.existencias=(existencias==null)?this.existencias=0:Integer.parseInt(existencias);
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
		if(this.fecha==null)
			this.fecha=new Fecha();
		return this.fecha.setFecha(fecha);
	}
	public Libro(){}
	public String getFicha(){
		return "<html>ISBN: "+isbn+"<br>Autor: "+autor+"<br>Nombre: "+nombre+"<br>Edicion: "+edicion+"<br>Editorial: "+editorial+"<br>Fecha: "+getFecha()+"<br>Genero: "+genero+"<br>Idioma: "+idioma+"<br>Precio: $"+precio+"<br>Existencias: "+existencias+"<br> </html>";
	}
}
