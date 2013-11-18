package vistas.admin;

import javax.swing.*;
import java.awt.*;
import logica.articulos.Libro;

@SuppressWarnings("serial")
public class LibroBaja extends JPanel {
	private JLabel bienvenido, lMensaje;
	private JLabel lblNombre, lblErrorNombre;
	private JTextField tFNombre;
	private JLabel lblAutor, lblErrorAutor;
	private JTextField tFAutor;
	private JLabel lblEditorial, lblErrorEditorial;
	private JTextField tFEditorial;
	private JLabel lblFechaImpresion, lblErrorFechaImpresion;
	private JTextField tFFechaImpresion;
	private JLabel lblEdicion, lblErrorEdicion;
	private JTextField tFEdicion;
	private JLabel lblGenero, lblErrorGenero;
	private JTextField tFGenero;
	private JLabel lblIdioma, lblErrorIdioma;
	private JTextField tFIdioma;
	private JLabel lblISBN, lblErrorISBN;
	private JTextField tFISBN;
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
		gridBagLayout.rowHeights = new int[]{0, 0, 40, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 3;
		add(btnAceptar, gbc_btnAceptar);
		
		lblErrorAutor = new JLabel("");
		lblErrorAutor.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorAutor = new GridBagConstraints();
		gbc_lblErrorAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorAutor.gridx = 1;
		gbc_lblErrorAutor.gridy = 5;
		add(lblErrorAutor, gbc_lblErrorAutor);
		
		lblAutor = new JLabel("Autor");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.anchor = GridBagConstraints.EAST;
		gbc_lblAutor.gridx = 2;
		gbc_lblAutor.gridy = 5;
		add(lblAutor, gbc_lblAutor);
		
		tFAutor = new JTextField();
		GridBagConstraints gbc_tFAutor = new GridBagConstraints();
		gbc_tFAutor.insets = new Insets(0, 0, 5, 5);
		gbc_tFAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAutor.gridx = 3;
		gbc_tFAutor.gridy = 5;
		add(tFAutor, gbc_tFAutor);
		tFAutor.setColumns(10);
		
		lblErrorEditorial = new JLabel("");
		lblErrorEditorial.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorEditorial = new GridBagConstraints();
		gbc_lblErrorEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorEditorial.gridx = 1;
		gbc_lblErrorEditorial.gridy = 6;
		add(lblErrorEditorial, gbc_lblErrorEditorial);
		
		lblEditorial = new JLabel("Editorial");
		GridBagConstraints gbc_lblEditorial = new GridBagConstraints();
		gbc_lblEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditorial.anchor = GridBagConstraints.EAST;
		gbc_lblEditorial.gridx = 2;
		gbc_lblEditorial.gridy = 6;
		add(lblEditorial, gbc_lblEditorial);
		
		tFEditorial = new JTextField();
		GridBagConstraints gbc_tFEditorial = new GridBagConstraints();
		gbc_tFEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_tFEditorial.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEditorial.gridx = 3;
		gbc_tFEditorial.gridy = 6;
		add(tFEditorial, gbc_tFEditorial);
		tFEditorial.setColumns(10);
		
		lblErrorFechaImpresion = new JLabel("");
		lblErrorFechaImpresion.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorFechaImpresion = new GridBagConstraints();
		gbc_lblErrorFechaImpresion.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFechaImpresion.gridx = 1;
		gbc_lblErrorFechaImpresion.gridy = 7;
		add(lblErrorFechaImpresion, gbc_lblErrorFechaImpresion);
		
		lblFechaImpresion = new JLabel("Fecha de Impresion");
		GridBagConstraints gbc_lblFechaImpresion = new GridBagConstraints();
		gbc_lblFechaImpresion.anchor = GridBagConstraints.EAST;
		gbc_lblFechaImpresion.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaImpresion.gridx = 2;
		gbc_lblFechaImpresion.gridy = 7;
		add(lblFechaImpresion, gbc_lblFechaImpresion);
		
		tFFechaImpresion = new JTextField();
		GridBagConstraints gbc_tFFechaImpresion = new GridBagConstraints();
		gbc_tFFechaImpresion.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaImpresion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaImpresion.gridx = 3;
		gbc_tFFechaImpresion.gridy = 7;
		add(tFFechaImpresion, gbc_tFFechaImpresion);
		tFFechaImpresion.setColumns(10);
		
		lblErrorEdicion = new JLabel("");
		lblErrorEdicion.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorEdicion = new GridBagConstraints();
		gbc_lblErrorEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorEdicion.gridx = 1;
		gbc_lblErrorEdicion.gridy = 8;
		add(lblErrorEdicion, gbc_lblErrorEdicion);
		
		lblEdicion = new JLabel("Edicion");
		GridBagConstraints gbc_lblEdicion = new GridBagConstraints();
		gbc_lblEdicion.anchor = GridBagConstraints.EAST;
		gbc_lblEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdicion.gridx = 2;
		gbc_lblEdicion.gridy = 8;
		add(lblEdicion, gbc_lblEdicion);
		
		tFEdicion = new JTextField();
		GridBagConstraints gbc_tFEdicion = new GridBagConstraints();
		gbc_tFEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_tFEdicion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEdicion.gridx = 3;
		gbc_tFEdicion.gridy = 8;
		add(tFEdicion, gbc_tFEdicion);
		tFEdicion.setColumns(10);
		
		lblErrorGenero = new JLabel("");
		lblErrorGenero.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorGenero = new GridBagConstraints();
		gbc_lblErrorGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorGenero.gridx = 1;
		gbc_lblErrorGenero.gridy = 9;
		add(lblErrorGenero, gbc_lblErrorGenero);
		
		lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 9;
		add(lblGenero, gbc_lblGenero);
		
		tFGenero = new JTextField();
		GridBagConstraints gbc_tFGenero = new GridBagConstraints();
		gbc_tFGenero.insets = new Insets(0, 0, 5, 5);
		gbc_tFGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGenero.gridx = 3;
		gbc_tFGenero.gridy = 9;
		add(tFGenero, gbc_tFGenero);
		tFGenero.setColumns(10);
		
		lblErrorIdioma = new JLabel("");
		lblErrorIdioma.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorIdioma = new GridBagConstraints();
		gbc_lblErrorIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorIdioma.gridx = 1;
		gbc_lblErrorIdioma.gridy = 10;
		add(lblErrorIdioma, gbc_lblErrorIdioma);
		
		lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 2;
		gbc_lblIdioma.gridy = 10;
		add(lblIdioma, gbc_lblIdioma);
		
		tFIdioma = new JTextField();
		GridBagConstraints gbc_tFIdioma = new GridBagConstraints();
		gbc_tFIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_tFIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIdioma.gridx = 3;
		gbc_tFIdioma.gridy = 10;
		add(tFIdioma, gbc_tFIdioma);
		tFIdioma.setColumns(10);
		
		lblErrorISBN = new JLabel("");
		lblErrorISBN.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorISBN = new GridBagConstraints();
		gbc_lblErrorISBN.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorISBN.gridx = 1;
		gbc_lblErrorISBN.gridy = 11;
		add(lblErrorISBN, gbc_lblErrorISBN);
		
		lblISBN = new JLabel("ISBN");
		GridBagConstraints gbc_lblISBN = new GridBagConstraints();
		gbc_lblISBN.anchor = GridBagConstraints.EAST;
		gbc_lblISBN.insets = new Insets(0, 0, 5, 5);
		gbc_lblISBN.gridx = 2;
		gbc_lblISBN.gridy = 11;
		add(lblISBN, gbc_lblISBN);
		
		tFISBN = new JTextField();
		GridBagConstraints gbc_tFISBN = new GridBagConstraints();
		gbc_tFISBN.insets = new Insets(0, 0, 5, 5);
		gbc_tFISBN.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFISBN.gridx = 3;
		gbc_tFISBN.gridy = 11;
		add(tFISBN, gbc_tFISBN);
		tFISBN.setColumns(10);
		
		lblErrorPrecio = new JLabel("");
		lblErrorPrecio.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorPrecio = new GridBagConstraints();
		gbc_lblErrorPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorPrecio.gridx = 1;
		gbc_lblErrorPrecio.gridy = 12;
		add(lblErrorPrecio, gbc_lblErrorPrecio);
		
		lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 12;
		add(lblPrecio, gbc_lblPrecio);
		
		tFPrecio = new JTextField();
		GridBagConstraints gbc_tFPrecio = new GridBagConstraints();
		gbc_tFPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_tFPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFPrecio.gridx = 3;
		gbc_tFPrecio.gridy = 12;
		add(tFPrecio, gbc_tFPrecio);
		tFPrecio.setColumns(10);
		
		lblErrorExistencias = new JLabel("");
		lblErrorExistencias.setForeground(Color.RED);
		GridBagConstraints gbc_lblErrorExistencias = new GridBagConstraints();
		gbc_lblErrorExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorExistencias.gridx = 1;
		gbc_lblErrorExistencias.gridy = 13;
		add(lblErrorExistencias, gbc_lblErrorExistencias);
		
		lblExistencias = new JLabel("Existencias");
		GridBagConstraints gbc_lblExistencias = new GridBagConstraints();
		gbc_lblExistencias.anchor = GridBagConstraints.EAST;
		gbc_lblExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblExistencias.gridx = 2;
		gbc_lblExistencias.gridy = 13;
		add(lblExistencias, gbc_lblExistencias);
		
		tFExistencias = new JTextField();
		GridBagConstraints gbc_tFExistencias = new GridBagConstraints();
		gbc_tFExistencias.insets = new Insets(0, 0, 5, 5);
		gbc_tFExistencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFExistencias.gridx = 3;
		gbc_tFExistencias.gridy = 13;
		add(tFExistencias, gbc_tFExistencias);
		tFExistencias.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 15;
		add(btnEliminar, gbc_btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 15;
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
	
	public boolean checkTextFields(){
		boolean error=false;
		if(tFNombre.getText().equalsIgnoreCase("")){
			lblErrorNombre.setText("Campo necesario");
			error = true;
		}else
			lblErrorNombre.setText("");
	
		if(tFAutor.getText().equals("")){
			lblErrorAutor.setText("Campo necesario");
			error = true;
		}else{
			lblErrorAutor.setText("");
		}
		
		if(tFEditorial.getText().equals("")){
			lblErrorEditorial.setText("Campo necesario");
			error = true;
		}else{
			lblErrorEditorial.setText("");
		}
		
		if(tFPrecio.getText().equals("")){
			lblErrorPrecio.setText("Campo necesario");
			error = true;
		}else{
			lblErrorPrecio.setText("");
		}
			
		if(tFFechaImpresion.getText().equals("")){
			lblErrorFechaImpresion.setText("Campo necesario");
			error = true;
		}else{
			Libro libro = new Libro();
			if(!libro.setFecha( tFFechaImpresion.getText() )){
				lblErrorFechaImpresion.setText("Fecha aaaa-mm-dd");
				error=true;
			}
			else
				lblErrorFechaImpresion.setText("");
		}
		
		if(tFEdicion.getText().equals("")){
			lblErrorEdicion.setText("Campo necesario");
			error = true;
		}else{
			for(int i=0;i<tFEdicion.getText().length();i++)
				if(tFEdicion.getText().charAt(i)< '0' || tFEdicion.getText().charAt(i) > '9'){
					lblErrorEdicion.setText("Solo Numeros");
					error = true;
					break;
				}else
					lblErrorEdicion.setText("");
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
		
		if(tFISBN.getText().equals("")){
			lblErrorISBN.setText("Campo necesario");
			error = true;
		}else{
			lblErrorISBN.setText("");
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
	
	public void cancelar(int estado){
		tFNombre.setText("");
		tFAutor.setText("");
		tFEditorial.setText("");
		tFFechaImpresion.setText("");
		tFEdicion.setText("");
		tFGenero.setText("");
		tFIdioma.setText("");
		tFISBN.setText("");
		tFPrecio.setText("");
		tFExistencias.setText("");
		if(estado == Dinamico.BAJASLIBRO)
			lMensaje.setText("Bajas Libros");
		else
			lMensaje.setText("Cambios Libros");
	}
	
	public String getNombreLibro(){return tFNombre.getText().toLowerCase();}

	public Libro getLibro(){
		Libro libro = new Libro(tFNombre.getText(),tFAutor.getText(),tFEditorial.getText(),tFIdioma.getText(),tFISBN.getText(),tFGenero.getText(),tFEdicion.getText(),tFPrecio.getText(),tFExistencias.getText());
		libro.setFecha(tFFechaImpresion.getText());
		return libro;
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
	
	public void cargarDatos(Libro libro){
		tFNombre.setText(libro.getNombre());
		tFAutor.setText(libro.getAutor());
		tFEditorial.setText(libro.getEditorial());
		tFFechaImpresion.setText(libro.getFecha());
		tFEdicion.setText(String.valueOf(libro.getEdicion()));
		tFGenero.setText(libro.getGenero());
		tFIdioma.setText(libro.getIdioma());
		tFISBN.setText(libro.getIsbn());
		tFPrecio.setText(String.valueOf(libro.getPrecio()));
		tFExistencias.setText(String.valueOf(libro.getExistencias()));
	}
	
	public void exito(int estado){
		if(estado==Dinamico.BAJASLIBRO)
			lMensaje.setText("Libro Eliminado");
		else
			lMensaje.setText("Libro Cambiado");
	}
}
