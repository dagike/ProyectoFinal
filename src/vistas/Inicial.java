package vistas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Inicial extends JPanel{
	private JButton empleado,cliente;
	public JButton getEmpleado(){return empleado;}
	public JButton getCliente(){return cliente;}
	public void showPanel(){
		setBorder(new EmptyBorder(30, 0, 0, 0));
		GridBagConstraints posicion = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
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
		posicion.gridy = 2;
		posicion.gridwidth = 2;
		posicion.weightx=1.0;
		posicion.weighty = 0;
		add(cliente, posicion);
		
		posicion.gridx = 0;
		posicion.gridy = 1;
		posicion.gridwidth = 2;
		posicion.weightx=1.0;
		posicion.weighty = 0;
		posicion.insets = new Insets(30,0,0,0);
		add(empleado, posicion);	
	}
	public Inicial(){
		empleado = new JButton("Empleado");
		cliente = new JButton("Cliente");
		showPanel();
	}
}
