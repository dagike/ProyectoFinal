package vistas.principal;

import javax.swing.*;
import java.awt.*;


public class AgregarClientePanel extends JPanel {
	private JTextField tFNombreCompleto;
	private JTextField tFEmail;
	private ButtonGroup btnGroupTarjetas = new ButtonGroup();
	private JTextField tFNumeroTarjeta;

	public AgregarClientePanel() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{135, 289, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{40, 0, 0, 0, 0, 0, 30, 0, 30, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JTextArea tADireccion = new JTextArea();
		tADireccion.setLineWrap(true);
		tADireccion.setWrapStyleWord(true);
		GridBagConstraints gbc_tADireccion = new GridBagConstraints();
		gbc_tADireccion.gridheight = 3;
		gbc_tADireccion.insets = new Insets(0, 0, 5, 5);
		gbc_tADireccion.fill = GridBagConstraints.BOTH;
		gbc_tADireccion.gridx = 1;
		gbc_tADireccion.gridy = 2;
		add(new JScrollPane(tADireccion), gbc_tADireccion);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 3;
		add(lblDireccion, gbc_lblDireccion);
		
		JLabel lblEmail = new JLabel("e-mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 5;
		add(lblEmail, gbc_lblEmail);
		
		tFEmail = new JTextField();
		GridBagConstraints gbc_tFEmail = new GridBagConstraints();
		gbc_tFEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tFEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEmail.gridx = 1;
		gbc_tFEmail.gridy = 5;
		add(tFEmail, gbc_tFEmail);
		tFEmail.setColumns(10);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		btnGroupTarjetas.add(rdbtnVisa);
		GridBagConstraints gbc_rdbtnVisa = new GridBagConstraints();
		gbc_rdbtnVisa.anchor = GridBagConstraints.EAST;
		gbc_rdbtnVisa.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVisa.gridx = 0;
		gbc_rdbtnVisa.gridy = 7;
		add(rdbtnVisa, gbc_rdbtnVisa);
		
		JRadioButton rdbtnMastercard = new JRadioButton("MasterCard");
		btnGroupTarjetas.add(rdbtnMastercard);
		GridBagConstraints gbc_rdbtnMastercard = new GridBagConstraints();
		gbc_rdbtnMastercard.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMastercard.gridx = 1;
		gbc_rdbtnMastercard.gridy = 7;
		add(rdbtnMastercard, gbc_rdbtnMastercard);
		
		JRadioButton rdbtnAmericanExpress = new JRadioButton("American Express");
		btnGroupTarjetas.add(rdbtnAmericanExpress);
		GridBagConstraints gbc_rdbtnAmericanExpress = new GridBagConstraints();
		gbc_rdbtnAmericanExpress.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAmericanExpress.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAmericanExpress.gridx = 2;
		gbc_rdbtnAmericanExpress.gridy = 7;
		add(rdbtnAmericanExpress, gbc_rdbtnAmericanExpress);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta");
		GridBagConstraints gbc_lblNumeroDeTarjeta = new GridBagConstraints();
		gbc_lblNumeroDeTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDeTarjeta.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroDeTarjeta.gridx = 0;
		gbc_lblNumeroDeTarjeta.gridy = 9;
		add(lblNumeroDeTarjeta, gbc_lblNumeroDeTarjeta);
		
		tFNumeroTarjeta = new JTextField();
		GridBagConstraints gbc_tFNumeroTarjeta = new GridBagConstraints();
		gbc_tFNumeroTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_tFNumeroTarjeta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNumeroTarjeta.gridx = 1;
		gbc_tFNumeroTarjeta.gridy = 9;
		add(tFNumeroTarjeta, gbc_tFNumeroTarjeta);
		tFNumeroTarjeta.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 0;
		gbc_btnAceptar.gridy = 11;
		add(btnAceptar, gbc_btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 11;
		add(btnCancelar, gbc_btnCancelar);
		
		JButton btnSalir = new JButton("Salir");
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.anchor = GridBagConstraints.WEST;
		gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalir.gridx = 2;
		gbc_btnSalir.gridy = 11;
		add(btnSalir, gbc_btnSalir);

	}

}
