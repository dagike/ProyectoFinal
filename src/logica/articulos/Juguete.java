package logica.articulos;
public class Juguete extends Articulo{
	private String nombre,fabricante;
	private int edadApropiada;
	public Juguete(String nombre,String fabricante,int edadApropiada,int precio,int existencias){
		this.nombre=nombre;
		this.fabricante=fabricante;
		this.edadApropiada=edadApropiada;
		this.precio=precio;
		this.existencias=existencias;
	}
	public String getNombre(){return nombre;}
	public String getFabricante(){return fabricante;}
	public int getEdad(){return edadApropiada;}
}
