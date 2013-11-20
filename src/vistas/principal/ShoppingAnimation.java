package vistas.principal;
import vistas.*;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class ShoppingAnimation extends JPanel{
	
	public ShoppingAnimation() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{250, 0};
		gridBagLayout.rowHeights = new int[]{150, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Animacion panel = new Animacion();
		panel.setBackground(Color.BLACK);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
	}

}
