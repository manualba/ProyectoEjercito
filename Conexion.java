package Proyecto;

import java.sql.*;

import javax.swing.*;

public class Conexion {
		
		static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		static String dbName = "programacion.ejercito";
		static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
		static String user = "root";
		static String pass = "manolo99";
		static String driver = "com.mysql.cj.jdbc.Driver";
	    
	    static Connection conexion;
	    static Statement consulta;
	    static ResultSet resultado;
	    
	    public static void Conectar(){
	    	try {
	           Class.forName(driver) ;
	           conexion = DriverManager.getConnection(url, user, pass);
	           System.out.println("Base de datos de: " + url);
	           consulta = conexion.createStatement();
	        }catch(Exception e){
	            JOptionPane.showMessageDialog(null, e.getMessage());
	            e.printStackTrace();
	        }
	    }
	    
	    public static ResultSet EjecutarSentencia(String Sentencia){
	        try {
	        	resultado = consulta.executeQuery(Sentencia);
	        }catch(Exception e){
	        	JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS ", " ���� WARNING !!!!", JOptionPane.WARNING_MESSAGE);
	        }
	        return resultado;
	    }
	      
	    public static void EjecutarUpdate(String Sentencia) throws SQLException{
	    	try{
	    		consulta.executeUpdate(Sentencia);
	    		System.out.println("Finalizada la conexion");
	    	}catch(SQLException e){
	    		
	    		throw new SQLException("");
	    	} 
	    }
	    
	    public static void CerrarConexion(){
	        try{
	        	consulta.close();
	        }catch(Exception e){}
	    }

		
	    

}
