package logica.articulos;
public abstract class Articulo{
	protected int precio,existencias,cantidad;
	public void setPrecio(int precio){this.precio=precio;}
	public void setExistencias(int existencias){this.existencias=existencias;}
	public void setCantidad(int cantidad){this.cantidad=cantidad;}
	
	public int getPrecio(){return precio;}
	public int getExistencias(){return existencias;}
	public abstract String getFicha();
}
