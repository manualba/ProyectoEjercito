package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class Bajas extends JFrame {

	private JPanel contentPane;

	public Bajas() {
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
		
		JTextArea txtrBajas = new JTextArea();
		txtrBajas.setForeground(new Color(0, 128, 0));
		txtrBajas.setBackground(Color.LIGHT_GRAY);
		txtrBajas.setEditable(false);
		txtrBajas.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		txtrBajas.setText("BAJAS");
		txtrBajas.setBounds(180, 11, 59, 22);
		panel.add(txtrBajas);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(56, 51, 298, 141);
		panel.add(tabbedPane);
	}

}
