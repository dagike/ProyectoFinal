import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vistas.*;
import vistas.admin.*;
import vistas.principal.*;
import logica.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private MainDatabasePanel escoger;
	private Ingreso log;
	private Inicial ini;
	private Dinamico din;
	
	//logica
	private Usuario usuario;
	public final static int INGRESO=0,PRINCIPAL=1,INICIAL=2,ADMINISTRADOR=3;
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
		//setResizable(false);
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		estados();
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
			//Agregar Nuevo Usuario
			
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
