<<<<<<< HEAD:src/vistas/admin/NuevoUsuario.java
package vistas.admin;
import javax.swing.*;

import java.awt.*;

import logica.Usuario;

@SuppressWarnings("serial")
public class NuevoUsuario extends JPanel{
	private JLabel bienvenida,lNombre,lApellidoPaterno,lApellidoMaterno,lEmail,lPassword,lNombreUsuario;
	private JLabel lConfirmarPassword,lTipoDeUsuario;
	private JLabel errorNombre,errorApellidoPaterno,errorApellidoMaterno,errorEmail,errorNombreUsuario,errorPassword;
	private JLabel errorConfirmarPassword,lAgregarNuevoUsuario;
	
	private JRadioButton rbAdministrador,rbEmpleado;
	private JButton bAceptar,bCancelar;
	private JPasswordField tPassword,tConfirmarPassword;
	private JTextField tNombre,tApellidoPaterno,tApellidoMaterno,tEmail,tNombreUsuario;
	private Usuario u;
	public NuevoUsuario() {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{28, 115, 150, 120, 0, 50, 0};
		gridBagLayout.rowHeights = new int[]{0, 15, 25, 28, 28, 28, 28, 25, 0, 0, 0, 25, 0, 25, 0, 20};
		gridBagLayout.columnWeights = new double[]{0, 0,0, 0, 0, 0, 0};
		gridBagLayout.rowWeights = new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		setLayout(gridBagLayout);

		bienvenida = new JLabel("Bienvenido ");
		GridBagConstraints gbc_bienvenida = new GridBagConstraints();
		gbc_bienvenida.gridwidth = 2;
		gbc_bienvenida.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenida.anchor = GridBagConstraints.NORTH;
		gbc_bienvenida.gridx = 1;
		gbc_bienvenida.gridy = 1;
		add(bienvenida, gbc_bienvenida);
		
		lAgregarNuevoUsuario = new JLabel("Agregar Nuevo Usuario");
		GridBagConstraints gbc_lblAgregarNuevoUsuario = new GridBagConstraints();
		gbc_lblAgregarNuevoUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAgregarNuevoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregarNuevoUsuario.gridx = 3;
		gbc_lblAgregarNuevoUsuario.gridy = 1;
		gbc_lblAgregarNuevoUsuario.gridwidth = 2;
		add(lAgregarNuevoUsuario, gbc_lblAgregarNuevoUsuario);
		
		errorNombre = new JLabel("");
		lNombre=new JLabel("Nombre:");
		tNombre = new JTextField();
		errorNombre.setForeground(Color.RED);
		GridBagConstraints gbc_errorNombre = new GridBagConstraints();
		gbc_errorNombre.anchor = GridBagConstraints.EAST;
		gbc_errorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_errorNombre.gridx = 1;
		gbc_errorNombre.gridy = 3;
		add(errorNombre, gbc_errorNombre);
		GridBagConstraints gbc_lNombre = new GridBagConstraints();
		gbc_lNombre.anchor = GridBagConstraints.EAST;
		gbc_lNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lNombre.gridx = 2;
		gbc_lNombre.gridy = 3;
		add(lNombre, gbc_lNombre);
		GridBagConstraints gbc_tNombre = new GridBagConstraints();
		gbc_tNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tNombre.gridx = 3;
		gbc_tNombre.gridy = 3;
		add(tNombre, gbc_tNombre);
		tNombre.setColumns(15);
		
		errorApellidoPaterno = new JLabel("");
		errorApellidoPaterno.setForeground(Color.RED);
		GridBagConstraints gbc_errorApellidoPaterno = new GridBagConstraints();
		gbc_errorApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_errorApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_errorApellidoPaterno.gridx = 1;
		gbc_errorApellidoPaterno.gridy = 4;
		add(errorApellidoPaterno, gbc_errorApellidoPaterno);
		
		lApellidoPaterno = new JLabel("Apellido Paterno:");
		GridBagConstraints gbc_lApellidoPaterno = new GridBagConstraints();
		gbc_lApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_lApellidoPaterno.gridx = 2;
		gbc_lApellidoPaterno.gridy = 4;
		add(lApellidoPaterno, gbc_lApellidoPaterno);
		
		tApellidoPaterno = new JTextField();
		GridBagConstraints gbc_tApellidoPaterno = new GridBagConstraints();
		gbc_tApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_tApellidoPaterno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tApellidoPaterno.gridx = 3;
		gbc_tApellidoPaterno.gridy = 4;
		add(tApellidoPaterno, gbc_tApellidoPaterno);
		
		errorApellidoMaterno = new JLabel("");
		errorApellidoMaterno.setHorizontalAlignment(SwingConstants.TRAILING);
		errorApellidoMaterno.setForeground(Color.RED);
		GridBagConstraints gbc_errorApellidoMaterno = new GridBagConstraints();
		gbc_errorApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_errorApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_errorApellidoMaterno.gridx = 1;
		gbc_errorApellidoMaterno.gridy = 5;
		add(errorApellidoMaterno, gbc_errorApellidoMaterno);
		
		lApellidoMaterno = new JLabel("Apellido Materno:");
		GridBagConstraints gbc_lApellidoMaterno = new GridBagConstraints();
		gbc_lApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_lApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lApellidoMaterno.gridx = 2;
		gbc_lApellidoMaterno.gridy = 5;
		add(lApellidoMaterno, gbc_lApellidoMaterno);
		
		tApellidoMaterno = new JTextField();
		GridBagConstraints gbc_tApellidoMaterno = new GridBagConstraints();
		gbc_tApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_tApellidoMaterno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tApellidoMaterno.gridx = 3;
		gbc_tApellidoMaterno.gridy = 5;
		add(tApellidoMaterno, gbc_tApellidoMaterno);
		tApellidoMaterno.setColumns(10);
		
		errorEmail = new JLabel("");
		errorEmail.setForeground(Color.RED);
		GridBagConstraints gbc_errorEmail = new GridBagConstraints();
		gbc_errorEmail.anchor = GridBagConstraints.EAST;
		gbc_errorEmail.insets = new Insets(0, 0, 5, 5);
		gbc_errorEmail.gridx = 1;
		gbc_errorEmail.gridy = 6;
		add(errorEmail, gbc_errorEmail);
		
		lEmail = new JLabel("e-mail:");
		GridBagConstraints gbc_lEmail = new GridBagConstraints();
		gbc_lEmail.anchor = GridBagConstraints.EAST;
		gbc_lEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lEmail.gridx = 2;
		gbc_lEmail.gridy = 6;
		add(lEmail, gbc_lEmail);
		
		tEmail = new JTextField();
		GridBagConstraints gbc_tEmail = new GridBagConstraints();
		gbc_tEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tEmail.gridx = 3;
		gbc_tEmail.gridy = 6;
		add(tEmail, gbc_tEmail);
		
		errorNombreUsuario = new JLabel("");
		errorNombreUsuario.setForeground(Color.RED);
		GridBagConstraints gbc_errorNombreUsuario = new GridBagConstraints();
		gbc_errorNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_errorNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_errorNombreUsuario.gridx = 1;
		gbc_errorNombreUsuario.gridy = 8;
		add(errorNombreUsuario, gbc_errorNombreUsuario);
		
		lNombreUsuario = new JLabel("Nombre de Usuario:");
		GridBagConstraints gbc_lNombreUsuario = new GridBagConstraints();
		gbc_lNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_lNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lNombreUsuario.gridx = 2;
		gbc_lNombreUsuario.gridy = 8;
		add(lNombreUsuario, gbc_lNombreUsuario);
		
		tNombreUsuario = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 8;
		add(tNombreUsuario, gbc_textField_2);
		
		errorPassword = new JLabel("");
		errorPassword.setForeground(Color.RED);
		GridBagConstraints gbc_errorPassword = new GridBagConstraints();
		gbc_errorPassword.anchor = GridBagConstraints.EAST;
		gbc_errorPassword.insets = new Insets(0, 0, 5, 5);
		gbc_errorPassword.gridx = 1;
		gbc_errorPassword.gridy = 9;
		add(errorPassword, gbc_errorPassword);
		
		lPassword = new JLabel("Password:");
		lPassword.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lPassword = new GridBagConstraints();
		gbc_lPassword.anchor = GridBagConstraints.EAST;
		gbc_lPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lPassword.gridx = 2;
		gbc_lPassword.gridy = 9;
		add(lPassword, gbc_lPassword);
		
		tPassword = new JPasswordField();
		tPassword.setHorizontalAlignment(SwingConstants.LEFT);
		tPassword.setBackground(Color.WHITE);
		GridBagConstraints gbc_tPassword = new GridBagConstraints();
		gbc_tPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPassword.insets = new Insets(0, 0, 5, 5);
		gbc_tPassword.gridx = 3;
		gbc_tPassword.gridy = 9;
		add(tPassword, gbc_tPassword);
		
		errorConfirmarPassword = new JLabel("");
		errorConfirmarPassword.setForeground(Color.RED);
		GridBagConstraints gbc_errorConfirmarPassword = new GridBagConstraints();
		gbc_errorConfirmarPassword.anchor = GridBagConstraints.EAST;
		gbc_errorConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_errorConfirmarPassword.gridx = 1;
		gbc_errorConfirmarPassword.gridy = 10;
		add(errorConfirmarPassword, gbc_errorConfirmarPassword);
		
		lConfirmarPassword = new JLabel("Confirmar Password:");
		GridBagConstraints gbc_lConfirmarPassword = new GridBagConstraints();
		gbc_lConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lConfirmarPassword.anchor = GridBagConstraints.EAST;
		gbc_lConfirmarPassword.gridx = 2;
		gbc_lConfirmarPassword.gridy = 10;
		add(lConfirmarPassword, gbc_lConfirmarPassword);
		
		tConfirmarPassword = new JPasswordField();
		GridBagConstraints gbc_tConfirmarPassword = new GridBagConstraints();
		gbc_tConfirmarPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_tConfirmarPassword.gridx = 3;
		gbc_tConfirmarPassword.gridy = 10;
		add(tConfirmarPassword, gbc_tConfirmarPassword);
		
		lTipoDeUsuario = new JLabel("Tipo de Usuario:");
		GridBagConstraints gbc_lTipoDeUsuario = new GridBagConstraints();
		gbc_lTipoDeUsuario.anchor = GridBagConstraints.EAST;
		gbc_lTipoDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lTipoDeUsuario.gridx = 2;
		gbc_lTipoDeUsuario.gridy = 12;
		add(lTipoDeUsuario, gbc_lTipoDeUsuario);
		
		rbAdministrador = new JRadioButton("Administrador");
		rbAdministrador.setBackground(null);
		GridBagConstraints gbc_rbAdministrador = new GridBagConstraints();
		gbc_rbAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_rbAdministrador.gridx = 3;
		gbc_rbAdministrador.gridy = 12;
		add(rbAdministrador, gbc_rbAdministrador);
		
		rbEmpleado = new JRadioButton("Empleado");
		rbEmpleado.setBackground(null);
		GridBagConstraints gbc_rbEmpleado = new GridBagConstraints();
		gbc_rbEmpleado.anchor = GridBagConstraints.WEST;
		gbc_rbEmpleado.insets = new Insets(0, 0, 5, 5);
		gbc_rbEmpleado.gridx = 4;
		gbc_rbEmpleado.gridy = 12;
		add(rbEmpleado, gbc_rbEmpleado);
		
		bAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_bAceptar = new GridBagConstraints();
		gbc_bAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_bAceptar.gridx = 3;
		gbc_bAceptar.gridy = 14;
		add(bAceptar, gbc_bAceptar);
		
		bCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_bCancelar = new GridBagConstraints();
		gbc_bCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_bCancelar.gridx = 4;
		gbc_bCancelar.gridy = 14;
		add(bCancelar, gbc_bCancelar);
		
		rbAdministrador.setSelected(true);
		ButtonGroup grupo = new ButtonGroup();
      grupo.add(rbAdministrador);
      grupo.add(rbEmpleado);
		
	}

