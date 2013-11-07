import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class TextPanel extends JPanel {
	private JTextField textField;
	private JList<String> producto;
	private JList<String> autor;
	private JList<String> titulo;
	private JList<String> ficha;
	private String[] string = {"Libro", "Discos", "Peliculas"}; 

	/**
	 * Create the panel.
	 */
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
		
		JLabel lblAutor = new JLabel("Autor");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 3;
		gbc_lblAutor.gridy = 1;
		add(lblAutor, gbc_lblAutor);
		
		JLabel lblTitulo = new JLabel("Titulo");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 5;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblFicha = new JLabel("Ficha");
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
		
		ficha = new JList<String>();
		GridBagConstraints gbc_list_3 = new GridBagConstraints();
		gbc_list_3.insets = new Insets(0, 0, 5, 0);
		gbc_list_3.fill = GridBagConstraints.BOTH;
		gbc_list_3.gridx = 7;
		gbc_list_3.gridy = 2;
		add(ficha, gbc_list_3);
		
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
		
		JButton btnAadir = new JButton("A\u00F1adir");
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.gridx = 7;
		gbc_btnAadir.gridy = 4;
		add(btnAadir, gbc_btnAadir);
	}

}
