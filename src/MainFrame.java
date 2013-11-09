import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vistas.*;
import vistas.principal.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private MainDatabasePanel escoger;
	private Ingreso log;
	private Inicial ini;
	
	public final static int INGRESO=0,PRINCIPAL=1,INICIAL=2;
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
		ini.getEmpleado().addActionListener(new Acciones());
		ini.getCliente().addActionListener(new Acciones());
		
		log=new Ingreso();
		log.getLogin().addActionListener(new Acciones());
		log.getRegresar().addActionListener(new Acciones());
		log.getPasswordField().addActionListener(new Acciones());
		
		escoger=new MainDatabasePanel();
		
		
		
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
	}
	public class Acciones implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//Panel inicial
			if(e.getSource()==ini.getEmpleado()){
				estado=INGRESO;
				estados();
			}
			else if(e.getSource()==ini.getCliente()){
				estado=PRINCIPAL;
				estados();
			}
			//Panel de ingresar al sistema
			else if(e.getSource()==log.getLogin()){
				log.intentoConectar();
				//estado=INGRESO;
				//estados();
			}
			else if(e.getSource()==log.getPasswordField()){
				log.intentoConectar();
			}
			else if(e.getSource()==log.getRegresar()){
				estado=INICIAL;
				estados();
			}
			
		}
	}
}