	public JButton getCancelar(){return bCancelar;}
	public JButton getAceptar(){return bAceptar;}
	public void cancelar(){
		tNombre.setText("");
		tApellidoPaterno.setText("");
		tApellidoMaterno.setText("");
		tEmail.setText("");
		tNombreUsuario.setText("");
		errorNombre.setText("");
		errorApellidoPaterno.setText("");
		errorApellidoMaterno.setText("");
		errorEmail.setText("");
		errorNombreUsuario.setText("");
		errorPassword.setText("");
		errorConfirmarPassword.setText("");
		tPassword.setText("");
		tConfirmarPassword.setText("");
		rbAdministrador.setSelected(true);
	}
	public boolean checkTextFields(){
		boolean error=false;
		if(tNombre.getText().equalsIgnoreCase("")){
			errorNombre.setText("Campo necesario");
			error = true;
		}else
			errorNombre.setText("");
			
		if(tApellidoPaterno.getText().equals("")){
			errorApellidoPaterno.setText("Campo necesario");
			error = true;
		}else
			errorApellidoPaterno.setText("");
		
		if(tApellidoMaterno.getText().equals("")){
			errorApellidoMaterno.setText("Campo necesario");
			error = true;
		}else{
			errorApellidoMaterno.setText("");
		}
		if(tEmail.getText().equals("")){
			errorEmail.setText("Campo necesario");
			error = true;
		}else{
			errorEmail.setText("");
		}
		
		if(tNombreUsuario.getText().equals("")){
			errorNombreUsuario.setText("Campo necesario");
			error = true;
		}else{
			errorNombreUsuario.setText("");
		}
		
		if(String.copyValueOf(tPassword.getPassword()).equals("")){
			errorPassword.setText("Campo necesario");
			error = true;
		}else{
			errorPassword.setText("");
		}
		
		if(!String.copyValueOf(tConfirmarPassword.getPassword()).equals(String.copyValueOf(tPassword.getPassword()) )){
			errorConfirmarPassword.setText("Password no coincide");
			error = true;
		}else{
			errorConfirmarPassword.setText("");
		}
		
		return error;
	}
}
=======
package vistas;
import javax.swing.*;

