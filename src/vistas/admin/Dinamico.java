package vistas.admin;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import logica.*;

@SuppressWarnings("serial")
public class Dinamico extends JPanel {
	private JMenuBar adminMenu;
	private JMenu empleado,producto,salir;
	public static int ALTASUSUARIO=0,BAJASSUSUARIO=1,CAMBIOSUSUARIO=2;
	private int estado=BAJASSUSUARIO;
	private NuevoUsuario nuevoUsuario;
	private BajaCambiosUsuario bajaCambios;
	private Usuario u;
	
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
		nuevoUsuario.setVisible(false);
		
		bajaCambios=new BajaCambiosUsuario();
		add(bajaCambios);
		bajaCambios.setVisible(false);
		
		estados();
	}
	public class Acciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nuevoUsuario.getAceptar()){ 
				if(!nuevoUsuario.checkTextFields()){
					int error;
					error=u.agregarUsuario( nuevoUsuario.getPersona() );
					if(error==Usuario.EREPETIDO){
						nuevoUsuario.repetido(true);
					}
				}
			}else if(e.getSource() == nuevoUsuario.getCancelar()) {
				nuevoUsuario.cancelar();
			}
		}
	}
	public void estados(){
		if(estado == ALTASUSUARIO){
			bajaCambios.setVisible(false);
			nuevoUsuario.cancelar();
			nuevoUsuario.setVisible(true);
		}
		else if(estado==BAJASSUSUARIO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setBajas();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == CAMBIOSUSUARIO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setCambios();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == 4){
			
		}else if(estado == 5){
			
		}else if(estado == 6){
			
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
			estado = BAJASSUSUARIO;
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
