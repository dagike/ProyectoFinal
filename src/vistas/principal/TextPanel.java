package vistas.principal;
import logica.*;
import logica.articulos.*;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class TextPanel extends JPanel {
	private JTextField tFCantidad;
	private JScrollPane scrollPane;
	private String[] string = {"Libros", "Discos", "Peliculas","Juguetes"}; 
	private Usuario u;
	private Juguete juguete;
	private Disco disco;
	private Libro libro;
	private Pelicula pelicula;
	private int intTotal,cantidad;

	JLabel lblProducto,lblAutor,lblTitulo,lblFicha,ficha,lblCantidad;
	private JScrollPane scrollPane_1;
	private JList<String> producto;
	private JScrollPane scrollPane_2;
	private JList<String> autor;
	private JScrollPane scrollPane_3;
	private JList<String> titulo;
	JButton btnAadir;
	private JLabel lblErrorAadir, lblErrorCantidad;
	private JLabel lblTotal,total;
	
	public void setTotal(int total){intTotal=total;this.total.setText("$"+intTotal);}
	public void setUsuario(Usuario u){this.u=u;}
	public void inicio(){
		producto.setSelectedIndex(0);
		intTotal=0;
		total.setText("$"+intTotal);
		lblErrorCantidad.setText("");
		tFCantidad.setText("1");
	}
	private class Select implements ListSelectionListener{
     public void valueChanged(ListSelectionEvent e){
       if(e.getSource()==producto){
         if(producto.getSelectedValue()=="Libros"){
           lblAutor.setText("Autor");
           lblTitulo.setText("Titulo");
           lblFicha.setText("Ficha");
           autor.setListData(u.getAutores());
           autor.setSelectedIndex(0);
         }
         else if(producto.getSelectedValue()=="Discos"){
           lblAutor.setText("Artista");
           lblTitulo.setText("Titulo");
           lblFicha.setText("Ficha");
           autor.setListData(u.getArtistasDisco());
           autor.setSelectedIndex(0);
         }
         else if(producto.getSelectedValue()=="Peliculas"){
           lblAutor.setText("Director");
           lblTitulo.setText("Titulo");
           lblFicha.setText("Ficha");
           autor.setListData(u.getDirectorPelicula());
           autor.setSelectedIndex(0);
         }
         else if(producto.getSelectedValue()=="Juguetes"){
           lblAutor.setText("Fabricante");
           lblTitulo.setText("Nombre");
           lblFicha.setText("Ficha");
           autor.setListData(u.getFabricanteJuguete());
           autor.setSelectedIndex(0);
         }
       }
       else if(e.getSource()==autor){
         if(producto.getSelectedValue()=="Libros"){
           titulo.setListData(u.getLibroNombres( autor.getSelectedValue() ));
           titulo.setSelectedIndex(0);
         }
         else if(producto.getSelectedValue()=="Discos"){
           titulo.setListData(u.getDiscoNombres( autor.getSelectedValue() ));
           titulo.setSelectedIndex(0);
         }  
         else if(producto.getSelectedValue()=="Peliculas"){
           titulo.setListData(u.getPeliculaNombres( autor.getSelectedValue() ));
           titulo.setSelectedIndex(0);
         }
         else if(producto.getSelectedValue()=="Juguetes"){
           titulo.setListData(u.getJugueteNombres( autor.getSelectedValue() ));
           titulo.setSelectedIndex(0);
         }
       }
       else if(e.getSource()==titulo){
         if(producto.getSelectedValue()=="Libros"&&titulo.getSelectedValue()!=null){
				libro=null;
				libro=u.obtenerInfoLibro( titulo.getSelectedValue() );
				ficha.setText(libro.getFicha());
         }
         else if(producto.getSelectedValue()=="Discos"&&titulo.getSelectedValue()!=null){
				disco=null;
				disco=u.obtenerInfoDisco( titulo.getSelectedValue() );
				ficha.setText(disco.getFicha());
         }  
         else if(producto.getSelectedValue()=="Peliculas"&&titulo.getSelectedValue()!=null){
				pelicula=null;
				pelicula=u.obtenerInfoPelicula( titulo.getSelectedValue() );
				ficha.setText(pelicula.getFicha());
         }
         else if(producto.getSelectedValue()=="Juguetes"&&titulo.getSelectedValue()!=null){
				juguete=null;
				juguete=u.obtenerInfoJuguete( titulo.getSelectedValue() );
				ficha.setText(juguete.getFicha());
         }
       }
     }
   }
	public TextPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 100, 0, 100, 0, 200, 42, 200, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 200, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		setSize(1007, 624);
		
		lblProducto = new JLabel("Producto");
		GridBagConstraints gbc_lblProducto = new GridBagConstraints();
		gbc_lblProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto.gridx = 1;
		gbc_lblProducto.gridy = 1;
		add(lblProducto, gbc_lblProducto);
		
		lblAutor = new JLabel("Autor");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 3;
		gbc_lblAutor.gridy = 1;
		add(lblAutor, gbc_lblAutor);
		
		lblTitulo = new JLabel("Titulo");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 5;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		lblFicha = new JLabel("Ficha");
		GridBagConstraints gbc_lblFicha = new GridBagConstraints();
		gbc_lblFicha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFicha.gridx = 7;
		gbc_lblFicha.gridy = 1;
		add(lblFicha, gbc_lblFicha);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 2;
		add(scrollPane_1, gbc_scrollPane_1);
		
		producto = new JList<String>(string);
		scrollPane_1.setViewportView(producto);
		
		scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 3;
		gbc_scrollPane_2.gridy = 2;
		add(scrollPane_2, gbc_scrollPane_2);
		
		autor = new JList<String>();
		scrollPane_2.setViewportView(autor);
		
		scrollPane_3 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 5;
		gbc_scrollPane_3.gridy = 2;
		add(scrollPane_3, gbc_scrollPane_3);
		
		titulo = new JList<String>();
		scrollPane_3.setViewportView(titulo);
		
		lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.anchor = GridBagConstraints.EAST;
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidad.gridx = 1;
		gbc_lblCantidad.gridy = 4;
		add(lblCantidad, gbc_lblCantidad);
		
		tFCantidad = new JTextField();
		GridBagConstraints gbc_tFCantidad = new GridBagConstraints();
		gbc_tFCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_tFCantidad.gridx = 3;
		gbc_tFCantidad.gridy = 4;
		add(tFCantidad, gbc_tFCantidad);
		tFCantidad.setColumns(10);
		
		lblErrorCantidad = new JLabel("");
		lblErrorCantidad.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorCantidad = new GridBagConstraints();
		gbc_lblErrorCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorCantidad.gridx = 5;
		gbc_lblErrorCantidad.gridy = 4;
		gbc_lblErrorCantidad.gridwidth = 2;
		add(lblErrorCantidad, gbc_lblErrorCantidad);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 7;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		ficha = new JLabel("");
		ficha.setBackground(Color.white);
		ficha.setOpaque(true);
		scrollPane.setViewportView(ficha);
		
		btnAadir = new JButton("A\u00f1adir");
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 7;
		gbc_btnAadir.gridy = 4;
		add(btnAadir, gbc_btnAadir);
		
		lblErrorAadir = new JLabel("");
		lblErrorAadir.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorAadir = new GridBagConstraints();
		gbc_lblErrorAadir.insets = new Insets(0, 0, 5, 0);
		gbc_lblErrorAadir.gridx = 8;
		gbc_lblErrorAadir.gridy = 4;
		add(lblErrorAadir, gbc_lblErrorAadir);
		
		lblTotal = new JLabel("Total");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lblTotal.gridx = 1;
		gbc_lblTotal.gridy = 5;
		add(lblTotal, gbc_lblTotal);
		
		total = new JLabel();
		total.setBackground(Color.white);
		total.setOpaque(true);
		GridBagConstraints gbc_tFTotal = new GridBagConstraints();
		gbc_tFTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFTotal.insets = new Insets(0, 0, 0, 5);
		gbc_tFTotal.gridx = 3;
		gbc_tFTotal.gridy = 5;
		add(total, gbc_tFTotal);
		
		Select accion= new Select();
		producto.addListSelectionListener(accion);
		autor.addListSelectionListener(accion);
		titulo.addListSelectionListener(accion);
	}  
   public JButton getAgregar(){return btnAadir;}
	public boolean checkCantidad(int a){
		boolean error = false;
		if(tFCantidad.getText().equals("")){
			error=true;
			lblErrorCantidad.setText("Ponga un numero");
		}
		else{
			for(int i = 0; i < tFCantidad.getText().length(); i++)
				if(tFCantidad.getText().charAt(i) < '0' || tFCantidad.getText().charAt(i) > '9'){
					error = true;
					lblErrorCantidad.setText("Solo Numeros");
					break;
			}
			if(!error){
				cantidad=Integer.parseInt(tFCantidad.getText());
				if(cantidad==0){
					error = true;
					lblErrorCantidad.setText("Mayor a 0");	
				}
				else if(producto.getSelectedValue()=="Libros"&&libro!=null){
					if(cantidad>libro.getExistencias()){
						error = true;
						lblErrorCantidad.setText("No hay tantos productos");	
					}
				}
				else if(producto.getSelectedValue()=="Discos"&&disco!=null){
					if(cantidad>disco.getExistencias()){
						error = true;
						lblErrorCantidad.setText("No hay tantos productos");	
					}
				}  
				else if(producto.getSelectedValue()=="Peliculas"&&pelicula!=null){
					if(cantidad>pelicula.getExistencias()){
						error = true;
						lblErrorCantidad.setText("No hay tantos productos");	
					}
				}
				else if(producto.getSelectedValue()=="Juguetes"&&juguete!=null){
					if(cantidad>juguete.getExistencias()){
						error = true;
						lblErrorCantidad.setText("No hay tantos productos");	
					}
				}
			}
		}
		if(!error)
			lblErrorCantidad.setText("");
		if(a==0)
			lblErrorCantidad.setText("No articulos repetidos");
		if(a==-1)
			lblErrorCantidad.setText("El carrito esta vacio");
		return error;
	}
	public Articulo getArticulo(){
		if(producto.getSelectedValue()=="Libros"&&libro!=null){
			libro.setCantidad(cantidad);
			return libro;
		}
		else if(producto.getSelectedValue()=="Discos"&&disco!=null){
			disco.setCantidad(cantidad);
			return disco;
		}  
		else if(producto.getSelectedValue()=="Peliculas"&&pelicula!=null){
			pelicula.setCantidad(cantidad);
			return pelicula;
		}
		else if(producto.getSelectedValue()=="Juguetes"&&juguete!=null){
			juguete.setCantidad(cantidad);
			return juguete;
		}
		return null;
	}
}