import java.awt.*;

import logica.Usuario;

@SuppressWarnings("serial")
public class NuevoUsuario extends JPanel{
	private JLabel bienvenida,lNombre,lApellidoPaterno,lApellidoMaterno,lEmail,lPassword,lNombreUsuario;
	private JLabel lConfirmarPassword,lTipoDeUsuario;
	private JLabel errorNombre,errorApellidoPaterno,errorApellidoMaterno,errorEmail,errorNombreUsuario,errorPassword;
	private JLabel errorConfirmarPassword,lAgregarNuevoUsuario;
	
	private JRadioButton rbAdministrador,rbEmpleado;
	private JButton bAceptar,bCancelar;
	private JPasswordField tPassword,tConfirmarPassword;
	private JTextField tNombre,tApellidoPaterno,tApellidoMaterno,tEmail,tNombreUsuario;
	private Usuario u;
	public NuevoUsuario(Usuario u) {
		this.u=u;
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 115, 180, 167, 0, 50, 0};
		gridBagLayout.rowHeights = new int[]{15, 15, 25, 0, 0, 0, 0, 25, 0, 0, 0, 25, 0, 25, 0, 20};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		bienvenida = new JLabel("Bienvenido "+u.getNombre());
		GridBagConstraints gbc_bienvenida = new GridBagConstraints();
		gbc_bienvenida.gridwidth = 2;
		gbc_bienvenida.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenida.anchor = GridBagConstraints.NORTH;
		gbc_bienvenida.gridx = 1;
		gbc_bienvenida.gridy = 1;
		add(bienvenida, gbc_bienvenida);
		
