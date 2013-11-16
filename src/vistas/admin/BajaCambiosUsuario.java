package vistas.admin;
import javax.swing.*;

import java.awt.*;
import logica.*;

@SuppressWarnings("serial")
public class BajaCambiosUsuario extends JPanel{
	private JLabel bienvenido,lNombre,lApellidoPaterno,lApellidoMaterno,lEmail,lNombreUsuario;
	private JLabel lTipoDeUsuario;
	private JLabel errorNombre,errorApellidoPaterno,errorApellidoMaterno,errorEmail,errorNombreUsuario;
	private JLabel lMensaje;
	
	private JRadioButton rbAdministrador,rbEmpleado;
	private JButton bAceptar,bCancelar,bEliminar;
	private JTextField tNombre,tApellidoPaterno,tApellidoMaterno,tEmail,tNombreUsuario;
	private Usuario u;
	public BajaCambiosUsuario(){
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{28, 115, 150, 120, 0, 50, 0};
		gridBagLayout.rowHeights = new int[]{0, 15, 25, 28, 28, 25, 0, 0, 0, 25, 0, 25, 0, 20};
		gridBagLayout.columnWeights = new double[]{0, 0,0, 0, 0, 0, 0};
		gridBagLayout.rowWeights = new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		setLayout(gridBagLayout);

		bienvenido = new JLabel("Bienvenido ");
		GridBagConstraints gbc_bienvenido = new GridBagConstraints();
		gbc_bienvenido.gridwidth = 2;
		gbc_bienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenido.anchor = GridBagConstraints.NORTH;
		gbc_bienvenido.gridx = 1;
		gbc_bienvenido.gridy = 1;
		add(bienvenido, gbc_bienvenido);
		
		lMensaje = new JLabel("Bajas Usuario");
		GridBagConstraints gbc_lMensaje = new GridBagConstraints();
		gbc_lMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_lMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lMensaje.gridx = 3;
		gbc_lMensaje.gridy = 1;
		gbc_lMensaje.gridwidth = 2;
		add(lMensaje, gbc_lMensaje);
		
		errorNombreUsuario = new JLabel("");
		errorNombreUsuario.setForeground(Color.RED);
		GridBagConstraints gbc_errorNombreUsuario = new GridBagConstraints();
		gbc_errorNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_errorNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_errorNombreUsuario.gridx = 1;
		gbc_errorNombreUsuario.gridy = 3;
		add(errorNombreUsuario, gbc_errorNombreUsuario);
		
		lNombreUsuario = new JLabel("Nombre de Usuario:");
		GridBagConstraints gbc_lNombreUsuario = new GridBagConstraints();
		gbc_lNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_lNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lNombreUsuario.gridx = 2;
		gbc_lNombreUsuario.gridy = 3;
		add(lNombreUsuario, gbc_lNombreUsuario);
		
		tNombreUsuario = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		add(tNombreUsuario, gbc_textField_2);
		
		bAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_bAceptar = new GridBagConstraints();
		gbc_bAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_bAceptar.gridx = 4;
		gbc_bAceptar.gridy = 3;
		add(bAceptar, gbc_bAceptar);
		
		errorNombre = new JLabel("");
		errorNombre.setForeground(Color.RED);
		GridBagConstraints gbc_errorNombre = new GridBagConstraints();
		gbc_errorNombre.anchor = GridBagConstraints.EAST;
		gbc_errorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_errorNombre.gridx = 1;
		gbc_errorNombre.gridy = 5;
		add(errorNombre, gbc_errorNombre);
		lNombre=new JLabel("Nombre:");
		GridBagConstraints gbc_lNombre = new GridBagConstraints();
		gbc_lNombre.anchor = GridBagConstraints.EAST;
		gbc_lNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lNombre.gridx = 2;
		gbc_lNombre.gridy = 5;
		add(lNombre, gbc_lNombre);
		tNombre = new JTextField();
		GridBagConstraints gbc_tNombre = new GridBagConstraints();
		gbc_tNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tNombre.gridx = 3;
		gbc_tNombre.gridy = 5;
		add(tNombre, gbc_tNombre);
		tNombre.setColumns(15);
		
		errorApellidoPaterno = new JLabel("");
		errorApellidoPaterno.setForeground(Color.RED);
		GridBagConstraints gbc_errorApellidoPaterno = new GridBagConstraints();
		gbc_errorApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_errorApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_errorApellidoPaterno.gridx = 1;
		gbc_errorApellidoPaterno.gridy = 6;
		add(errorApellidoPaterno, gbc_errorApellidoPaterno);
		
		lApellidoPaterno = new JLabel("Apellido Paterno:");
		GridBagConstraints gbc_lApellidoPaterno = new GridBagConstraints();
		gbc_lApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_lApellidoPaterno.gridx = 2;
		gbc_lApellidoPaterno.gridy = 6;
		add(lApellidoPaterno, gbc_lApellidoPaterno);
		
		tApellidoPaterno = new JTextField();
		GridBagConstraints gbc_tApellidoPaterno = new GridBagConstraints();
		gbc_tApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_tApellidoPaterno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tApellidoPaterno.gridx = 3;
		gbc_tApellidoPaterno.gridy = 6;
		add(tApellidoPaterno, gbc_tApellidoPaterno);
		
		errorApellidoMaterno = new JLabel("");
		errorApellidoMaterno.setHorizontalAlignment(SwingConstants.TRAILING);
		errorApellidoMaterno.setForeground(Color.RED);
		GridBagConstraints gbc_errorApellidoMaterno = new GridBagConstraints();
		gbc_errorApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_errorApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_errorApellidoMaterno.gridx = 1;
		gbc_errorApellidoMaterno.gridy = 7;
		add(errorApellidoMaterno, gbc_errorApellidoMaterno);
		
		lApellidoMaterno = new JLabel("Apellido Materno:");
		GridBagConstraints gbc_lApellidoMaterno = new GridBagConstraints();
		gbc_lApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_lApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lApellidoMaterno.gridx = 2;
		gbc_lApellidoMaterno.gridy = 7;
		add(lApellidoMaterno, gbc_lApellidoMaterno);
		
		tApellidoMaterno = new JTextField();
		GridBagConstraints gbc_tApellidoMaterno = new GridBagConstraints();
		gbc_tApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_tApellidoMaterno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tApellidoMaterno.gridx = 3;
		gbc_tApellidoMaterno.gridy = 7;
		add(tApellidoMaterno, gbc_tApellidoMaterno);
		tApellidoMaterno.setColumns(10);
		
		errorEmail = new JLabel("");
		errorEmail.setForeground(Color.RED);
		GridBagConstraints gbc_errorEmail = new GridBagConstraints();
		gbc_errorEmail.anchor = GridBagConstraints.EAST;
		gbc_errorEmail.insets = new Insets(0, 0, 5, 5);
		gbc_errorEmail.gridx = 1;
		gbc_errorEmail.gridy = 8;
		add(errorEmail, gbc_errorEmail);
		
		lEmail = new JLabel("e-mail:");
		GridBagConstraints gbc_lEmail = new GridBagConstraints();
		gbc_lEmail.anchor = GridBagConstraints.EAST;
		gbc_lEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lEmail.gridx = 2;
		gbc_lEmail.gridy = 8;
		add(lEmail, gbc_lEmail);
		
		tEmail = new JTextField();
		GridBagConstraints gbc_tEmail = new GridBagConstraints();
		gbc_tEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tEmail.gridx = 3;
		gbc_tEmail.gridy = 8;
		add(tEmail, gbc_tEmail);
		
		lTipoDeUsuario = new JLabel("Tipo de Usuario:");
		GridBagConstraints gbc_lTipoDeUsuario = new GridBagConstraints();
		gbc_lTipoDeUsuario.anchor = GridBagConstraints.EAST;
		gbc_lTipoDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lTipoDeUsuario.gridx = 2;
		gbc_lTipoDeUsuario.gridy = 10;
		add(lTipoDeUsuario, gbc_lTipoDeUsuario);
		
		rbAdministrador = new JRadioButton("Administrador");
		rbAdministrador.setBackground(null);
		GridBagConstraints gbc_rbAdministrador = new GridBagConstraints();
		gbc_rbAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_rbAdministrador.gridx = 3;
		gbc_rbAdministrador.gridy = 10;
		add(rbAdministrador, gbc_rbAdministrador);
		
		rbEmpleado = new JRadioButton("Empleado");
		rbEmpleado.setBackground(null);
		GridBagConstraints gbc_rbEmpleado = new GridBagConstraints();
		gbc_rbEmpleado.anchor = GridBagConstraints.WEST;
		gbc_rbEmpleado.insets = new Insets(0, 0, 5, 5);
		gbc_rbEmpleado.gridx = 4;
		gbc_rbEmpleado.gridy = 10;
		add(rbEmpleado, gbc_rbEmpleado);
		
		bEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_bEliminar = new GridBagConstraints();
		gbc_bEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_bEliminar.gridx = 3;
		gbc_bEliminar.gridy = 12;
		add(bEliminar, gbc_bEliminar);
		
		bCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_bCancelar = new GridBagConstraints();
		gbc_bCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_bCancelar.gridx = 4;
		gbc_bCancelar.gridy = 12;
		add(bCancelar, gbc_bCancelar);
		
		rbAdministrador.setSelected(true);
		ButtonGroup grupo = new ButtonGroup();
      grupo.add(rbAdministrador);
      grupo.add(rbEmpleado);
	}
	public void setUser(Usuario u){
		this.u=u;
		bienvenido.setText("Bienvenido "+u.getNombreUsuario());
	}
	public void setCambios(){
		lMensaje.setText("Cambios Usuario");
		bEliminar.setText("Cambiar");
	}
	public void setBajas(){
		lMensaje.setText("Bajas Usuario");
		bEliminar.setText("Eliminar");
	}
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
		rbAdministrador.setSelected(true);
	}
	
}
