package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class AlistarSoldados extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AlistarSoldados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Inicio i = new Inicio();
				i.setVisible(true);

			}
		});
		btnVolver.setBounds(10, 218, 89, 23);
		panel.add(btnVolver);
		
		JTextArea txtrAlistamientoAlEjercito = new JTextArea();
		txtrAlistamientoAlEjercito.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		txtrAlistamientoAlEjercito.setEditable(false);
		txtrAlistamientoAlEjercito.setForeground(new Color(0, 128, 0));
		txtrAlistamientoAlEjercito.setBackground(Color.LIGHT_GRAY);
		txtrAlistamientoAlEjercito.setText("ALISTAMIENTO AL EJERCITO");
		txtrAlistamientoAlEjercito.setBounds(114, 11, 211, 23);
		panel.add(txtrAlistamientoAlEjercito);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(62, 54, 298, 141);
		panel.add(tabbedPane);
		
		
	}

}
