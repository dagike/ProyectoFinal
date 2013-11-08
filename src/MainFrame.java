import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import vistas.*;
import vistas.principal.*;


public class MainFrame extends JFrame {
	private MainDatabasePanel escoger;
	private Ingreso log;
	public final static int INGRESO=0,PRINCIPAL=1,INICIAL=2;
	private int estado=INGRESO;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.showPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainFrame() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		log=new Ingreso();
		log.showPanel();
		
		escoger=new MainDatabasePanel();
		escoger.showPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showPanel(){
		if(estado==INGRESO){
			setSize(400, 350);
			setContentPane(log);
		}
		else if(estado==PRINCIPAL){
			setSize(800, 600);
			setContentPane(escoger);
		}
		else if(estado==INICIAL){
			
		}
	}
}
