package vistas.principal;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import javax.swing.JScrollPane;
import logica.articulos.*;
import java.util.*;


@SuppressWarnings("serial")
public class Cart extends JPanel {
	JList<String> carrito;
	public Cart() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{8, 281, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 172, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCarrito = new JLabel("Carrito");
		GridBagConstraints gbc_lblCarrito = new GridBagConstraints();
		gbc_lblCarrito.insets = new Insets(0, 0, 5, 0);
		gbc_lblCarrito.gridx = 1;
		gbc_lblCarrito.gridy = 1;
		add(lblCarrito, gbc_lblCarrito);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		carrito = new JList<String>();
		scrollPane.setViewportView(carrito);
	}
	public void agregarCarrito(Vector<Articulo> articulos){
		Vector<String> muestras= new Vector<String>();
		for(int i=0;i<articulos.size();i++){
			muestras.add(articulos.get(i).getCarrito());
		}
		carrito.setListData(muestras);
	}
	public void inicio(){carrito.setListData(new Vector<String>());}
	
}
