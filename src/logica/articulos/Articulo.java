package logica.articulos;
public abstract class Articulo{
	protected int precio,existencias,cantidad;
	protected String nombre;
	public void setPrecio(int precio){this.precio=precio;}
	public void setExistencias(int existencias){this.existencias=existencias;}
	public void setCantidad(int cantidad){this.cantidad=cantidad;}
	
	public int getCantidad(){return cantidad;}
	public int getTotal(){return precio*cantidad;}
	public String getNombre(){return nombre;}
	public int getPrecio(){return precio;}
	public int getExistencias(){return existencias;}
	public abstract String getFicha();
	public abstract String getCarrito();
}