		lAgregarNuevoUsuario = new JLabel("Agregar Nuevo Usuario");
		GridBagConstraints gbc_lblAgregarNuevoUsuario = new GridBagConstraints();
		gbc_lblAgregarNuevoUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAgregarNuevoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregarNuevoUsuario.gridx = 3;
		gbc_lblAgregarNuevoUsuario.gridy = 1;
		gbc_lblAgregarNuevoUsuario.gridwidth = 2;
		add(lAgregarNuevoUsuario, gbc_lblAgregarNuevoUsuario);
		
		errorNombre = new JLabel("");
		lNombre=new JLabel("Nombre:");
		tNombre = new JTextField();
		errorNombre.setForeground(Color.RED);
		GridBagConstraints gbc_errorNombre = new GridBagConstraints();
		gbc_errorNombre.anchor = GridBagConstraints.EAST;
		gbc_errorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_errorNombre.gridx = 1;
		gbc_errorNombre.gridy = 3;
		add(errorNombre, gbc_errorNombre);
		GridBagConstraints gbc_lNombre = new GridBagConstraints();
		gbc_lNombre.anchor = GridBagConstraints.EAST;
		gbc_lNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lNombre.gridx = 2;
		gbc_lNombre.gridy = 3;
		add(lNombre, gbc_lNombre);
		GridBagConstraints gbc_tNombre = new GridBagConstraints();
		gbc_tNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tNombre.gridx = 3;
		gbc_tNombre.gridy = 3;
		add(tNombre, gbc_tNombre);
		tNombre.setColumns(15);
		
