package vistas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import logica.*;

@SuppressWarnings("serial")
public class Ingreso extends JPanel implements Runnable{
	private JTextField usuario;
	private JPasswordField password;
	private JLabel lusuario,lpassword,lerror;
	private JButton login,regresar;
	private ferchoClient f;
	private Thread me;
	public JButton getLogin(){return login;}
	public JButton getRegresar(){return regresar;}
	public JPasswordField getPasswordField(){return password;}
	public void limpiar(){
		usuario.setText("");
		password.setText("");
		lerror.setText("");
	}
	Usuario u;
	int ya;
	public void run(){
		while(true){
			try{
				Thread.sleep(100);
			}catch (InterruptedException e){}
			if(f.getIntento()==1){
				u=null;
				if(f.getSi()==1){
					this.u=intentoConectar(usuario.getText(),String.copyValueOf(password.getPassword()) );
					if(this.u==null)
						lerror.setText("Error en usuario o password");
				}
				else{
					lerror.setText("No hay Servidor");
				}
				f.setIntento(0);
				ya=1;
			}
		}
	}
	public Usuario intentoConectar(String n,String p){
		Connection coneccion;
		Usuario u;
		try {
			Class.forName("org.postgresql.Driver"); 
			coneccion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/tienda",n,p);
			u=new Usuario(n,coneccion);
			return u;
		}
		catch (SQLException excepcionSql) {
		}
		catch( ClassNotFoundException e){
			System.out.println("Where is your PostgreSQL JDBC Driver? "+ "Include in your library path!");
		}
		return null; 
	}
	
	public Usuario cliente(){
		ya=0;
		f.setState(ferchoClient.RUN);
		while(ya==0){
			try{
				Thread.sleep(100);
			}catch (InterruptedException e){}
		}
		
		return u;
	}
	
	public void showPanel(){
		setBorder(new EmptyBorder(30, 0, 0, 0));
		GridBagConstraints posicion = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
		JPanel pusuario=new JPanel();
		pusuario.add(lusuario);
		pusuario.add(usuario);
		JPanel ppassword=new JPanel();
		ppassword.add(lpassword);
		ppassword.add(password);
		Animacion imagen=new Animacion();
		
		imagen.setMinimumSize(new Dimension(250,150));
		imagen.setMaximumSize(new Dimension(250,150));
		imagen.setPreferredSize(new Dimension(250,150));
		imagen.setBackground(new Color(120,213,220));
		
		posicion.gridx = 0;
		posicion.gridy = 0;
		posicion.gridwidth = 2;
		posicion.weightx=1.0;
		add(imagen, posicion);
		
		posicion.gridx = 0;
		posicion.gridy = 3;
		posicion.gridwidth = 2;
		posicion.weightx = 1.0;
		add(ppassword, posicion);
	
		posicion.gridx = 0;
		posicion.gridy = 5;
		posicion.gridwidth = 1;
		posicion.weightx = 1.0;
		posicion.weighty = 0.5;
		add(login, posicion);
		
		posicion.gridx = 1;
		posicion.gridy = 5;
		posicion.gridwidth = 1;
		posicion.weightx = 1.0;
		posicion.weighty = 0.5;
		add(regresar, posicion);
		
		
		posicion.gridx = 0;
		posicion.gridy = 4;
		posicion.gridwidth = 2;
		posicion.weightx=1.0;
		posicion.weighty= 0;
		posicion.insets = new Insets(15,0,0,0);
		add(lerror, posicion);
		
		posicion.gridx = 0;
		posicion.gridy = 2;
		posicion.gridwidth = 2;
		posicion.weightx=1.0;
		posicion.weighty = 0;
		posicion.insets = new Insets(30,0,0,0);
		add(pusuario, posicion);
		
	}
	public Ingreso(){
		usuario = new JTextField(20);
		password = new JPasswordField(20);
		lusuario = new JLabel("Usuario: ");
		lpassword = new JLabel("Password:");
		login = new JButton("Login");
		regresar = new JButton("Regresar");
		lerror = new JLabel("");
		lerror.setForeground(new Color(255,0,0));
		showPanel();
		f=new ferchoClient();
		f.start();
		me =new Thread(this);
		me.start();
	}
}
