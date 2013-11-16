package vistas.admin;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class LibroBaja extends JPanel {
	private JLabel bienvenido, lMensaje;
	private JLabel lblNombre, lblErrorNombre;
	private JTextField tFNombre;
	private JLabel lblFechaImpresion, lblErrorFechaImpresion;
	private JTextField tFFechaImpresion;
	private JLabel lblEdicion, lblErrorEdicion;
	private JTextField tFEdicion;
	private JLabel lblFechaEdicion, lblErrorFechaEdicion;
	private JTextField tFFechaEdicion;
	private JLabel lblGenero, lblErrorGenero;
	private JTextField tFGenero;
	private JLabel lblIdioma, lblErrorIdioma;
	private JTextField tFIdioma;
	private JLabel lblPrecio, lblErrorPrecio;
	private JTextField tFPrecio;
	private JLabel lblExistencias, lblErrorExistencias;
	private JTextField tFExistencias;
	private JButton btnEliminar, btnCancelar;
	private JButton btnAceptar;
	
	public JButton getEliminar(){return btnEliminar;}
	public JButton getCancelar(){return btnCancelar;}
	public JButton getAceptar(){return btnAceptar;}

	public LibroBaja() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{115, 90, 100, 100, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 40, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		bienvenido = new JLabel("Bienvenido ");
		GridBagConstraints gbc_bienvenido = new GridBagConstraints();
		gbc_bienvenido.gridwidth = 2;
		gbc_bienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenido.anchor = GridBagConstraints.NORTH;
		gbc_bienvenido.gridx = 1;
		gbc_bienvenido.gridy = 1;
		add(bienvenido, gbc_bienvenido);
		
		lMensaje = new JLabel("Bajas Libros");
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
		
		lblErrorFechaImpresion = new JLabel("");
		GridBagConstraints gbc_lblErrorFechaImpresion = new GridBagConstraints();
		gbc_lblErrorFechaImpresion.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFechaImpresion.gridx = 1;
		gbc_lblErrorFechaImpresion.gridy = 5;
		add(lblErrorFechaImpresion, gbc_lblErrorFechaImpresion);
		
		lblFechaImpresion = new JLabel("Fecha de Impresion");
		GridBagConstraints gbc_lblFechaImpresion = new GridBagConstraints();
		gbc_lblFechaImpresion.anchor = GridBagConstraints.EAST;
		gbc_lblFechaImpresion.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaImpresion.gridx = 2;
		gbc_lblFechaImpresion.gridy = 5;
		add(lblFechaImpresion, gbc_lblFechaImpresion);
		
		tFFechaImpresion = new JTextField();
		GridBagConstraints gbc_tFFechaImpresion = new GridBagConstraints();
		gbc_tFFechaImpresion.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaImpresion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaImpresion.gridx = 3;
		gbc_tFFechaImpresion.gridy = 5;
		add(tFFechaImpresion, gbc_tFFechaImpresion);
		tFFechaImpresion.setColumns(10);
		
		lblErrorEdicion = new JLabel("");
		GridBagConstraints gbc_lblErrorEdicion = new GridBagConstraints();
		gbc_lblErrorEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorEdicion.gridx = 1;
		gbc_lblErrorEdicion.gridy = 6;
		add(lblErrorEdicion, gbc_lblErrorEdicion);
		
		lblEdicion = new JLabel("Edicion");
		GridBagConstraints gbc_lblEdicion = new GridBagConstraints();
		gbc_lblEdicion.anchor = GridBagConstraints.EAST;
		gbc_lblEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdicion.gridx = 2;
		gbc_lblEdicion.gridy = 6;
		add(lblEdicion, gbc_lblEdicion);
		
		tFEdicion = new JTextField();
		GridBagConstraints gbc_tFEdicion = new GridBagConstraints();
		gbc_tFEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_tFEdicion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEdicion.gridx = 3;
		gbc_tFEdicion.gridy = 6;
		add(tFEdicion, gbc_tFEdicion);
		tFEdicion.setColumns(10);
		
		lblErrorFechaEdicion = new JLabel("");
		GridBagConstraints gbc_lblErrorFechaEdicion = new GridBagConstraints();
		gbc_lblErrorFechaEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFechaEdicion.gridx = 1;
		gbc_lblErrorFechaEdicion.gridy = 7;
		add(lblErrorFechaEdicion, gbc_lblErrorFechaEdicion);
		
		lblFechaEdicion = new JLabel("Fecha de Edicion");
		GridBagConstraints gbc_lblFechaEdicion = new GridBagConstraints();
		gbc_lblFechaEdicion.anchor = GridBagConstraints.EAST;
		gbc_lblFechaEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaEdicion.gridx = 2;
		gbc_lblFechaEdicion.gridy = 7;
		add(lblFechaEdicion, gbc_lblFechaEdicion);
		
		tFFechaEdicion = new JTextField();
		GridBagConstraints gbc_tFFechaEdicion = new GridBagConstraints();
		gbc_tFFechaEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaEdicion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaEdicion.gridx = 3;
		gbc_tFFechaEdicion.gridy = 7;
		add(tFFechaEdicion, gbc_tFFechaEdicion);
		tFFechaEdicion.setColumns(10);
		
		lblErrorGenero = new JLabel("");
		GridBagConstraints gbc_lblErrorGenero = new GridBagConstraints();
		gbc_lblErrorGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorGenero.gridx = 1;
		gbc_lblErrorGenero.gridy = 8;
		add(lblErrorGenero, gbc_lblErrorGenero);
		
		lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 8;
		add(lblGenero, gbc_lblGenero);
		
		tFGenero = new JTextField();
		GridBagConstraints gbc_tFGenero = new GridBagConstraints();
		gbc_tFGenero.insets = new Insets(0, 0, 5, 5);
		gbc_tFGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGenero.gridx = 3;
		gbc_tFGenero.gridy = 8;
		add(tFGenero, gbc_tFGenero);
		tFGenero.setColumns(10);
		
		lblErrorIdioma = new JLabel("");
		GridBagConstraints gbc_lblErrorIdioma = new GridBagConstraints();
		gbc_lblErrorIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorIdioma.gridx = 1;
		gbc_lblErrorIdioma.gridy = 9;
		add(lblErrorIdioma, gbc_lblErrorIdioma);
		
		lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 2;
		gbc_lblIdioma.gridy = 9;
		add(lblIdioma, gbc_lblIdioma);
		
		tFIdioma = new JTextField();
		GridBagConstraints gbc_tFIdioma = new GridBagConstraints();
		gbc_tFIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_tFIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIdioma.gridx = 3;
		gbc_tFIdioma.gridy = 9;
		add(tFIdioma, gbc_tFIdioma);
		tFIdioma.setColumns(10);
		
		lblErrorPrecio = new JLabel("");
		GridBagConstraints gbc_lblErrorPrecio = new GridBagConstraints();
		gbc_lblErrorPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorPrecio.gridx = 1;
		gbc_lblErrorPrecio.gridy = 10;
		add(lblErrorPrecio, gbc_lblErrorPrecio);
		
		lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 10;
		add(lblPrecio, gbc_lblPrecio);
		
		tFPrecio = new JTextField();
		GridBagConstraints gbc_tFPrecio = new GridBagConstraints();
		gbc_tFPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_tFPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFPrecio.gridx = 3;
		gbc_tFPrecio.gridy = 10;
		add(tFPrecio, gbc_tFPrecio);
		tFPrecio.setColumns(10);
		
		lblErrorExistencias = new JLabel("");
		GridBagConstraints gbc_lblErrorExistencias = new GridBagConstraints();
		gbc_lblErrorExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorExistencias.gridx = 1;
		gbc_lblErrorExistencias.gridy = 11;
		add(lblErrorExistencias, gbc_lblErrorExistencias);
		
		lblExistencias = new JLabel("Existencias");
		GridBagConstraints gbc_lblExistencias = new GridBagConstraints();
		gbc_lblExistencias.anchor = GridBagConstraints.EAST;
		gbc_lblExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblExistencias.gridx = 2;
		gbc_lblExistencias.gridy = 11;
		add(lblExistencias, gbc_lblExistencias);
		
		tFExistencias = new JTextField();
		GridBagConstraints gbc_tFExistencias = new GridBagConstraints();
		gbc_tFExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_tFExistencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFExistencias.gridx = 3;
		gbc_tFExistencias.gridy = 11;
		add(tFExistencias, gbc_tFExistencias);
		tFExistencias.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 13;
		add(btnEliminar, gbc_btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 13;
		add(btnCancelar, gbc_btnCancelar);

	}
	public void setCambios(){
		lMensaje.setText("Cambios Libros");
		btnEliminar.setText("Cambiar");
	}
	public void setBajas(){
		lMensaje.setText("Bajas Libros");
		btnEliminar.setText("Eliminar");
	}
	public void cancelar(){
		tFNombre.setText("");
		tFFechaImpresion.setText("");
		tFGenero.setText("");
		tFPrecio.setText("");
		tFExistencias.setText("");
	}
}
