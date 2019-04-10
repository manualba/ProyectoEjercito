package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class Actualizacion extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	
	public Actualizacion() {
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
		
		JTextArea txtrActualizacionDe = new JTextArea();
		txtrActualizacionDe.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		txtrActualizacionDe.setForeground(new Color(0, 128, 0));
		txtrActualizacionDe.setBackground(Color.LIGHT_GRAY);
		txtrActualizacionDe.setEditable(false);
		txtrActualizacionDe.setText("ACTUALIZACION DE SOLDADOS");
		txtrActualizacionDe.setBounds(95, 11, 232, 22);
		panel.add(txtrActualizacionDe);
		
		JButton btnVol = new JButton("VOLVER");
		btnVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				Inicio i = new Inicio();
				i.setVisible(true);	
				
			}
		});
		btnVol.setBounds(10, 218, 89, 23);
		panel.add(btnVol);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(60, 55, 298, 141);
		panel.add(tabbedPane);
		
	}

}
