package logica.articulos;
public class Juguete extends Articulo{
	private String nombre,fabricante;
	private int edadApropiada;
	public Juguete(String nombre,String fabricante,String edadApropiada,String precio,String existencias){
		this.nombre=nombre;
		this.fabricante=fabricante;
		this.edadApropiada=Integer.parseInt(edadApropiada);
		this.precio=Integer.parseInt(precio);
		this.existencias=Integer.parseInt(existencias);
	}
	public String getNombre(){return nombre;}
	public String getFabricante(){return fabricante;}
	public int getEdad(){return edadApropiada;}
	public Juguete(){}
}
