package vistas.principal;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class AgregarClientePanel extends JPanel {
	private JTextField tFNombreCompleto;
	private JTextField tFDireccion;
	private JTextField tFEmail;
	private ButtonGroup btnGroupTarjetas = new ButtonGroup();
	private JTextField tFNumeroTarjeta;

	/**
	 * Create the panel.
	 */
	public AgregarClientePanel() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{112, 180, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 30, 0, 30, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		GridBagConstraints gbc_lblNombreCompleto = new GridBagConstraints();
		gbc_lblNombreCompleto.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCompleto.gridx = 0;
		gbc_lblNombreCompleto.gridy = 1;
		add(lblNombreCompleto, gbc_lblNombreCompleto);
		
		tFNombreCompleto = new JTextField();
		GridBagConstraints gbc_tFNombreCompleto = new GridBagConstraints();
		gbc_tFNombreCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_tFNombreCompleto.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNombreCompleto.gridx = 1;
		gbc_tFNombreCompleto.gridy = 1;
		add(tFNombreCompleto, gbc_tFNombreCompleto);
		tFNombreCompleto.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 2;
		add(lblDireccion, gbc_lblDireccion);
		
		tFDireccion = new JTextField();
		GridBagConstraints gbc_tFDireccion = new GridBagConstraints();
		gbc_tFDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_tFDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFDireccion.gridx = 1;
		gbc_tFDireccion.gridy = 2;
		add(tFDireccion, gbc_tFDireccion);
		tFDireccion.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 3;
		add(lblEmail, gbc_lblEmail);
		
		tFEmail = new JTextField();
		GridBagConstraints gbc_tFEmail = new GridBagConstraints();
		gbc_tFEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tFEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEmail.gridx = 1;
		gbc_tFEmail.gridy = 3;
		add(tFEmail, gbc_tFEmail);
		tFEmail.setColumns(10);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		btnGroupTarjetas.add(rdbtnVisa);
		GridBagConstraints gbc_rdbtnVisa = new GridBagConstraints();
		gbc_rdbtnVisa.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVisa.gridx = 0;
		gbc_rdbtnVisa.gridy = 5;
		add(rdbtnVisa, gbc_rdbtnVisa);
		
		JRadioButton rdbtnMastercard = new JRadioButton("MasterCard");
		btnGroupTarjetas.add(rdbtnMastercard);
		GridBagConstraints gbc_rdbtnMastercard = new GridBagConstraints();
		gbc_rdbtnMastercard.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMastercard.gridx = 1;
		gbc_rdbtnMastercard.gridy = 5;
		add(rdbtnMastercard, gbc_rdbtnMastercard);
		
		JRadioButton rdbtnAmericanExpress = new JRadioButton("American Express");
		btnGroupTarjetas.add(rdbtnAmericanExpress);
		GridBagConstraints gbc_rdbtnAmericanExpress = new GridBagConstraints();
		gbc_rdbtnAmericanExpress.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAmericanExpress.gridx = 2;
		gbc_rdbtnAmericanExpress.gridy = 5;
		add(rdbtnAmericanExpress, gbc_rdbtnAmericanExpress);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta");
		GridBagConstraints gbc_lblNumeroDeTarjeta = new GridBagConstraints();
		gbc_lblNumeroDeTarjeta.insets = new Insets(0, 0, 0, 5);
		gbc_lblNumeroDeTarjeta.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroDeTarjeta.gridx = 0;
		gbc_lblNumeroDeTarjeta.gridy = 7;
		add(lblNumeroDeTarjeta, gbc_lblNumeroDeTarjeta);
		
		tFNumeroTarjeta = new JTextField();
		GridBagConstraints gbc_tFNumeroTarjeta = new GridBagConstraints();
		gbc_tFNumeroTarjeta.insets = new Insets(0, 0, 0, 5);
		gbc_tFNumeroTarjeta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNumeroTarjeta.gridx = 1;
		gbc_tFNumeroTarjeta.gridy = 7;
		add(tFNumeroTarjeta, gbc_tFNumeroTarjeta);
		tFNumeroTarjeta.setColumns(10);

	}

}
