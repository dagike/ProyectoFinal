package vistas.admin;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class JugueteBaja extends JPanel {
	private JLabel bienvenido, lMensaje;
	private JLabel lblNombre, lblErrorNombre;
	private JTextField tFNombre;
	private JLabel lblFabricante, lblErrorFabricante;
	private JTextField tFFabricante;
	private JLabel lblEdadApropiada, lblErrorEdadApropiada;
	private JTextField tFEdadApropiada;
	private JLabel lblPrecio, lblErrorPrecio;
	private JTextField tFPrecio;
	private JLabel lblExistencias, lblErrorExistencias;
	private JTextField tFExistencias;
	private JButton btnEliminar, btnCancelar;
	private JButton btnAceptar;
	
	public JButton getEliminar(){return btnEliminar;}
	public JButton getCancelar(){return btnCancelar;}
	public JButton getAceptar(){return btnAceptar;}

	public JugueteBaja() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{115, 90, 100, 100, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 40, 0, 30, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		bienvenido = new JLabel("Bienvenido ");
		GridBagConstraints gbc_bienvenido = new GridBagConstraints();
		gbc_bienvenido.gridwidth = 2;
		gbc_bienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenido.anchor = GridBagConstraints.NORTH;
		gbc_bienvenido.gridx = 1;
		gbc_bienvenido.gridy = 1;
		add(bienvenido, gbc_bienvenido);
		
		lMensaje = new JLabel("Bajas Juguetes");
		GridBagConstraints gbc_lMensaje = new GridBagConstraints();
		gbc_lMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_lMensaje.insets = new Insets(0, 0, 5, 0);
		gbc_lMensaje.gridx = 3;
		gbc_lMensaje.gridy = 1;
		gbc_lMensaje.gridwidth = 2;
		add(lMensaje, gbc_lMensaje);
		
		lblErrorNombre = new JLabel("");
		GridBagConstraints gbc_lblErrorNombre = new GridBagConstraints();
		gbc_lblErrorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorNombre.gridx = 1;
		gbc_lblErrorNombre.gridy = 3;
		add(lblErrorNombre, gbc_lblErrorNombre);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		tFNombre = new JTextField();
		GridBagConstraints gbc_tFNombre = new GridBagConstraints();
		gbc_tFNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tFNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNombre.gridx = 3;
		gbc_tFNombre.gridy = 3;
		add(tFNombre, gbc_tFNombre);
		tFNombre.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 3;
		add(btnAceptar, gbc_btnAceptar);
		
		lblErrorFabricante = new JLabel("");
		GridBagConstraints gbc_lblErrorFabricante = new GridBagConstraints();
		gbc_lblErrorFabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFabricante.gridx = 1;
		gbc_lblErrorFabricante.gridy = 5;
		add(lblErrorFabricante, gbc_lblErrorFabricante);
		
		lblFabricante = new JLabel("Fabricante");
		GridBagConstraints gbc_lblFabricante = new GridBagConstraints();
		gbc_lblFabricante.anchor = GridBagConstraints.EAST;
		gbc_lblFabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFabricante.gridx = 2;
		gbc_lblFabricante.gridy = 5;
		add(lblFabricante, gbc_lblFabricante);
		
		tFFabricante = new JTextField();
		GridBagConstraints gbc_tFFabricante = new GridBagConstraints();
		gbc_tFFabricante.insets = new Insets(0, 0, 5, 5);
		gbc_tFFabricante.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFabricante.gridx = 3;
		gbc_tFFabricante.gridy = 5;
		add(tFFabricante, gbc_tFFabricante);
		tFFabricante.setColumns(10);
		
		lblErrorEdadApropiada = new JLabel("");
		GridBagConstraints gbc_lblErrorEdadApropiada = new GridBagConstraints();
		gbc_lblErrorEdadApropiada.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorEdadApropiada.gridx = 1;
		gbc_lblErrorEdadApropiada.gridy = 6;
		add(lblErrorEdadApropiada, gbc_lblErrorEdadApropiada);
		
		lblEdadApropiada = new JLabel("Edad Aprodiada");
		GridBagConstraints gbc_lblEdadAprodiada = new GridBagConstraints();
		gbc_lblEdadAprodiada.anchor = GridBagConstraints.EAST;
		gbc_lblEdadAprodiada.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdadAprodiada.gridx = 2;
		gbc_lblEdadAprodiada.gridy = 6;
		add(lblEdadApropiada, gbc_lblEdadAprodiada);
		
		tFEdadApropiada = new JTextField();
		GridBagConstraints gbc_tFEdadApropiada = new GridBagConstraints();
		gbc_tFEdadApropiada.insets = new Insets(0, 0, 5, 5);
		gbc_tFEdadApropiada.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEdadApropiada.gridx = 3;
		gbc_tFEdadApropiada.gridy = 6;
		add(tFEdadApropiada, gbc_tFEdadApropiada);
		tFEdadApropiada.setColumns(10);
		
		lblErrorPrecio = new JLabel("");
		GridBagConstraints gbc_lblErrorPrecio = new GridBagConstraints();
		gbc_lblErrorPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorPrecio.gridx = 1;
		gbc_lblErrorPrecio.gridy = 7;
		add(lblErrorPrecio, gbc_lblErrorPrecio);
		
		lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 7;
		add(lblPrecio, gbc_lblPrecio);
		
		tFPrecio = new JTextField();
		GridBagConstraints gbc_tFPrecio = new GridBagConstraints();
		gbc_tFPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_tFPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFPrecio.gridx = 3;
		gbc_tFPrecio.gridy = 7;
		add(tFPrecio, gbc_tFPrecio);
		tFPrecio.setColumns(10);
		
		lblErrorExistencias = new JLabel("");
		GridBagConstraints gbc_lblErrorExistencias = new GridBagConstraints();
		gbc_lblErrorExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorExistencias.gridx = 1;
		gbc_lblErrorExistencias.gridy = 8;
		add(lblErrorExistencias, gbc_lblErrorExistencias);
		
		lblExistencias = new JLabel("Existencias");
		GridBagConstraints gbc_lblExistencias = new GridBagConstraints();
		gbc_lblExistencias.anchor = GridBagConstraints.EAST;
		gbc_lblExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblExistencias.gridx = 2;
		gbc_lblExistencias.gridy = 8;
		add(lblExistencias, gbc_lblExistencias);
		
		tFExistencias = new JTextField();
		GridBagConstraints gbc_tFExistencias = new GridBagConstraints();
		gbc_tFExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_tFExistencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFExistencias.gridx = 3;
		gbc_tFExistencias.gridy = 8;
		add(tFExistencias, gbc_tFExistencias);
		tFExistencias.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 10;
		add(btnEliminar, gbc_btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 10;
		add(btnCancelar, gbc_btnCancelar);

	}
	public void setCambios(){
		lMensaje.setText("Cambios Juguetes");
		btnEliminar.setText("Cambiar");
	}
	public void setBajas(){
		lMensaje.setText("Bajas Juguetes");
		btnEliminar.setText("Eliminar");
	}
	public void cancelar(){
		tFNombre.setText("");
		tFFabricante.setText("");
		tFEdadApropiada.setText("");
		tFPrecio.setText("");
		tFExistencias.setText("");
	}
}
