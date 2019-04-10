package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Window.Type;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	public Login() {
		setTitle("www.EjercitoDeProgramaci\u00F3n.com");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrUsuario = new JTextArea();
		txtrUsuario.setForeground(Color.RED);
		txtrUsuario.setBackground(Color.LIGHT_GRAY);
		txtrUsuario.setBounds(34, 91, 76, 26);
		txtrUsuario.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrUsuario.setText("USERNAME:");
		txtrUsuario.setEditable(false);
		panel.add(txtrUsuario);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.PINK);
		textField.setBounds(114, 94, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrContrasea = new JTextArea();
		txtrContrasea.setEditable(false);
		txtrContrasea.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		txtrContrasea.setForeground(Color.RED);
		txtrContrasea.setBackground(Color.LIGHT_GRAY);
		txtrContrasea.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrContrasea.setText("PASSWORD:");
		txtrContrasea.setBounds(34, 128, 76, 20);
		panel.add(txtrContrasea);
		
		JTextArea txtrProyectoManu = new JTextArea();
		txtrProyectoManu.setBackground(Color.LIGHT_GRAY);
		txtrProyectoManu.setEditable(false);
		txtrProyectoManu.setForeground(new Color(0, 100, 0));
		txtrProyectoManu.setFont(new Font("Perpetua Titling MT", Font.BOLD, 33));
		txtrProyectoManu.setText("WEB EJ\u00C9RCITO");
		txtrProyectoManu.setBounds(88, 22, 258, 41);
		panel.add(txtrProyectoManu);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setBackground(Color.PINK);
		passwordField.setBounds(114, 130, 86, 20);
		panel.add(passwordField);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				
				
				dispose();
				
				if (textField.getText().equals("root") && passwordField.getText().equals("manolo99")) {
					
					
					Inicio i = new Inicio();
					i.setVisible(true);

				}else {
					
					dispose();
					JOptionPane.showMessageDialog(null, "Tu nombre de usuario o contraseña no son correctos ", "ERROR", JOptionPane.OK_OPTION);
					Login l = new Login();
					l.setVisible(true);

			}			
				
		}
			
		});
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setForeground(Color.DARK_GRAY);
		btnEntrar.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnEntrar.setBounds(34, 170, 89, 41);
		panel.add(btnEntrar);
		
		JTextArea txtrnoTienesUsuario = new JTextArea();
		txtrnoTienesUsuario.setEditable(false);
		txtrnoTienesUsuario.setBackground(Color.LIGHT_GRAY);
		txtrnoTienesUsuario.setFont(new Font("Aparajita", Font.PLAIN, 14));
		txtrnoTienesUsuario.setText("\u00BFNo tienes usuario?");
		txtrnoTienesUsuario.setBounds(199, 196, 100, 20);
		panel.add(txtrnoTienesUsuario);
		
		JTextArea txtrRegistrateAquiAhora = new JTextArea();
		txtrRegistrateAquiAhora.setEditable(false);
		txtrRegistrateAquiAhora.setBackground(Color.LIGHT_GRAY);
		txtrRegistrateAquiAhora.setFont(new Font("Aparajita", Font.PLAIN, 13));
		txtrRegistrateAquiAhora.setText("Registrate aqui ahora!!");
		txtrRegistrateAquiAhora.setBounds(199, 219, 100, 22);
		panel.add(txtrRegistrateAquiAhora);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegistroCuenta r = new RegistroCuenta();
				r.setVisible(true);
			}
		});
		btnRegistrar.setBounds(309, 206, 100, 20);
		panel.add(btnRegistrar);
	}
}
