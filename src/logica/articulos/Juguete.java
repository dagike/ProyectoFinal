package logica.articulos;
public class Juguete extends Articulo{
	private String nombre,fabricante;
	private int edadApropiada;
	public Juguete(String nombre,String fabricante,String edadApropiada,String precio,String existencias){
		this.nombre=nombre;
		this.fabricante=fabricante;
		this.edadApropiada=(edadApropiada==null)?this.edadApropiada=0:Integer.parseInt(edadApropiada);
		this.precio=(precio==null)?this.precio=0:Integer.parseInt(precio);
		this.existencias=(existencias==null)?this.existencias=0:Integer.parseInt(existencias);
	}
	public String getNombre(){return nombre;}
	public String getFabricante(){return fabricante;}
	public int getEdad(){return edadApropiada;}
	public Juguete(){}
	public String getFicha(){
		return "<html>Fabricante: "+fabricante+"<br>Nombre: "+nombre+"<br>Edad Apropiada: "+edadApropiada+"<br>Precio: $"+precio+"<br>Existencias: "+existencias+"<br> </html>";
	}
}
