package vistas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Inicial extends JPanel{
	private JButton ingresar;
	public JButton getIngresar(){return ingresar;}

	public void showPanel(){
		setBorder(new EmptyBorder(30, 0, 0, 0));
		GridBagConstraints posicion = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
		JPanel imagen=new JPanel();
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
		posicion.gridy = 1;
		posicion.gridwidth = 2;
		posicion.weightx=1.0;
		posicion.weighty = 0;
		posicion.insets = new Insets(30,0,0,0);
		add(ingresar, posicion);	
	}
	public Inicial(){
		ingresar = new JButton("Ingresar");
		showPanel();
	}
}
