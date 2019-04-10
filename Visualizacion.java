package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;

public class Visualizacion extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Visualizacion() {
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
		
		JTextArea txtrVisualizacionDelListado = new JTextArea();
		txtrVisualizacionDelListado.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		txtrVisualizacionDelListado.setEditable(false);
		txtrVisualizacionDelListado.setBackground(Color.LIGHT_GRAY);
		txtrVisualizacionDelListado.setForeground(new Color(0, 128, 0));
		txtrVisualizacionDelListado.setText("VISUALIZACION DEL LISTADO DE TROPAS");
		txtrVisualizacionDelListado.setBounds(64, 11, 298, 28);
		panel.add(txtrVisualizacionDelListado);
		
		JTabbedPane tablaSoldados = new JTabbedPane(JTabbedPane.TOP);
		tablaSoldados.setBounds(64, 53, 298, 141);
		panel.add(tablaSoldados);
		
		/*CORREGIR
		 * try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Conexion c = (Conexion) DriverManager.getConnection("jdbc:mysql://localhost:3306/programacion.ejercito", "root", "manolo99");
		a st = a c.EjecutarSentencia();
		ResultSet rs = c.EjecutarSentencia("SELECT * FROM listado_soldados")
		

		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "" + e.getMessage());
		}
		*/
	}
}