		errorApellidoPaterno = new JLabel("");
		errorApellidoPaterno.setForeground(Color.RED);
		GridBagConstraints gbc_errorApellidoPaterno = new GridBagConstraints();
		gbc_errorApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_errorApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_errorApellidoPaterno.gridx = 1;
		gbc_errorApellidoPaterno.gridy = 4;
		add(errorApellidoPaterno, gbc_errorApellidoPaterno);
		
		lApellidoPaterno = new JLabel("Apellido Paterno:");
		GridBagConstraints gbc_lApellidoPaterno = new GridBagConstraints();
		gbc_lApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_lApellidoPaterno.gridx = 2;
		gbc_lApellidoPaterno.gridy = 4;
		add(lApellidoPaterno, gbc_lApellidoPaterno);
		
		tApellidoPaterno = new JTextField();
		GridBagConstraints gbc_tApellidoPaterno = new GridBagConstraints();
		gbc_tApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_tApellidoPaterno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tApellidoPaterno.gridx = 3;
		gbc_tApellidoPaterno.gridy = 4;
		add(tApellidoPaterno, gbc_tApellidoPaterno);
		
		errorApellidoMaterno = new JLabel("");
		errorApellidoMaterno.setHorizontalAlignment(SwingConstants.TRAILING);
		errorApellidoMaterno.setForeground(Color.RED);
		GridBagConstraints gbc_errorApellidoMaterno = new GridBagConstraints();
		gbc_errorApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_errorApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_errorApellidoMaterno.gridx = 1;
		gbc_errorApellidoMaterno.gridy = 5;
		add(errorApellidoMaterno, gbc_errorApellidoMaterno);
		
		lApellidoMaterno = new JLabel("Apellido Materno:");
		GridBagConstraints gbc_lApellidoMaterno = new GridBagConstraints();
		gbc_lApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_lApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lApellidoMaterno.gridx = 2;
		gbc_lApellidoMaterno.gridy = 5;
		add(lApellidoMaterno, gbc_lApellidoMaterno);
		
		tApellidoMaterno = new JTextField();
		GridBagConstraints gbc_tApellidoMaterno = new GridBagConstraints();
		gbc_tApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_tApellidoMaterno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tApellidoMaterno.gridx = 3;
		gbc_tApellidoMaterno.gridy = 5;
		add(tApellidoMaterno, gbc_tApellidoMaterno);
		tApellidoMaterno.setColumns(10);
		
		errorEmail = new JLabel("");
		errorEmail.setForeground(Color.RED);
		GridBagConstraints gbc_errorEmail = new GridBagConstraints();
		gbc_errorEmail.anchor = GridBagConstraints.EAST;
		gbc_errorEmail.insets = new Insets(0, 0, 5, 5);
		gbc_errorEmail.gridx = 1;
		gbc_errorEmail.gridy = 6;
		add(errorEmail, gbc_errorEmail);
		
		lEmail = new JLabel("e-mail:");
		GridBagConstraints gbc_lEmail = new GridBagConstraints();
		gbc_lEmail.anchor = GridBagConstraints.EAST;
		gbc_lEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lEmail.gridx = 2;
		gbc_lEmail.gridy = 6;
		add(lEmail, gbc_lEmail);
		
		tEmail = new JTextField();
		GridBagConstraints gbc_tEmail = new GridBagConstraints();
		gbc_tEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tEmail.gridx = 3;
		gbc_tEmail.gridy = 6;
		add(tEmail, gbc_tEmail);
		
		errorNombreUsuario = new JLabel("");
		errorNombreUsuario.setForeground(Color.RED);
		GridBagConstraints gbc_errorNombreUsuario = new GridBagConstraints();
		gbc_errorNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_errorNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_errorNombreUsuario.gridx = 1;
		gbc_errorNombreUsuario.gridy = 8;
		add(errorNombreUsuario, gbc_errorNombreUsuario);
		
		lNombreUsuario = new JLabel("Nombre de Usuario:");
		GridBagConstraints gbc_lNombreUsuario = new GridBagConstraints();
		gbc_lNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_lNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lNombreUsuario.gridx = 2;
		gbc_lNombreUsuario.gridy = 8;
		add(lNombreUsuario, gbc_lNombreUsuario);
		
		tNombreUsuario = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 8;
		add(tNombreUsuario, gbc_textField_2);
		
