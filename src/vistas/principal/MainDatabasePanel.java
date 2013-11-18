package vistas.principal;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import logica.*;


@SuppressWarnings("serial")
public class MainDatabasePanel extends JPanel {
	private JButton btnPedido;
	private JButton btnCancelar;
	private JButton btnSalir;
	private JPanel sur;
	private Usuario u;
	TextPanel textPanel;
	ShoppingAnimation shoppingAnimation;
	Cart cart;
	public void setUsuario(Usuario u){this.u=u;textPanel.setUsuario(u);}
	public void inicio(){textPanel.inicio();}
	
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
		textPanel = new TextPanel();
		GridBagLayout gridBagLayout = (GridBagLayout) textPanel.getLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		add(textPanel, BorderLayout.NORTH);
		
		shoppingAnimation = new ShoppingAnimation();
		shoppingAnimation.setMinimumSize(new Dimension(100,100));
		shoppingAnimation.setMaximumSize(new Dimension(100,100));
		shoppingAnimation.setPreferredSize(new Dimension(100,100));
		add(shoppingAnimation,BorderLayout.CENTER);
		
		cart = new Cart();
		cart.setMinimumSize(new Dimension(300,300));
		cart.setMaximumSize(new Dimension(300,300));
		cart.setPreferredSize(new Dimension(300,300));
		add(cart,BorderLayout.EAST);
		
		add(sur, BorderLayout.SOUTH);
	}
	public JButton getSalir(){return btnSalir;}
	public JButton getPedido(){return btnPedido;}
	public JButton getCancelar(){return btnCancelar;}
}
