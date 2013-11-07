import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class MainDatabaseFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDatabaseFrame frame = new MainDatabaseFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainDatabaseFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		TextPanel textPanel = new TextPanel();
		add(textPanel, BorderLayout.NORTH);	
		
		OptionsPanel optionsPanel = new OptionsPanel();
		add(optionsPanel, BorderLayout.SOUTH);
		
		ShoppingAnimation shoppingAnimation = new ShoppingAnimation();
		add(shoppingAnimation,BorderLayout.CENTER);
		
		Cart cart = new Cart();
		add(cart,BorderLayout.EAST);
	}

}
