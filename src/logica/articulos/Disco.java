package logica.articulos;
import logica.*;
public class Disco extends Articulo{	
	private String artista,genero;
	private Fecha fecha;
	public Disco(String nombre,String artista,String genero,String precio,String existencias){
		this.nombre=nombre;
		this.artista=artista;
		this.genero=genero;
		this.precio=(precio==null)?this.precio=0:Integer.parseInt(precio);
		this.existencias=(existencias==null)?this.existencias=0:Integer.parseInt(existencias);
		fecha= new Fecha();
	}
	public String getFecha(){return fecha.toString();}
	public String getArtista(){return artista;}
	public String getGenero(){return genero;}
	
	public boolean setFecha(String fecha){
		if(this.fecha==null)
			this.fecha=new Fecha();
		return this.fecha.setFecha(fecha);
	}
	public Disco(){}
	public String getFicha(){
		return "<html>Artista: "+artista+"<br>Nombre: "+nombre+"<br>Fecha: "+getFecha()+"<br>Genero: "+genero+"<br>Precio: $"+precio+"<br>Existencias: "+existencias+"<br> </html>";
	}
	public String getCarrito(){
		return "Nombre:"+nombre+"       $"+precio*cantidad+"       "+cantidad+"       $"+precio;
	}
	
}
