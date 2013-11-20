import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vistas.*;
import vistas.admin.*;
import vistas.principal.*;
import logica.*;
import logica.articulos.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private MainDatabasePanel escoger;
	private Ingreso log;
	private Inicial ini;
	private Dinamico din;
	private AgregarClientePanel nvoCliente;
	private ClientePanel cliente;
	private Vector<Articulo> articulos;
	private Persona c;
	private JFileChooser fileChooser;
	
	//logica
	private Usuario usuario;
	public final static int INGRESO=0,PRINCIPAL=1,INICIAL=2,ADMINISTRADOR=3,CLIENTE=4,NVOCLIENTE=5;
	private int estado=INICIAL;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					MainFrame frame = new MainFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainFrame() {
		setResizable(false);
		setLocationRelativeTo(null);
		ini=new Inicial();
		ini.getIngresar().addActionListener(new Acciones());
		
		log=new Ingreso();
		log.getLogin().addActionListener(new Acciones());
		log.getRegresar().addActionListener(new Acciones());
		log.getPasswordField().addActionListener(new Acciones());
		
		din=new Dinamico();
		din.getSalir().add(salir);
		
		escoger=new MainDatabasePanel();
		escoger.getSalir().addActionListener(new Acciones());
		escoger.getCancelar().addActionListener(new Acciones());
		escoger.getPedido().addActionListener(new Acciones());
		
		nvoCliente=new AgregarClientePanel();
		
		cliente=new ClientePanel();
		cliente.getAceptar().addActionListener(new Acciones());;
		cliente.getCancelar().addActionListener(new Acciones());;
		cliente.getNuevo().addActionListener(new Acciones());;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		estados();
		fileChooser = new JFileChooser();
	}
	public void estados(){
		if(estado==INICIAL){
			setSize(300, 350);
			setContentPane(ini);
		}
		else if(estado==INGRESO){
			setSize(400, 350);
			log.limpiar();
			setContentPane(log);
		}
		else if(estado==PRINCIPAL){
			setSize(800, 600);
			setContentPane(escoger);
		}
		else if(estado == ADMINISTRADOR){
			setSize(660,460);
			setContentPane(din);
			setJMenuBar(din.getAdminMenu());
		}
		else if(estado == CLIENTE){
			setSize(600,250);
			setContentPane(cliente);
		}
		else if(estado == NVOCLIENTE){
			setSize(660,460);
			setContentPane(nvoCliente);
		}
	}
	public class Acciones implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//Panel inicial
			if(e.getSource()==ini.getIngresar()){
				estado=INGRESO;
				estados();
			}
			//Panel de ingresar al sistema
			else if(e.getSource()==log.getLogin()||e.getSource()==log.getPasswordField()){
				usuario=null;
				usuario=log.intentoConectar();
				if(usuario!=null){
					if(usuario.getTipo()==usuario.ADMINISTRADOR){
						din.setUser(usuario);
						estado=ADMINISTRADOR;
					}
					else if(usuario.getTipo()==usuario.EMPLEADO){
						escoger.setUsuario(usuario);
						escoger.inicio();
						estado=PRINCIPAL;
					}
					estados();
				}
			}
			else if(e.getSource()==log.getRegresar()||e.getSource()==escoger.getSalir()){
				estado=INICIAL;
				estados();
			}
			//Pricipal
			else if(e.getSource()==escoger.getCancelar()){
				escoger.inicio();
			}
			else if(e.getSource()==escoger.getPedido()){
				articulos=escoger.getArticulos();
				if(articulos==null||articulos.size()==0)
					escoger.vectorVacio();
				else{
					estado=CLIENTE;
					estados();
				}
			}
			//Cliente
			else if(e.getSource()==cliente.getCancelar()){
				estado=PRINCIPAL;
				estados();
			}
			else if(e.getSource()==cliente.getAceptar()){
				if(!cliente.checkEmail(true)){
					c=usuario.getCliente( cliente.getEmail() );
					if(c==null)
						cliente.checkEmail(false);
					else{
					//REPORTE
						if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
							String file = fileChooser.getSelectedFile().getAbsolutePath();						
							try {							
								PrintWriter fileW = new PrintWriter(file);
								int total=0;
								fileW.println( c.toString() );
								for(int i=0;i<articulos.size();i++){
									fileW.println( articulos.get(i).toString() );
									total+=articulos.get(i).getTotal();
									usuario.cambiarArticulo( articulos.get(i) );
								}
								fileW.println("Importe del pedido: $"+total);
								fileW.close();
							}catch(IOException e1) {}
							estado=PRINCIPAL;
							escoger.inicio();
							estados();
						}
					}	
				}
				
			}
			else if(e.getSource()==cliente.getNuevo()){
				estado=NVOCLIENTE;
				estados();
			}
			
			
		}
	}
	Action salir = new AbstractAction("Salir") {
		public void actionPerformed(ActionEvent e) {
			estado = INICIAL;
			setJMenuBar(null);
			din.salir();
			estados();
		}
	};
}
