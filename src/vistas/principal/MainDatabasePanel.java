package vistas.principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import logica.*;
import logica.articulos.*;
import java.util.*;

@SuppressWarnings("serial")
public class MainDatabasePanel extends JPanel {
	private JButton btnPedido;
	private JButton btnCancelar;
	private JButton btnSalir;
	private JPanel sur;
	private Usuario u;
	private Articulo articulo;
	private Vector<Articulo> articulos;
	
	TextPanel textPanel;
	
	ShoppingAnimation shoppingAnimation;
	Cart cart;
	public void vectorVacio(){textPanel.checkCantidad(-1);}
	public Vector<Articulo> getArticulos(){return articulos;}
	public void setUsuario(Usuario u){this.u=u;textPanel.setUsuario(u);}
	public void inicio(){textPanel.inicio(); articulos= new Vector<Articulo>();cart.inicio();}
	public MainDatabasePanel(){
		sur= new JPanel();
		btnPedido = new JButton("Pedido");
		sur.add(btnPedido);
		btnCancelar = new JButton("Cancelar");
		sur.add(btnCancelar);
		btnSalir = new JButton("Salir");
		sur.add(btnSalir);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		setSize(800,600);
		textPanel = new TextPanel();
		GridBagLayout gridBagLayout = (GridBagLayout) textPanel.getLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		add(textPanel, BorderLayout.NORTH);
		
		shoppingAnimation = new ShoppingAnimation();
		add(shoppingAnimation,BorderLayout.CENTER);
		
		cart = new Cart();
		add(cart,BorderLayout.EAST);
		
		add(sur, BorderLayout.SOUTH);
		Acciones acciones=new Acciones();
		textPanel.getAgregar().addActionListener(acciones);
		
		
	}
	public JButton getSalir(){return btnSalir;}
	public JButton getPedido(){return btnPedido;}
	public JButton getCancelar(){return btnCancelar;}
	public class Acciones implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == textPanel.getAgregar()){ 
				if(!textPanel.checkCantidad(1)){
					articulo=textPanel.getArticulo();
					if(articulo!=null){
						boolean band=false;
						for(int i=0;i<articulos.size()&&!band;i++){
							if(articulos.get(i).getNombre().equals(articulo.getNombre()))
								band=true;
						}
						if(!band){
							articulos.add(articulo);
							cart.agregarCarrito(articulos);
						}else
							textPanel.checkCantidad(0);
						int total=0;
						for(int i=0;i<articulos.size();i++){
							total+=articulos.get(i).getTotal();
						}
						textPanel.setTotal(total);
					}	
				}
			}
			
		}
	}
	
}
