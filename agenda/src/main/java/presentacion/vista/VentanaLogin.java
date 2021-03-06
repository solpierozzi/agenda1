package presentacion.vista;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import presentacion.vista.Intermediario.IntermediarioVista;
import java.awt.Font;

public class VentanaLogin extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JLabel lblMensaje;
	
	public VentanaLogin () 
	{
		super();
		IntermediarioVista.cambiarLookAndFeel(VentanaLogin.class.getName());
		initialize();
	}


	private void initialize() 
	{
		setTitle("Login");
		setResizable(false);
		setBounds(100, 100, 326, 193);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 318, 163);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrar();
			}
		});
		btnCancelar.setBounds(219, 135, 89, 23);
		panel.add(btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(120, 135, 89, 23);
		panel.add(btnAceptar);
		
		txtUser = new JTextField();
		txtUser.setBounds(101, 67, 207, 23);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(101, 101, 207, 23);
		panel.add(txtPassword);
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds(10, 71, 81, 14);
		panel.add(lblUser);
		
		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(10, 108, 89, 14);
		panel.add(lblPassword);
		
		JLabel lblTitulo = new JLabel("Login");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setBounds(124, 11, 124, 30);
		panel.add(lblTitulo);
		
		lblMensaje = new JLabel("Ingrese los siguientes datos para continuar");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMensaje.setBounds(10, 37, 298, 23);
		panel.add(lblMensaje);
	
	}
	
	public void mostrar()
	{
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() 
		{
			@Override
		    public void windowClosing(WindowEvent e) {
		        int confirm = JOptionPane.showOptionDialog(
		             null, "Estas seguro que quieres salir?", 
		             "Confirmación", JOptionPane.YES_NO_OPTION,
		             JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirm == 0) {
		           System.exit(0);
		        }
		    }
		});
		setVisible(true);
	}
	

	
	public JButton getBtnAceptar() 
	{
		return btnAceptar;
	}

	public JButton getBtnCancelar() 
	{
		return btnCancelar;
	}
	
	public String getUser() {
		return txtUser.getText();
	}
	
	public String getPassword() {
		return txtPassword != null ? new String(txtPassword.getPassword()) : "";
	}



	public void cerrar() {
		dispose();
		setVisible(false);
	}
}
