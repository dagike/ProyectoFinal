package vistas.admin;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class PeliculaBaja extends JPanel {
	private JLabel bienvenido, lMensaje;
	private JLabel lblNombre, lblErrorNombre;
	private JTextField tFNombre;
	private JLabel lblDirector, lblErrorDirector;
	private JTextField tFDirector;
	private JLabel lblFechaEstreno, lblErrorFechaEstreno;
	private JTextField tFFechaEstreno;
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

	public PeliculaBaja() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{115, 90, 100, 100, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 40, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		bienvenido = new JLabel("Bienvenido ");
		GridBagConstraints gbc_bienvenido = new GridBagConstraints();
		gbc_bienvenido.gridwidth = 2;
		gbc_bienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenido.anchor = GridBagConstraints.NORTH;
		gbc_bienvenido.gridx = 1;
		gbc_bienvenido.gridy = 1;
		add(bienvenido, gbc_bienvenido);
		
		lMensaje = new JLabel("Bajas Peliculas");
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
		
		lblErrorDirector = new JLabel("");
		GridBagConstraints gbc_lblErrorDirector = new GridBagConstraints();
		gbc_lblErrorDirector.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorDirector.gridx = 1;
		gbc_lblErrorDirector.gridy = 5;
		add(lblErrorDirector, gbc_lblErrorDirector);
		
		lblDirector = new JLabel("Director");
		GridBagConstraints gbc_lblDirector = new GridBagConstraints();
		gbc_lblDirector.insets = new Insets(0, 0, 5, 5);
		gbc_lblDirector.anchor = GridBagConstraints.EAST;
		gbc_lblDirector.gridx = 2;
		gbc_lblDirector.gridy = 5;
		add(lblDirector, gbc_lblDirector);
		
		tFDirector = new JTextField();
		GridBagConstraints gbc_tFDirector = new GridBagConstraints();
		gbc_tFDirector.insets = new Insets(0, 0, 5, 5);
		gbc_tFDirector.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFDirector.gridx = 3;
		gbc_tFDirector.gridy = 5;
		add(tFDirector, gbc_tFDirector);
		tFDirector.setColumns(10);
		
		lblErrorFechaEstreno = new JLabel("");
		GridBagConstraints gbc_lblErrorFechaLanzamiento = new GridBagConstraints();
		gbc_lblErrorFechaLanzamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFechaLanzamiento.gridx = 1;
		gbc_lblErrorFechaLanzamiento.gridy = 6;
		add(lblErrorFechaEstreno, gbc_lblErrorFechaLanzamiento);
		
		lblFechaEstreno = new JLabel("Fecha de Estreno");
		GridBagConstraints gbc_lblFechaLanzamiento = new GridBagConstraints();
		gbc_lblFechaLanzamiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaLanzamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaLanzamiento.gridx = 2;
		gbc_lblFechaLanzamiento.gridy = 6;
		add(lblFechaEstreno, gbc_lblFechaLanzamiento);
		
		tFFechaEstreno = new JTextField();
		GridBagConstraints gbc_tFFechaLanzamiento = new GridBagConstraints();
		gbc_tFFechaLanzamiento.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaLanzamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaLanzamiento.gridx = 3;
		gbc_tFFechaLanzamiento.gridy = 6;
		add(tFFechaEstreno, gbc_tFFechaLanzamiento);
		tFFechaEstreno.setColumns(10);
		
		lblErrorGenero = new JLabel("");
		GridBagConstraints gbc_lblErrorGenero = new GridBagConstraints();
		gbc_lblErrorGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorGenero.gridx = 1;
		gbc_lblErrorGenero.gridy = 7;
		add(lblErrorGenero, gbc_lblErrorGenero);
		
		lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 7;
		add(lblGenero, gbc_lblGenero);
		
		tFGenero = new JTextField();
		GridBagConstraints gbc_tFGenero = new GridBagConstraints();
		gbc_tFGenero.insets = new Insets(0, 0, 5, 5);
		gbc_tFGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGenero.gridx = 3;
		gbc_tFGenero.gridy = 7;
		add(tFGenero, gbc_tFGenero);
		tFGenero.setColumns(10);
		
		lblErrorIdioma = new JLabel("");
		GridBagConstraints gbc_lblErrorIdioma = new GridBagConstraints();
		gbc_lblErrorIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorIdioma.gridx = 1;
		gbc_lblErrorIdioma.gridy = 8;
		add(lblErrorIdioma, gbc_lblErrorIdioma);
		
		lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 2;
		gbc_lblIdioma.gridy = 8;
		add(lblIdioma, gbc_lblIdioma);
		
		tFIdioma = new JTextField();
		GridBagConstraints gbc_tFIdioma = new GridBagConstraints();
		gbc_tFIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_tFIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIdioma.gridx = 3;
		gbc_tFIdioma.gridy = 8;
		add(tFIdioma, gbc_tFIdioma);
		tFIdioma.setColumns(10);
		
		lblErrorPrecio = new JLabel("");
		GridBagConstraints gbc_lblErrorPrecio = new GridBagConstraints();
		gbc_lblErrorPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorPrecio.gridx = 1;
		gbc_lblErrorPrecio.gridy = 9;
		add(lblErrorPrecio, gbc_lblErrorPrecio);
		
		lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 9;
		add(lblPrecio, gbc_lblPrecio);
		
		tFPrecio = new JTextField();
		GridBagConstraints gbc_tFPrecio = new GridBagConstraints();
		gbc_tFPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_tFPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFPrecio.gridx = 3;
		gbc_tFPrecio.gridy = 9;
		add(tFPrecio, gbc_tFPrecio);
		tFPrecio.setColumns(10);
		
		lblErrorExistencias = new JLabel("");
		GridBagConstraints gbc_lblErrorExistencias = new GridBagConstraints();
		gbc_lblErrorExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorExistencias.gridx = 1;
		gbc_lblErrorExistencias.gridy = 10;
		add(lblErrorExistencias, gbc_lblErrorExistencias);
		
		lblExistencias = new JLabel("Existencias");
		GridBagConstraints gbc_lblExistencias = new GridBagConstraints();
		gbc_lblExistencias.anchor = GridBagConstraints.EAST;
		gbc_lblExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblExistencias.gridx = 2;
		gbc_lblExistencias.gridy = 10;
		add(lblExistencias, gbc_lblExistencias);
		
		tFExistencias = new JTextField();
		GridBagConstraints gbc_tFExistencias = new GridBagConstraints();
		gbc_tFExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_tFExistencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFExistencias.gridx = 3;
		gbc_tFExistencias.gridy = 10;
		add(tFExistencias, gbc_tFExistencias);
		tFExistencias.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 12;
		add(btnEliminar, gbc_btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 12;
		add(btnCancelar, gbc_btnCancelar);

	}
	
	public void setCambios(){
		lMensaje.setText("Cambios Peliculas");
		btnEliminar.setText("Cambiar");
	}
	
	public void setBajas(){
		lMensaje.setText("Bajas Peliculas");
		btnEliminar.setText("Eliminar");
	}
	
	public boolean checkTextFields(){
		boolean error=false;
		
		if(tFNombre.getText().equalsIgnoreCase("")){
			lblErrorNombre.setText("Campo necesario");
			error = true;
		}else{
			lblErrorNombre.setText("");
		}
		
		if(tFDirector.getText().equalsIgnoreCase("")){
			lblErrorDirector.setText("Campo necesario");
			error = true;
		}else{
			lblErrorDirector.setText("");
		}
			
		if(tFFechaEstreno.getText().equals("")){
			lblErrorFechaEstreno.setText("Campo necesario");
			error = true;
		}else{
			lblErrorFechaEstreno.setText("");
		}
		
		if(tFGenero.getText().equals("")){
			lblErrorGenero.setText("Campo necesario");
			error = true;
		}else{
			lblErrorGenero.setText("");
		}
		
		if(tFIdioma.getText().equals("")){
			lblErrorIdioma.setText("Campo necesario");
			error = true;
		}else{
			lblErrorIdioma.setText("");
		}
		
		if(tFPrecio.getText().equals("")){
			lblErrorPrecio.setText("Campo necesario");
			error = true;
		}else{
			lblErrorPrecio.setText("");
		}
		
		if(tFExistencias.getText().equals("")){
			lblErrorExistencias.setText("Campo necesario");
			error = true;
		}else{
			lblErrorExistencias.setText("");
		}
		return error;
	}
	
	public void cancelar(){
		tFNombre.setText("");
		tFDirector.setText("");
		tFFechaEstreno.setText("");
		tFGenero.setText("");
		tFIdioma.setText("");
		tFPrecio.setText("");
		tFExistencias.setText("");
	}
}
