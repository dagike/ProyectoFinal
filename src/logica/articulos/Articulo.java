package logica.articulos;
public abstract class Articulo{
	protected int precio,existencias;
	public void setPrecio(int precio){this.precio=precio;}
	public void setExistencias(int existencias){this.existencias=existencias;}
	
	public int getPrecio(){return precio;}
	public int getExistencias(){return existencias;}

}
