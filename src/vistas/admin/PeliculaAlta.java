package vistas.admin;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class PeliculaAlta extends JPanel {
	private JLabel bienvenido, lMensaje;
	private JLabel lblNombre, lblErrorNombre;
	private JTextField tFNombre;
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
	private JButton btnAceptar, btnCancelar;
	
	public JButton getAceptar(){return btnAceptar;}
	public JButton getCancelar(){return btnCancelar;}

	public PeliculaAlta() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{115, 90, 100, 100, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		bienvenido = new JLabel("Bienvenido ");
		GridBagConstraints gbc_bienvenido = new GridBagConstraints();
		gbc_bienvenido.gridwidth = 2;
		gbc_bienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_bienvenido.anchor = GridBagConstraints.NORTH;
		gbc_bienvenido.gridx = 1;
		gbc_bienvenido.gridy = 1;
		add(bienvenido, gbc_bienvenido);
		
		lMensaje = new JLabel("Altas Peliculas");
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
		
		lblErrorFechaEstreno = new JLabel("");
		GridBagConstraints gbc_lblErrorFechaEstreno = new GridBagConstraints();
		gbc_lblErrorFechaEstreno.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFechaEstreno.gridx = 1;
		gbc_lblErrorFechaEstreno.gridy = 4;
		add(lblErrorFechaEstreno, gbc_lblErrorFechaEstreno);
		
		lblFechaEstreno = new JLabel("Fecha de Lanzamiento");
		GridBagConstraints gbc_lblFechaEstreno = new GridBagConstraints();
		gbc_lblFechaEstreno.anchor = GridBagConstraints.EAST;
		gbc_lblFechaEstreno.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaEstreno.gridx = 2;
		gbc_lblFechaEstreno.gridy = 4;
		add(lblFechaEstreno, gbc_lblFechaEstreno);
		
		tFFechaEstreno = new JTextField();
		GridBagConstraints gbc_tFFechaEstreno = new GridBagConstraints();
		gbc_tFFechaEstreno.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaEstreno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaEstreno.gridx = 3;
		gbc_tFFechaEstreno.gridy = 4;
		add(tFFechaEstreno, gbc_tFFechaEstreno);
		tFFechaEstreno.setColumns(10);
		
		lblErrorGenero = new JLabel("");
		GridBagConstraints gbc_lblErrorGenero = new GridBagConstraints();
		gbc_lblErrorGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorGenero.gridx = 1;
		gbc_lblErrorGenero.gridy = 5;
		add(lblErrorGenero, gbc_lblErrorGenero);
		
		lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 5;
		add(lblGenero, gbc_lblGenero);
		
		tFGenero = new JTextField();
		GridBagConstraints gbc_tFGenero = new GridBagConstraints();
		gbc_tFGenero.insets = new Insets(0, 0, 5, 5);
		gbc_tFGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGenero.gridx = 3;
		gbc_tFGenero.gridy = 5;
		add(tFGenero, gbc_tFGenero);
		tFGenero.setColumns(10);
		
		lblErrorIdioma = new JLabel("");
		GridBagConstraints gbc_lblErrorIdioma = new GridBagConstraints();
		gbc_lblErrorIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorIdioma.gridx = 1;
		gbc_lblErrorIdioma.gridy = 6;
		add(lblErrorIdioma, gbc_lblErrorIdioma);
		
		lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 2;
		gbc_lblIdioma.gridy = 6;
		add(lblIdioma, gbc_lblIdioma);
		
		tFIdioma = new JTextField();
		GridBagConstraints gbc_tFIdioma = new GridBagConstraints();
		gbc_tFIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_tFIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIdioma.gridx = 3;
		gbc_tFIdioma.gridy = 6;
		add(tFIdioma, gbc_tFIdioma);
		tFGenero.setColumns(10);
		
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
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 2;
		gbc_btnAceptar.gridy = 10;
		add(btnAceptar, gbc_btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 10;
		add(btnCancelar, gbc_btnCancelar);

	}
	
	public boolean checkTextFields(){
		boolean error=false;
		if(tFNombre.getText().equalsIgnoreCase("")){
			lblErrorNombre.setText("Campo necesario");
			error = true;
		}else
			lblErrorNombre.setText("");
			
		if(tFFechaEstreno.getText().equals("")){
			lblErrorFechaEstreno.setText("Campo necesario");
			error = true;
		}else
			lblErrorFechaEstreno.setText("");
		
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
		tFFechaEstreno.setText("");
		tFGenero.setText("");
		tFIdioma.setText("");
		tFPrecio.setText("");
		tFExistencias.setText("");
	}

}
