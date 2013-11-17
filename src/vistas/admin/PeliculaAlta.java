package vistas.admin;

import javax.swing.*;
import java.awt.*;
import logica.articulos.Pelicula;

@SuppressWarnings("serial")
public class PeliculaAlta extends JPanel {
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
	private JButton btnAceptar, btnCancelar;
	
	public JButton getAceptar(){return btnAceptar;}
	public JButton getCancelar(){return btnCancelar;}

	public PeliculaAlta() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{115, 90, 100, 100, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		lMensaje = new JLabel("Altas Peliculas");
		GridBagConstraints gbc_lMensaje = new GridBagConstraints();
		gbc_lMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_lMensaje.insets = new Insets(0, 0, 5, 0);
		gbc_lMensaje.gridx = 3;
		gbc_lMensaje.gridy = 1;
		gbc_lMensaje.gridwidth = 2;
		add(lMensaje, gbc_lMensaje);
		
		lblErrorNombre = new JLabel("");
		lblErrorNombre.setForeground(Color.RED);
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
		
		lblErrorDirector = new JLabel("");
		lblErrorDirector.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorDirector = new GridBagConstraints();
		gbc_lblErrorDirector.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorDirector.gridx = 1;
		gbc_lblErrorDirector.gridy = 4;
		add(lblErrorDirector, gbc_lblErrorDirector);
		
		lblDirector = new JLabel("Director");
		GridBagConstraints gbc_lblDirector = new GridBagConstraints();
		gbc_lblDirector.insets = new Insets(0, 0, 5, 5);
		gbc_lblDirector.anchor = GridBagConstraints.EAST;
		gbc_lblDirector.gridx = 2;
		gbc_lblDirector.gridy = 4;
		add(lblDirector, gbc_lblDirector);
		
		tFDirector = new JTextField();
		GridBagConstraints gbc_tFDirector = new GridBagConstraints();
		gbc_tFDirector.insets = new Insets(0, 0, 5, 5);
		gbc_tFDirector.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFDirector.gridx = 3;
		gbc_tFDirector.gridy = 4;
		add(tFDirector, gbc_tFDirector);
		tFDirector.setColumns(10);
		
		lblErrorFechaEstreno = new JLabel("");
		lblErrorFechaEstreno.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorFechaEstreno = new GridBagConstraints();
		gbc_lblErrorFechaEstreno.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFechaEstreno.gridx = 1;
		gbc_lblErrorFechaEstreno.gridy = 5;
		add(lblErrorFechaEstreno, gbc_lblErrorFechaEstreno);
		
		lblFechaEstreno = new JLabel("Fecha de Lanzamiento");
		GridBagConstraints gbc_lblFechaEstreno = new GridBagConstraints();
		gbc_lblFechaEstreno.anchor = GridBagConstraints.EAST;
		gbc_lblFechaEstreno.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaEstreno.gridx = 2;
		gbc_lblFechaEstreno.gridy = 5;
		add(lblFechaEstreno, gbc_lblFechaEstreno);
		
		tFFechaEstreno = new JTextField();
		GridBagConstraints gbc_tFFechaEstreno = new GridBagConstraints();
		gbc_tFFechaEstreno.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaEstreno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaEstreno.gridx = 3;
		gbc_tFFechaEstreno.gridy = 5;
		add(tFFechaEstreno, gbc_tFFechaEstreno);
		tFFechaEstreno.setColumns(10);
		
		lblErrorGenero = new JLabel("");
		lblErrorGenero.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorGenero = new GridBagConstraints();
		gbc_lblErrorGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorGenero.gridx = 1;
		gbc_lblErrorGenero.gridy = 6;
		add(lblErrorGenero, gbc_lblErrorGenero);
		
		lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 6;
		add(lblGenero, gbc_lblGenero);
		
		tFGenero = new JTextField();
		GridBagConstraints gbc_tFGenero = new GridBagConstraints();
		gbc_tFGenero.insets = new Insets(0, 0, 5, 5);
		gbc_tFGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGenero.gridx = 3;
		gbc_tFGenero.gridy = 6;
		add(tFGenero, gbc_tFGenero);
		tFGenero.setColumns(10);
		
		lblErrorIdioma = new JLabel("");
		lblErrorIdioma.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorIdioma = new GridBagConstraints();
		gbc_lblErrorIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorIdioma.gridx = 1;
		gbc_lblErrorIdioma.gridy = 7;
		add(lblErrorIdioma, gbc_lblErrorIdioma);
		
		lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 2;
		gbc_lblIdioma.gridy = 7;
		add(lblIdioma, gbc_lblIdioma);
		
		tFIdioma = new JTextField();
		GridBagConstraints gbc_tFIdioma = new GridBagConstraints();
		gbc_tFIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_tFIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIdioma.gridx = 3;
		gbc_tFIdioma.gridy = 7;
		add(tFIdioma, gbc_tFIdioma);
		tFGenero.setColumns(10);
		
		lblErrorPrecio = new JLabel("");
		lblErrorPrecio.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorPrecio = new GridBagConstraints();
		gbc_lblErrorPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorPrecio.gridx = 1;
		gbc_lblErrorPrecio.gridy = 8;
		add(lblErrorPrecio, gbc_lblErrorPrecio);
		
		lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 8;
		add(lblPrecio, gbc_lblPrecio);
		
		tFPrecio = new JTextField();
		GridBagConstraints gbc_tFPrecio = new GridBagConstraints();
		gbc_tFPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_tFPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFPrecio.gridx = 3;
		gbc_tFPrecio.gridy = 8;
		add(tFPrecio, gbc_tFPrecio);
		tFPrecio.setColumns(10);
		
		lblErrorExistencias = new JLabel("");
		lblErrorExistencias.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorExistencias = new GridBagConstraints();
		gbc_lblErrorExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorExistencias.gridx = 1;
		gbc_lblErrorExistencias.gridy = 9;
		add(lblErrorExistencias, gbc_lblErrorExistencias);
		
		lblExistencias = new JLabel("Existencias");
		GridBagConstraints gbc_lblExistencias = new GridBagConstraints();
		gbc_lblExistencias.anchor = GridBagConstraints.EAST;
		gbc_lblExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblExistencias.gridx = 2;
		gbc_lblExistencias.gridy = 9;
		add(lblExistencias, gbc_lblExistencias);
		
		tFExistencias = new JTextField();
		GridBagConstraints gbc_tFExistencias = new GridBagConstraints();
		gbc_tFExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_tFExistencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFExistencias.gridx = 3;
		gbc_tFExistencias.gridy = 9;
		add(tFExistencias, gbc_tFExistencias);
		tFExistencias.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 2;
		gbc_btnAceptar.gridy = 11;
		add(btnAceptar, gbc_btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 11;
		add(btnCancelar, gbc_btnCancelar);

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
			for(int i=0;i<tFPrecio.getText().length();i++)
				if(tFPrecio.getText().charAt(i)< '0' || tFPrecio.getText().charAt(i) > '9'){
					lblErrorPrecio.setText("Solo Numeros");
					error = true;
					break;
				}else
					lblErrorPrecio.setText("");
		}
		
		if(tFExistencias.getText().equals("")){
			lblErrorExistencias.setText("Campo necesario");
			error = true;
		}else{
			for(int i=0;i<tFExistencias.getText().length();i++)
				if(tFExistencias.getText().charAt(i)< '0' || tFExistencias.getText().charAt(i) > '9'){
					lblErrorExistencias.setText("Solo Numeros");
					error = true;
					break;
				}else
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
		lMensaje.setText("Altas Peliculas");
	}

	public String getNombrePelicula(){return tFNombre.getText().toLowerCase();}

	public Pelicula getPelicula(){
		Pelicula pelicula = new Pelicula(tFNombre.getText(),tFDirector.getText(),tFGenero.getText(),tFIdioma.getText(),tFPrecio.getText(),tFExistencias.getText());
		pelicula.setFecha(tFFechaEstreno.getText());
		return pelicula;
	}
	
	public void setError(int e){
		if(e==1)
			lblErrorNombre.setText("Campo necesario");
		else if(e==2)
			lblErrorNombre.setText("No existe");
		else if(e==3)
			lblErrorNombre.setText("Usuario agegado mal");
		else if(e==4)
			lblErrorNombre.setText("Error");
		else
			lblErrorNombre.setText("");
	}
	
	public void repetido(boolean b){
		if(b)
			lblErrorNombre.setText("Nombre Repetido");
		else
			lblErrorNombre.setText("");
	}
	
	public void exito(){
		lMensaje.setText("Pelicula Agregada");
	}
}
