package vistas.principal;

import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class AgregarClientePanel extends JPanel {
	private JLabel lblNombreCompleto, lblErrorNombreCompleto;
	private JTextField tFNombreCompleto;
	private JLabel lblDireccion, lblErrorDireccion;
	private JTextArea tADireccion;
	private JLabel lblEmail, lblErrorEmail;
	private JTextField tFEmail;
	private JRadioButton rdbtnVisa, rdbtnMastercard, rdbtnAmericanExpress;
	private ButtonGroup btnGroupTarjetas = new ButtonGroup();
	private JLabel lblNumeroTarjeta, lblErrorNumeroTarjeta;
	private JTextField tFNumeroTarjeta;
	private JButton btnAceptar, btnCancelar, btnSalir;
	
	public JButton getAceptar(){return btnAceptar;}
	public JButton getCancelar(){return btnCancelar;}
	public JButton getSalir(){return btnSalir;}

	public AgregarClientePanel() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{135, 289, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{40, 0, 0, 0, 0, 0, 30, 0, 30, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNombreCompleto = new JLabel("Nombre Completo");
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
		
		lblErrorNombreCompleto = new JLabel("");
		lblErrorNombreCompleto.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorNombreCompleto = new GridBagConstraints();
		gbc_lblErrorNombreCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorNombreCompleto.gridx = 2;
		gbc_lblErrorNombreCompleto.gridy = 1;
		add(lblErrorNombreCompleto, gbc_lblErrorNombreCompleto);
		
		tADireccion = new JTextArea();
		tADireccion.setLineWrap(true);
		tADireccion.setWrapStyleWord(true);
		GridBagConstraints gbc_tADireccion = new GridBagConstraints();
		gbc_tADireccion.gridheight = 3;
		gbc_tADireccion.insets = new Insets(0, 0, 5, 5);
		gbc_tADireccion.fill = GridBagConstraints.BOTH;
		gbc_tADireccion.gridx = 1;
		gbc_tADireccion.gridy = 2;
		add(new JScrollPane(tADireccion), gbc_tADireccion);
		
		lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 3;
		add(lblDireccion, gbc_lblDireccion);
		
		lblErrorDireccion = new JLabel("");
		lblErrorDireccion.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorDireccion = new GridBagConstraints();
		gbc_lblErrorDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorDireccion.gridx = 2;
		gbc_lblErrorDireccion.gridy = 3;
		add(lblErrorDireccion, gbc_lblErrorDireccion);
		
		lblEmail = new JLabel("e-mail");
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
		
		lblErrorEmail = new JLabel("");
		lblErrorEmail.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorEmail = new GridBagConstraints();
		gbc_lblErrorEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorEmail.gridx = 2;
		gbc_lblErrorEmail.gridy = 5;
		add(lblErrorEmail, gbc_lblErrorEmail);
		
		rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setSelected(true);
		btnGroupTarjetas.add(rdbtnVisa);
		GridBagConstraints gbc_rdbtnVisa = new GridBagConstraints();
		gbc_rdbtnVisa.anchor = GridBagConstraints.EAST;
		gbc_rdbtnVisa.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVisa.gridx = 0;
		gbc_rdbtnVisa.gridy = 7;
		add(rdbtnVisa, gbc_rdbtnVisa);
		
		rdbtnMastercard = new JRadioButton("MasterCard");
		btnGroupTarjetas.add(rdbtnMastercard);
		GridBagConstraints gbc_rdbtnMastercard = new GridBagConstraints();
		gbc_rdbtnMastercard.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMastercard.gridx = 1;
		gbc_rdbtnMastercard.gridy = 7;
		add(rdbtnMastercard, gbc_rdbtnMastercard);
		
		rdbtnAmericanExpress = new JRadioButton("American Express");
		btnGroupTarjetas.add(rdbtnAmericanExpress);
		GridBagConstraints gbc_rdbtnAmericanExpress = new GridBagConstraints();
		gbc_rdbtnAmericanExpress.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAmericanExpress.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAmericanExpress.gridx = 2;
		gbc_rdbtnAmericanExpress.gridy = 7;
		add(rdbtnAmericanExpress, gbc_rdbtnAmericanExpress);
		
		lblNumeroTarjeta = new JLabel("Numero de Tarjeta");
		GridBagConstraints gbc_lblNumeroTarjeta = new GridBagConstraints();
		gbc_lblNumeroTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroTarjeta.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroTarjeta.gridx = 0;
		gbc_lblNumeroTarjeta.gridy = 9;
		add(lblNumeroTarjeta, gbc_lblNumeroTarjeta);
		
		tFNumeroTarjeta = new JTextField();
		GridBagConstraints gbc_tFNumeroTarjeta = new GridBagConstraints();
		gbc_tFNumeroTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_tFNumeroTarjeta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNumeroTarjeta.gridx = 1;
		gbc_tFNumeroTarjeta.gridy = 9;
		add(tFNumeroTarjeta, gbc_tFNumeroTarjeta);
		tFNumeroTarjeta.setColumns(10);
		
		lblErrorNumeroTarjeta = new JLabel("");
		lblErrorNumeroTarjeta.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorNumeroTarjeta = new GridBagConstraints();
		gbc_lblErrorNumeroTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorNumeroTarjeta.gridx = 2;
		gbc_lblErrorNumeroTarjeta.gridy = 9;
		add(lblErrorNumeroTarjeta, gbc_lblErrorNumeroTarjeta);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 0;
		gbc_btnAceptar.gridy = 11;
		add(btnAceptar, gbc_btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 11;
		add(btnCancelar, gbc_btnCancelar);
		
		btnSalir = new JButton("Salir");
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.anchor = GridBagConstraints.WEST;
		gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalir.gridx = 2;
		gbc_btnSalir.gridy = 11;
		add(btnSalir, gbc_btnSalir);

	}
	
	public boolean checkTextFields(){
		boolean error = false;
		
		if(tFNombreCompleto.getText().equals("")){
			lblErrorNombreCompleto.setText("Campo Necesario");
			error = true;
		}else{
			lblErrorNombreCompleto.setText("");
		}
		
		if(tADireccion.getText().equals("")){
			lblErrorDireccion.setText("Campo Necesario");
			error = true;
		}else{
			lblErrorDireccion.setText("");
		}
		
		if(tFEmail.getText().equals("")){
			lblErrorEmail.setText("Campo Necesario");
			error = true;
		}else{
			lblErrorEmail.setText("");
		}
		
		if(tFNumeroTarjeta.getText().equals("")){
			lblErrorNumeroTarjeta.setText("Campo Necesario");
			error = true;
		}else{
			lblErrorNumeroTarjeta.setText("");
		}
			
		return error;
	}
	
	public void cancelar(){
		tFNombreCompleto.setText("");
		tADireccion.setText("");
		tFEmail.setText("");
		tFNumeroTarjeta.setText("");
		lblErrorNombreCompleto.setText("");
		lblErrorDireccion.setText("");
		lblErrorEmail.setText("");
		lblErrorNumeroTarjeta.setText("");
		rdbtnVisa.setSelected(true);
	}

}
