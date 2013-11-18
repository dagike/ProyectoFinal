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
		this.precio=(precio==null)?this.precio=0:Integer.parseInt(precio);
		this.existencias=((existencias==null) ? this.existencias=0: Integer.parseInt(existencias));
		fecha= new Fecha();
	}
	public String getFecha(){return fecha.toString();}
	public String getNombre(){return nombre;}
	public String getDirector(){return director;}
	public String getGenero(){return genero;}
	public String getIdioma(){return idioma;}
	
	public boolean setFecha(String fecha){
		if(this.fecha==null)
			this.fecha=new Fecha();
		return this.fecha.setFecha(fecha);
	}
	public Pelicula(){}
	public String getFicha(){
		return "<html>Director: "+director+"<br>Nombre: "+nombre+"<br>Fecha de Estreno: "+getFecha()+"<br>Genero: "+genero+"<br>Idioma: "+idioma+"<br>Precio: $"+precio+"<br>Existencias: "+existencias+"<br> </html>";
	}
}
