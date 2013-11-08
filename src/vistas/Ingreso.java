package vistas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Ingreso extends JPanel{
	private JTextField usuario;
	private JPasswordField password;
	private JLabel lusuario,lpassword,lerror;
	private JButton login,limpiar;
	
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
		JPanel imagen=new JPanel();
		
		imagen.setMinimumSize(new Dimension(200,100));
		imagen.setMaximumSize(new Dimension(200,100));
		imagen.setPreferredSize(new Dimension(200,100));
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
		add(limpiar, posicion);
		
		
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
		limpiar = new JButton("Regresar");
		lerror = new JLabel("");
		lerror.setForeground(new Color(255,0,0));
	}
}
