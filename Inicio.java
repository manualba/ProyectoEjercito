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
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Font;

public class Inicio extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Actualizacion a = new Actualizacion();
				a.setVisible(true);
				
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(259, 74, 124, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PREVIEW");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Visualizacion v = new Visualizacion();
				v.setVisible(true);

			}
		});
		btnNewButton_1.setBounds(27, 74, 124, 47);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				AlistarSoldados al = new AlistarSoldados();
				al.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(27, 165, 124, 47);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("UNSUBSCRIBE");
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Bajas b = new Bajas();
				b.setVisible(true);

			}
		});
		btnNewButton_3.setBounds(259, 165, 124, 47);
		panel.add(btnNewButton_3);
		
		JTextArea txtrVisualizar = new JTextArea();
		txtrVisualizar.setForeground(new Color(0, 255, 0));
		txtrVisualizar.setEditable(false);
		txtrVisualizar.setBackground(Color.LIGHT_GRAY);
		txtrVisualizar.setText("VISUALIZAR EJ.");
		txtrVisualizar.setBounds(27, 52, 124, 22);
		panel.add(txtrVisualizar);
		
		JTextArea txtrAadir = new JTextArea();
		txtrAadir.setForeground(Color.CYAN);
		txtrAadir.setEditable(false);
		txtrAadir.setBackground(Color.LIGHT_GRAY);
		txtrAadir.setText("A\u00D1ADIR SOLDADOS");
		txtrAadir.setBounds(27, 142, 124, 22);
		panel.add(txtrAadir);
		
		JTextArea txtrActualizar = new JTextArea();
		txtrActualizar.setForeground(Color.ORANGE);
		txtrActualizar.setEditable(false);
		txtrActualizar.setBackground(Color.LIGHT_GRAY);
		txtrActualizar.setText("ACTUALIZAR DATOS");
		txtrActualizar.setBounds(259, 52, 132, 22);
		panel.add(txtrActualizar);
		
		JTextArea txtrDarDeBaja = new JTextArea();
		txtrDarDeBaja.setForeground(Color.RED);
		txtrDarDeBaja.setEditable(false);
		txtrDarDeBaja.setBackground(Color.LIGHT_GRAY);
		txtrDarDeBaja.setText("DAR DE BAJA");
		txtrDarDeBaja.setBounds(259, 142, 114, 22);
		panel.add(txtrDarDeBaja);
		
		JButton btnNewButton_4 = new JButton("SIGN OUT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Login l = new Login();
				l.setVisible(true);
				
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(156, 218, 96, 23);
		panel.add(btnNewButton_4);
		
		JTextArea txtrInicio = new JTextArea();
		txtrInicio.setForeground(new Color(46, 139, 87));
		txtrInicio.setEditable(false);
		txtrInicio.setFont(new Font("MS Gothic", Font.BOLD, 16));
		txtrInicio.setBackground(Color.LIGHT_GRAY);
		txtrInicio.setText("INICIO");
		txtrInicio.setBounds(173, 23, 63, 22);
		panel.add(txtrInicio);
	}
}
