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
	private JTextField textField;
	private JList<String> producto;
	private JList<String> autor;
	private JList<String> titulo;
	private JScrollPane scrollPane;
	private String[] string = {"Libros", "Discos", "Peliculas","Juguetes"}; 
	private Usuario u;
	private Juguete juguete;
	private Disco disco;
	private Libro libro;
	private Pelicula pelicula;

	JLabel lblAutor,lblTitulo,lblFicha,ficha;
	
	public void setUsuario(Usuario u){this.u=u;}
	public void inicio(){producto.setSelectedIndex(0);}
	public TextPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 100, 0, 100, 0, 200, 0, 200, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 200, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		setSize(750, 450);
		
		JLabel lblProducto = new JLabel("Producto");
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
		gbc_lblFicha.insets = new Insets(0, 0, 5, 0);
		gbc_lblFicha.gridx = 7;
		gbc_lblFicha.gridy = 1;
		add(lblFicha, gbc_lblFicha);
		
		producto = new JList<String>(string);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		add(producto, gbc_list);
		
		autor = new JList<String>();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 3;
		gbc_list_1.gridy = 2;
		add(autor, gbc_list_1);
		
		titulo = new JList<String>();
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.insets = new Insets(0, 0, 5, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 5;
		gbc_list_2.gridy = 2;
		add(titulo, gbc_list_2);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidad.gridx = 3;
		gbc_lblCantidad.gridy = 4;
		add(lblCantidad, gbc_lblCantidad);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 4;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 7;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		ficha = new JLabel("");
		ficha.setBackground(Color.white);
		ficha.setOpaque(true);
		scrollPane.setViewportView(ficha);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.gridx = 7;
		gbc_btnAadir.gridy = 4;
		add(btnAadir, gbc_btnAadir);
		
		Select accion= new Select();
		producto.addListSelectionListener(accion);
		autor.addListSelectionListener(accion);
		titulo.addListSelectionListener(accion);
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
			}
			else if(e.getSource()==titulo){
				if(producto.getSelectedValue()=="Libros"){
					
				}
			}
		}
	}
}