		errorPassword = new JLabel("");
		errorPassword.setForeground(Color.RED);
		GridBagConstraints gbc_errorPassword = new GridBagConstraints();
		gbc_errorPassword.anchor = GridBagConstraints.EAST;
		gbc_errorPassword.insets = new Insets(0, 0, 5, 5);
		gbc_errorPassword.gridx = 1;
		gbc_errorPassword.gridy = 9;
		add(errorPassword, gbc_errorPassword);
		
		lPassword = new JLabel("Password:");
		lPassword.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lPassword = new GridBagConstraints();
		gbc_lPassword.anchor = GridBagConstraints.EAST;
		gbc_lPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lPassword.gridx = 2;
		gbc_lPassword.gridy = 9;
		add(lPassword, gbc_lPassword);
		
		tPassword = new JPasswordField();
		tPassword.setHorizontalAlignment(SwingConstants.LEFT);
		tPassword.setBackground(Color.WHITE);
		GridBagConstraints gbc_tPassword = new GridBagConstraints();
		gbc_tPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPassword.insets = new Insets(0, 0, 5, 5);
		gbc_tPassword.gridx = 3;
		gbc_tPassword.gridy = 9;
		add(tPassword, gbc_tPassword);
		
		errorConfirmarPassword = new JLabel("");
		errorConfirmarPassword.setForeground(Color.RED);
		GridBagConstraints gbc_errorConfirmarPassword = new GridBagConstraints();
		gbc_errorConfirmarPassword.anchor = GridBagConstraints.EAST;
		gbc_errorConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_errorConfirmarPassword.gridx = 1;
		gbc_errorConfirmarPassword.gridy = 10;
		add(errorConfirmarPassword, gbc_errorConfirmarPassword);
		
		lConfirmarPassword = new JLabel("Confirmar Password:");
		GridBagConstraints gbc_lConfirmarPassword = new GridBagConstraints();
		gbc_lConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lConfirmarPassword.anchor = GridBagConstraints.EAST;
		gbc_lConfirmarPassword.gridx = 2;
		gbc_lConfirmarPassword.gridy = 10;
		add(lConfirmarPassword, gbc_lConfirmarPassword);
		
		tConfirmarPassword = new JPasswordField();
		GridBagConstraints gbc_tConfirmarPassword = new GridBagConstraints();
		gbc_tConfirmarPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_tConfirmarPassword.gridx = 3;
		gbc_tConfirmarPassword.gridy = 10;
		add(tConfirmarPassword, gbc_tConfirmarPassword);
		
		lTipoDeUsuario = new JLabel("Tipo de Usuario:");
		GridBagConstraints gbc_lTipoDeUsuario = new GridBagConstraints();
		gbc_lTipoDeUsuario.anchor = GridBagConstraints.EAST;
		gbc_lTipoDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lTipoDeUsuario.gridx = 2;
		gbc_lTipoDeUsuario.gridy = 12;
		add(lTipoDeUsuario, gbc_lTipoDeUsuario);
		
		rbAdministrador = new JRadioButton("Administrador");
		GridBagConstraints gbc_rbAdministrador = new GridBagConstraints();
		gbc_rbAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_rbAdministrador.gridx = 3;
		gbc_rbAdministrador.gridy = 12;
		add(rbAdministrador, gbc_rbAdministrador);
		
		rbEmpleado = new JRadioButton("Empleado");
		GridBagConstraints gbc_rbEmpleado = new GridBagConstraints();
		gbc_rbEmpleado.anchor = GridBagConstraints.WEST;
		gbc_rbEmpleado.insets = new Insets(0, 0, 5, 5);
		gbc_rbEmpleado.gridx = 4;
		gbc_rbEmpleado.gridy = 12;
		add(rbEmpleado, gbc_rbEmpleado);
		
		bAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_bAceptar = new GridBagConstraints();
		gbc_bAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_bAceptar.gridx = 3;
		gbc_bAceptar.gridy = 14;
		add(bAceptar, gbc_bAceptar);
		
		bCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_bCancelar = new GridBagConstraints();
		gbc_bCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_bCancelar.gridx = 4;
		gbc_bCancelar.gridy = 14;
		add(bCancelar, gbc_bCancelar);
		
		rbAdministrador.setSelected(true);
		ButtonGroup grupo = new ButtonGroup();
      grupo.add(rbAdministrador);
      grupo.add(rbEmpleado);
		
	}

	public JButton getCancelar(){return bCancelar;}
}
>>>>>>> d3a68f16813f3bf694b6098aec801624a14e81b0:src/vistas/NuevoUsuario.java
