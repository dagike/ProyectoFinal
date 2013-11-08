package vistas.principal;
import javax.swing.JPanel;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class OptionsPanel extends JPanel {
	private JButton btnPedido;
	private JButton btnCancelar;
	private JButton btnSalir;
	
	public OptionsPanel() {
		
		btnPedido = new JButton("Pedido");
		add(btnPedido);
		
		btnCancelar = new JButton("Cancelar");
		add(btnCancelar);
		
		btnSalir = new JButton("Salir");
		add(btnSalir);

	}

}
