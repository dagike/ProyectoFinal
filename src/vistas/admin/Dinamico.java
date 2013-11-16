package vistas.admin;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import logica.*;

@SuppressWarnings("serial")
public class Dinamico extends JPanel {
	private JMenuBar adminMenu;
	private JMenu empleado,producto,salir;
	private JMenu  disco, juguete, libro, pelicula;
	public static int ALTASUSUARIO=0,BAJASUSUARIO=1,CAMBIOSUSUARIO=2,ALTASDISCO=3,BAJASDISCO=4,CAMBIOSDISCO=5,ALTASJUGUETE=6,BAJASJUGUETE=7,CAMBIOSJUGUETE=8;
	public static int ALTASLIBRO=9,BAJASLIBRO=10,CAMBIOSLIBRO=11,ALTASPELICULA=12,BAJASPELICULA=13,CAMBIOSPELICULA=14;
	private int estado=BAJASUSUARIO;
	private NuevoUsuario nuevoUsuario;
	private BajaCambiosUsuario bajaCambios;
	
	private Usuario u;
	private JugueteAlta jugueteAlta;
	private JugueteBaja jugueteBaja;
	private DiscoAlta discoAlta;
	private DiscoBaja discoBaja;
	private LibroAlta libroAlta;
	private LibroBaja libroBaja;
	private PeliculaAlta peliculaAlta;
	private PeliculaBaja peliculaBaja;
	
	public void salir(){
		nuevoUsuario.cancelar();
		bajaCambios.cancelar();
		jugueteAlta.cancelar();
		jugueteBaja.cancelar();
	}
	
	public void setUser(Usuario u){
		this.u=u;
		nuevoUsuario.setUser(u);
		bajaCambios.setUser(u);
	}
	
	public JMenu getSalir(){return salir;}
	
	public JMenuBar getAdminMenu(){return adminMenu;}
	
