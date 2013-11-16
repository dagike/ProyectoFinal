package vistas.admin;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import logica.*;

@SuppressWarnings("serial")
public class Dinamico extends JPanel {
	private JMenuBar adminMenu;
	private JMenu empleado,producto,salir;
	public static int ALTASUSUARIO=0,BAJASUSUARIO=1,CAMBIOSUSUARIO=2,ALTAARTICULO=3,BAJAARTICULO=4,CAMBIOSARTICULO=5;
	private int estado=ALTASUSUARIO;
	private NuevoUsuario nuevoUsuario;
	private BajaCambiosUsuario bajaCambios;
	
	private Usuario u;
	private JugueteAlta jugueteAlta;
	private JugueteBaja jugueteBaja;
	
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
		producto.add(productoAltas);
		producto.add(productoBajas);
		producto.add(productoCambios);
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
		jugueteBaja.setMinimumSize(new Dimension(570,400));
		jugueteBaja.setMaximumSize(new Dimension(570,400));
		jugueteBaja.setPreferredSize(new Dimension(570,400));
		add(jugueteBaja);
		
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
			}else if(e.getSource() == jugueteAlta.getAceptar()){
				if(!jugueteAlta.checkTextFields()){
					
				}
			}else if(e.getSource() == jugueteAlta.getCancelar()){
				jugueteAlta.cancelar();
			}
		}
	}
	public void estados(){
		if(estado == ALTASUSUARIO){
			bajaCambios.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			nuevoUsuario.cancelar();
			nuevoUsuario.setVisible(true);
		}
		else if(estado==BAJASUSUARIO){
			nuevoUsuario.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			bajaCambios.setBajas();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == CAMBIOSUSUARIO){
			nuevoUsuario.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			bajaCambios.setCambios();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == ALTAARTICULO){
			nuevoUsuario.setVisible(false);
			jugueteBaja.setVisible(false);
			bajaCambios.setVisible(false);
			jugueteAlta.cancelar();
			jugueteAlta.setVisible(true);
		}else if(estado == BAJAARTICULO){
			nuevoUsuario.setVisible(false);
			jugueteAlta.setVisible(false);
			bajaCambios.setVisible(false);
			jugueteBaja.setBajas();
			jugueteBaja.cancelar();
			jugueteBaja.setVisible(true);
		}else if(estado == CAMBIOSARTICULO){
			nuevoUsuario.setVisible(false);
			jugueteAlta.setVisible(false);
			bajaCambios.setVisible(false);
			jugueteBaja.setCambios();
			jugueteBaja.cancelar();
			jugueteBaja.setVisible(true);
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
	
	Action productoAltas = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTAARTICULO;
			estados();
		}
	};
	
	Action productoBajas = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJAARTICULO;
			estados();
		}
	};
	
	Action productoCambios = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSARTICULO;
			estados();
		}
	};
}
