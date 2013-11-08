package vistas.principal;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;


@SuppressWarnings("serial")
public class Cart extends JPanel {
	private JList<String> listaDeCompra;
	/**
	 * Create the panel.
	 */
	public Cart() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{8, 281, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 172, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCarrito = new JLabel("Carrito");
		GridBagConstraints gbc_lblCarrito = new GridBagConstraints();
		gbc_lblCarrito.insets = new Insets(0, 0, 5, 0);
		gbc_lblCarrito.gridx = 1;
		gbc_lblCarrito.gridy = 1;
		add(lblCarrito, gbc_lblCarrito);
		
		listaDeCompra = new JList<String>();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		add(listaDeCompra, gbc_list);

	}

}
