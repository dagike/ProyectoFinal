package admin;

import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class Dinamico extends JPanel {
	private JMenuBar adminMenu;
	private JMenu empleado;
	private JMenu producto;
	private JLabel lblErrorNombre, lblErrorApellidoPaterno,
			lblErrorApellidoMaterno;
	private JLabel lblNombre, lblApellidoPaterno, lblApellidoMaterno;
	private JTextField textFieldNombre, textFieldApellidoPaterno,
			textFieldApellidoMaterno;
	private JLabel lblErrorUsuario, lblErrorPassword;
	private JLabel lblUsuario, lblPassword, lblConfirmarPassword;
	private JTextField textFieldUsuario, textFieldPassword,
			textFieldConfirmarPassword;
	private JLabel lblTipoDeUsuario;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton radioButtonAdministrador, radioButtonEmpleado;
	private JButton buttonAceptar, buttonCancelar;
	private int estado=0;
	
	public JMenuBar getAdminMenu(){return adminMenu;}

	public Dinamico() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 30, 133, 107, 139, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 21, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 83, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		adminMenu = new JMenuBar();

		empleado = new JMenu("Empleado");
		empleado.add(empleadoAltas);
		empleado.add(empleadoBajas);
		empleado.add(empleadoCambios);
		adminMenu.add(empleado);

		producto = new JMenu("Producto");
		producto.add(productoAltas);
		producto.add(productoBajas);
		producto.add(productoCambios);
		adminMenu.add(producto);

		/*GridBagConstraints gbc_adminMenu = new GridBagConstraints();
		gbc_adminMenu.fill = GridBagConstraints.BOTH;
		gbc_adminMenu.insets = new Insets(0, 0, 5, 5);
		gbc_adminMenu.gridx = 1;
		gbc_adminMenu.gridy = 0;
		add(adminMenu, gbc_adminMenu);*/

		lblErrorNombre = new JLabel();
		lblErrorNombre.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorNombre = new GridBagConstraints();
		gbc_lblErrorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorNombre.gridx = 1;
		gbc_lblErrorNombre.gridy = 2;
		add(lblErrorNombre, gbc_lblErrorNombre);

		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);

		textFieldNombre = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		add(textFieldNombre, gbc_textField);
		textFieldNombre.setColumns(10);

		lblErrorApellidoPaterno = new JLabel();
		lblErrorApellidoPaterno.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorApellidoPaterno = new GridBagConstraints();
		gbc_lblErrorApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorApellidoPaterno.gridx = 1;
		gbc_lblErrorApellidoPaterno.gridy = 3;
		add(lblErrorApellidoPaterno, gbc_lblErrorApellidoPaterno);

		lblApellidoPaterno = new JLabel("Apellido Paterno");
		GridBagConstraints gbc_lblApellidoPaterno = new GridBagConstraints();
		gbc_lblApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_lblApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidoPaterno.gridx = 2;
		gbc_lblApellidoPaterno.gridy = 3;
		add(lblApellidoPaterno, gbc_lblApellidoPaterno);

		textFieldApellidoPaterno = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 3;
		add(textFieldApellidoPaterno, gbc_textField_1);
		textFieldApellidoPaterno.setColumns(10);

		lblErrorApellidoMaterno = new JLabel();
		lblErrorApellidoMaterno.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorApellidoMaterno = new GridBagConstraints();
		gbc_lblErrorApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorApellidoMaterno.gridx = 1;
		gbc_lblErrorApellidoMaterno.gridy = 4;
		add(lblErrorApellidoMaterno, gbc_lblErrorApellidoMaterno);

		lblApellidoMaterno = new JLabel("Apellido Materno");
		GridBagConstraints gbc_lblApellidoMaterno = new GridBagConstraints();
		gbc_lblApellidoMaterno.anchor = GridBagConstraints.EAST;
		gbc_lblApellidoMaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidoMaterno.gridx = 2;
		gbc_lblApellidoMaterno.gridy = 4;
		add(lblApellidoMaterno, gbc_lblApellidoMaterno);

		textFieldApellidoMaterno = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 4;
		add(textFieldApellidoMaterno, gbc_textField_2);
		textFieldApellidoMaterno.setColumns(10);

		lblErrorUsuario = new JLabel();
		lblErrorUsuario.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorUsuario = new GridBagConstraints();
		gbc_lblErrorUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorUsuario.gridx = 1;
		gbc_lblErrorUsuario.gridy = 6;
		add(lblErrorUsuario, gbc_lblErrorUsuario);

		lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 6;
		add(lblUsuario, gbc_lblUsuario);

		textFieldUsuario = new JTextField();
		GridBagConstraints gbc_textFieldUsuario = new GridBagConstraints();
		gbc_textFieldUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUsuario.gridx = 3;
		gbc_textFieldUsuario.gridy = 6;
		add(textFieldUsuario, gbc_textFieldUsuario);
		textFieldUsuario.setColumns(10);

		lblErrorPassword = new JLabel("");
		lblErrorPassword.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorPassword = new GridBagConstraints();
		gbc_lblErrorPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorPassword.gridx = 1;
		gbc_lblErrorPassword.gridy = 7;
		add(lblErrorPassword, gbc_lblErrorPassword);

		lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 2;
		gbc_lblPassword.gridy = 7;
		add(lblPassword, gbc_lblPassword);

		textFieldPassword = new JTextField();
		GridBagConstraints gbc_textFieldPassword = new GridBagConstraints();
		gbc_textFieldPassword.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPassword.gridx = 3;
		gbc_textFieldPassword.gridy = 7;
		add(textFieldPassword, gbc_textFieldPassword);
		textFieldPassword.setColumns(10);

		lblConfirmarPassword = new JLabel("Confirmar Password");
		GridBagConstraints gbc_lblConfirmarPassword = new GridBagConstraints();
		gbc_lblConfirmarPassword.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarPassword.gridx = 2;
		gbc_lblConfirmarPassword.gridy = 8;
		add(lblConfirmarPassword, gbc_lblConfirmarPassword);

		textFieldConfirmarPassword = new JTextField();
		GridBagConstraints gbc_textFieldConfirmarPassword = new GridBagConstraints();
		gbc_textFieldConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldConfirmarPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldConfirmarPassword.gridx = 3;
		gbc_textFieldConfirmarPassword.gridy = 8;
		add(textFieldConfirmarPassword, gbc_textFieldConfirmarPassword);
		textFieldConfirmarPassword.setColumns(10);

		lblTipoDeUsuario = new JLabel("Tipo de Usuario");
		GridBagConstraints gbc_lblTipoDeUsuario = new GridBagConstraints();
		gbc_lblTipoDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeUsuario.gridx = 2;
		gbc_lblTipoDeUsuario.gridy = 10;
		add(lblTipoDeUsuario, gbc_lblTipoDeUsuario);

		radioButtonAdministrador = new JRadioButton("Administrador");
		buttonGroup.add(radioButtonAdministrador);
		GridBagConstraints gbc_radioButtonAdministrador = new GridBagConstraints();
		gbc_radioButtonAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_radioButtonAdministrador.gridx = 3;
		gbc_radioButtonAdministrador.gridy = 10;
		add(radioButtonAdministrador, gbc_radioButtonAdministrador);

		radioButtonEmpleado = new JRadioButton("Empleado");
		radioButtonEmpleado.setSelected(true);
		buttonGroup.add(radioButtonEmpleado);
		GridBagConstraints gbc_radioButtonEmpleado = new GridBagConstraints();
		gbc_radioButtonEmpleado.insets = new Insets(0, 0, 5, 5);
		gbc_radioButtonEmpleado.gridx = 4;
		gbc_radioButtonEmpleado.gridy = 10;
		add(radioButtonEmpleado, gbc_radioButtonEmpleado);

		buttonAceptar = new JButton("Aceptar");
		buttonAceptar.addActionListener(new Acciones());
		GridBagConstraints gbc_buttonAceptar = new GridBagConstraints();
		gbc_buttonAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_buttonAceptar.gridx = 2;
		gbc_buttonAceptar.gridy = 12;
		add(buttonAceptar, gbc_buttonAceptar);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(new Acciones());
		GridBagConstraints gbc_buttonCancelar = new GridBagConstraints();
		gbc_buttonCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_buttonCancelar.gridx = 3;
		gbc_buttonCancelar.gridy = 12;
		add(buttonCancelar, gbc_buttonCancelar);
		setVisible(false);
		
		
	}
	
	public class Acciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonAceptar) {
				if(checkTextFieldsEmpleado()){//TODO Guardar Campos
					
				}
			}else if (e.getSource() == buttonCancelar) {
				estado = 0;
				estados();
			}
		}
	}
	
	public void estados(){
		if(estado == 0){
			setVisible(false);
		}else if(estado == 1){
			setVisible(true);
			textFieldNombre.setVisible(true);
			textFieldApellidoPaterno.setVisible(true);
			textFieldApellidoMaterno.setVisible(true);
			textFieldConfirmarPassword.setVisible(true);
			radioButtonAdministrador.setVisible(true);
			radioButtonEmpleado.setVisible(true);
			lblNombre.setVisible(true);
			lblApellidoPaterno.setVisible(true);
			lblApellidoMaterno.setVisible(true);
			lblConfirmarPassword.setVisible(true);
			lblTipoDeUsuario.setVisible(true);
		}else if(estado == 2){
			setVisible(true);
			textFieldNombre.setVisible(false);
			textFieldApellidoPaterno.setVisible(false);
			textFieldApellidoMaterno.setVisible(false);
			textFieldConfirmarPassword.setVisible(false);
			radioButtonAdministrador.setVisible(false);
			radioButtonEmpleado.setVisible(false);
			lblNombre.setVisible(false);
			lblApellidoPaterno.setVisible(false);
			lblApellidoMaterno.setVisible(false);
			lblConfirmarPassword.setVisible(false);
			lblTipoDeUsuario.setVisible(false);
		}else if(estado == 3){
			setVisible(true);
			textFieldNombre.setVisible(false);
			textFieldApellidoPaterno.setVisible(false);
			textFieldApellidoMaterno.setVisible(false);
			textFieldConfirmarPassword.setVisible(false);
			radioButtonAdministrador.setVisible(false);
			radioButtonEmpleado.setVisible(false);
			lblNombre.setVisible(false);
			lblApellidoPaterno.setVisible(false);
			lblApellidoMaterno.setVisible(false);
			lblConfirmarPassword.setVisible(false);
			lblTipoDeUsuario.setVisible(false);
		}else if(estado == 4){
			
		}else if(estado == 5){
			
		}else if(estado == 6){
			
		}
	}
	
	public boolean checkTextFieldsEmpleado(){
		boolean error = false;
		if(textFieldNombre.getText().equalsIgnoreCase("")){
			lblErrorNombre.setText("Campo necesario");
			error = true;
		}else{
			lblErrorNombre.setText("");
		}
		
		if(textFieldApellidoPaterno.getText().equals("")){
			lblErrorApellidoPaterno.setText("Campo necesario");
			error = true;
		}else{
			lblErrorApellidoPaterno.setText("");
		}
		
		if(textFieldApellidoMaterno.getText().equals("")){
			lblErrorApellidoMaterno.setText("Campo necesario");
			error = true;
		}else{
			lblErrorApellidoMaterno.setText("");
		}
		
		if(textFieldUsuario.getText().equals("")){
			lblErrorUsuario.setText("Campo necesario");
			error = true;
		}else{
			lblErrorUsuario.setText("");
		}
		
		if(textFieldPassword.getText().equals("")){
			lblErrorPassword.setText("Campo necesario");
			error = true;
		}else if(!textFieldPassword.getText().equals(textFieldConfirmarPassword.getText())){
			lblErrorPassword.setText("Contraseña no coincide");
			error = true;
		}else{
			lblErrorPassword.setText("");
		}
		
		return error;
	}
	
	Action empleadoAltas = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = 1;
			estados();
		}
	};
	
	Action empleadoBajas = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = 2;
			estados();
		}
	};
	
	Action empleadoCambios = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = 3;
			estados();
		}
	};
	
	Action productoAltas = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = 4;
			estados();
		}
	};
	
	Action productoBajas = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = 5;
			estados();
		}
	};
	
	Action productoCambios = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = 6;
			estados();
		}
	};
}