	public Dinamico() {
		setBackground(Color.WHITE);
		adminMenu = new JMenuBar();
		empleado = new JMenu("Empleado");
		empleado.add(empleadoAltas);
		empleado.add(empleadoBajas);
		empleado.add(empleadoCambios);
		adminMenu.add(empleado);

		producto = new JMenu("Producto");
		disco = new JMenu("Disco");
		disco.add(altasDisco);
		disco.add(bajasDisco);
		disco.add(cambiosDisco);
		juguete = new JMenu("Jueguete");
		juguete.add(altasJuguete);
		juguete.add(bajasJuguete);
		juguete.add(cambiosJuguete);
		libro = new JMenu("Libro");
		libro.add(altasLibro);
		libro.add(bajasLibro);
		libro.add(cambiosLibro);
		pelicula = new JMenu("Pelicula");
		pelicula.add(altasPelicula);
		pelicula.add(bajasPelicula);
		pelicula.add(cambiosPelicula);
		producto.add(disco);
		producto.add(juguete);
		producto.add(libro);
		producto.add(pelicula);
		adminMenu.add(producto);
		
		salir = new JMenu("Salir");
		adminMenu.add(salir);

		nuevoUsuario=new NuevoUsuario();
		nuevoUsuario.getAceptar().addActionListener(new Acciones());
		nuevoUsuario.getCancelar().addActionListener(new Acciones());
		nuevoUsuario.setMinimumSize(new Dimension(570,400));
		nuevoUsuario.setMaximumSize(new Dimension(570,400));
		nuevoUsuario.setPreferredSize(new Dimension(570,400));
		add(nuevoUsuario);
		//nuevoUsuario.setVisible(false);
		
		bajaCambios=new BajaCambiosUsuario();
		add(bajaCambios);
		//bajaCambios.setVisible(false);
		
		jugueteAlta = new JugueteAlta();
		jugueteAlta.getAceptar().addActionListener(new Acciones());
		jugueteAlta.getCancelar().addActionListener(new Acciones());
		jugueteAlta.setMinimumSize(new Dimension(570,400));
		jugueteAlta.setMaximumSize(new Dimension(570,400));
		jugueteAlta.setPreferredSize(new Dimension(570,400));
		add(jugueteAlta);
		
		jugueteBaja = new JugueteBaja();
		jugueteBaja.getEliminar().addActionListener(new Acciones());
		jugueteBaja.getCancelar().addActionListener(new Acciones());
		jugueteBaja.getAceptar().addActionListener(new Acciones());
		jugueteBaja.setMinimumSize(new Dimension(570,400));
		jugueteBaja.setMaximumSize(new Dimension(570,400));
		jugueteBaja.setPreferredSize(new Dimension(570,400));
		add(jugueteBaja);
		
		discoAlta = new DiscoAlta();
		discoAlta.getAceptar().addActionListener(new Acciones());
		discoAlta.getCancelar().addActionListener(new Acciones());
		discoAlta.setMinimumSize(new Dimension(570,400));
		discoAlta.setMaximumSize(new Dimension(570,400));
		discoAlta.setPreferredSize(new Dimension(570,400));
		add(discoAlta);
		
		discoBaja = new DiscoBaja();
		discoBaja.getEliminar().addActionListener(new Acciones());
		discoBaja.getCancelar().addActionListener(new Acciones());
		discoBaja.getAceptar().addActionListener(new Acciones());
		discoBaja.setMinimumSize(new Dimension(570,400));
		discoBaja.setMaximumSize(new Dimension(570,400));
		discoBaja.setPreferredSize(new Dimension(570,400));
		add(discoBaja);
		
		libroAlta = new LibroAlta();
		libroAlta.getAceptar().addActionListener(new Acciones());
		libroAlta.getCancelar().addActionListener(new Acciones());
		libroAlta.setMinimumSize(new Dimension(570,400));
		libroAlta.setMaximumSize(new Dimension(570,400));
		libroAlta.setPreferredSize(new Dimension(570,400));
		add(libroAlta);
		
		libroBaja = new LibroBaja();
		libroBaja.getEliminar().addActionListener(new Acciones());
		libroBaja.getCancelar().addActionListener(new Acciones());
		libroBaja.getAceptar().addActionListener(new Acciones());
		libroBaja.setMinimumSize(new Dimension(570,400));
		libroBaja.setMaximumSize(new Dimension(570,400));
		libroBaja.setPreferredSize(new Dimension(570,400));
		add(libroBaja);
		
		peliculaAlta = new PeliculaAlta();
		peliculaAlta.getAceptar().addActionListener(new Acciones());
		peliculaAlta.getCancelar().addActionListener(new Acciones());
		peliculaAlta.setMinimumSize(new Dimension(570,400));
		peliculaAlta.setMaximumSize(new Dimension(570,400));
		peliculaAlta.setPreferredSize(new Dimension(570,400));
		add(peliculaAlta);
		
		peliculaBaja = new PeliculaBaja();
		peliculaBaja.getEliminar().addActionListener(new Acciones());
		peliculaBaja.getCancelar().addActionListener(new Acciones());
		peliculaBaja.getAceptar().addActionListener(new Acciones());
		peliculaBaja.setMinimumSize(new Dimension(570,400));
		peliculaBaja.setMaximumSize(new Dimension(570,400));
		peliculaBaja.setPreferredSize(new Dimension(570,400));
		add(peliculaBaja);
		
		estados();
	}
	public class Acciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nuevoUsuario.getAceptar()){ 
				if(!nuevoUsuario.checkTextFields()){
					Object[] options = {"Si","No"};
					int n = JOptionPane.showOptionDialog(null,"Esta seguro de dar de alta?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
					if(n==0){
						int error;
						error=u.agregarUsuario( nuevoUsuario.getPersona() );
						if(error==Usuario.EREPETIDO){
							nuevoUsuario.repetido(true);
						}else if(error==Usuario.ECONEXION){
							System.out.println("Error en la conexion");
						}
						else if(error==0){
							nuevoUsuario.cancelar();
							nuevoUsuario.exito();
						}
					}
					
				}
			}else if(e.getSource() == nuevoUsuario.getCancelar()) {
				nuevoUsuario.cancelar();
			}else if(e.getSource() == discoAlta.getAceptar()){
				if(!discoAlta.checkTextFields()){
					
				}
			}else if(e.getSource() == discoAlta.getCancelar()){
				discoAlta.cancelar();
			}else if(e.getSource() == jugueteAlta.getAceptar()){
				if(!jugueteAlta.checkTextFields()){
					
				}
			}else if(e.getSource() == jugueteAlta.getCancelar()){
				jugueteAlta.cancelar();
			}else if(e.getSource() == libroAlta.getAceptar()){
				if(!libroAlta.checkTextFields()){
					
				}
			}else if(e.getSource() == libroAlta.getCancelar()){
				libroAlta.cancelar();
			}else if(e.getSource() == peliculaAlta.getAceptar()){
				if(!peliculaAlta.checkTextFields()){
					
				}
			}else if(e.getSource() == peliculaAlta.getCancelar()){
				peliculaAlta.cancelar();
			}
		}
	}
	public void estados(){
		if(estado == ALTASUSUARIO){
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			nuevoUsuario.cancelar();
			nuevoUsuario.setVisible(true);
		}
		else if(estado==BAJASUSUARIO){
			nuevoUsuario.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			bajaCambios.setBajas();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == CAMBIOSUSUARIO){
			nuevoUsuario.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			bajaCambios.setCambios();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == ALTASDISCO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			discoAlta.cancelar();
			discoAlta.setVisible(true);
		}else if(estado == BAJASDISCO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			discoBaja.setBajas();
			discoBaja.cancelar();
			discoBaja.setVisible(true);
		}else if(estado == CAMBIOSDISCO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			discoBaja.setCambios();
			discoBaja.cancelar();
			discoBaja.setVisible(true);
		}else if(estado == ALTASJUGUETE){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			jugueteAlta.cancelar();
			jugueteAlta.setVisible(true);
		}else if(estado == BAJASJUGUETE){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			jugueteBaja.setBajas();
			jugueteBaja.cancelar();
			jugueteBaja.setVisible(true);
		}else if(estado == CAMBIOSJUGUETE){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			jugueteBaja.setCambios();
			jugueteBaja.cancelar();
			jugueteBaja.setVisible(true);
		}else if(estado == ALTASLIBRO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			libroAlta.cancelar();
			libroAlta.setVisible(true);
		}else if(estado == BAJASLIBRO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			libroBaja.setBajas();
			libroBaja.cancelar();
			libroBaja.setVisible(true);
		}else if(estado == CAMBIOSLIBRO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			libroBaja.setCambios();
			libroBaja.cancelar();
			libroBaja.setVisible(true);
		}else if(estado == ALTASPELICULA){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaBaja.setVisible(false);
			peliculaAlta.cancelar();
			peliculaAlta.setVisible(true);
		}else if(estado == BAJASPELICULA){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setBajas();
			peliculaBaja.cancelar();
			peliculaBaja.setVisible(true);
		}else if(estado == CAMBIOSPELICULA){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setCambios();
			peliculaBaja.cancelar();
			peliculaBaja.setVisible(true);
		}
	}
	Action empleadoAltas = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASUSUARIO;
			estados();
		}
	};
	Action empleadoBajas = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASUSUARIO;
			estados();
		}
	};
	
	Action empleadoCambios = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSUSUARIO;
			estados();
		}
	};
	
	Action altasDisco = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASDISCO;
			estados();
		}
	};
	
	Action bajasDisco = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASDISCO;
			estados();
		}
	};
	
	Action cambiosDisco = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSDISCO;
			estados();
		}
	};
	
	Action altasJuguete = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASJUGUETE;
			estados();
		}
	};
	
	Action bajasJuguete = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASJUGUETE;
			estados();
		}
	};
	
	Action cambiosJuguete = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSJUGUETE;
			estados();
		}
	};
	
	Action altasLibro = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASLIBRO;
			estados();
		}
	};
	
	Action bajasLibro = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASLIBRO;
			estados();
		}
	};
	
	Action cambiosLibro = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSLIBRO;
			estados();
		}
	};
	
	Action altasPelicula = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASPELICULA;
			estados();
		}
	};
	
	Action bajasPelicula = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASPELICULA;
			estados();
		}
	};
	
	Action cambiosPelicula = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSPELICULA;
			estados();
		}
	};
}
