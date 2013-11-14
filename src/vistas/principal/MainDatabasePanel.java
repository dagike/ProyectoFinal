package vistas.principal;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainDatabasePanel extends JPanel {
	public void showPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		TextPanel textPanel = new TextPanel();
		add(textPanel, BorderLayout.NORTH);	
		OptionsPanel optionsPanel = new OptionsPanel();
		add(optionsPanel, BorderLayout.SOUTH);
		ShoppingAnimation shoppingAnimation = new ShoppingAnimation();
		add(shoppingAnimation,BorderLayout.CENTER);
		Cart cart = new Cart();
		add(cart,BorderLayout.EAST);
	}
	public MainDatabasePanel(){
			showPanel();
	}
}
