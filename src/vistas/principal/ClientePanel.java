package vistas.principal;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;

public class ClientePanel extends JPanel {
	private JTextField tFEmail;
	private JLabel lblErrorEmail;
	JButton btnAceptar,btnCancelar,btnNuevoCliente;
	
	public JButton getAceptar(){return btnAceptar;}
	public JButton getCancelar(){return btnCancelar;}
	public JButton getNuevo(){return btnNuevoCliente;}
	
	public String getEmail(){return tFEmail.getText();}

	public ClientePanel() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{63, 0, 0, 0, 45, 0};
		gridBagLayout.rowHeights = new int[]{58, 44, 0, 59, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.gridwidth = 2;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 1;
		add(lblCliente, gbc_lblCliente);
		
		JLabel lblEmail = new JLabel("E-mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 2;
		add(lblEmail, gbc_lblEmail);
		
		tFEmail = new JTextField();
		GridBagConstraints gbc_tFEmail = new GridBagConstraints();
		gbc_tFEmail.gridwidth = 2;
		gbc_tFEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tFEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEmail.gridx = 2;
		gbc_tFEmail.gridy = 2;
		add(tFEmail, gbc_tFEmail);
		tFEmail.setColumns(10);
		
		lblErrorEmail = new JLabel("");
		lblErrorEmail.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorEmail = new GridBagConstraints();
		gbc_lblErrorEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblErrorEmail.gridx = 4;
		gbc_lblErrorEmail.gridy = 2;
		add(lblErrorEmail, gbc_lblErrorEmail);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 1;
		gbc_btnAceptar.gridy = 4;
		add(btnAceptar, gbc_btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 4;
		add(btnCancelar, gbc_btnCancelar);
		
		btnNuevoCliente = new JButton("Nuevo Cliente");
		GridBagConstraints gbc_btnNuevoCliente = new GridBagConstraints();
		gbc_btnNuevoCliente.insets = new Insets(0, 0, 0, 5);
		gbc_btnNuevoCliente.gridx = 3;
		gbc_btnNuevoCliente.gridy = 4;
		add(btnNuevoCliente, gbc_btnNuevoCliente);

	}
	
	public boolean checkEmail(boolean esta){
		boolean error = false;
		if(tFEmail.getText().equals("")){
			lblErrorEmail.setText("Campo Necesario");
			error = true;
		}
		else if(!esta){
			lblErrorEmail.setText("No se encontro");
			error = true;
		}
		else
			lblErrorEmail.setText("");
		return error;
	}
}
