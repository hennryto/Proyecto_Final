
package com.mycompany.proyecto_final;


import Clases.Conexion;
import Display.JLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;









public class Proyecto_Final {

    public static void main(String[] args) throws SQLException {  
        Conexion conexion = new Conexion();
        conexion.getConexion(); // Establece la conexión
        
        
       
        if (conexion.getConexion() != null) {
            JLogin loginFrame = new JLogin();
            loginFrame.setVisible(true);
            // Realiza tus operaciones con la base de datos aquí.
            // Por ejemplo:
            // ResultSet resultSet = conexion.getConexion().createStatement().executeQuery("SELECT * FROM tbl.Usuario");
            // int rowsAffected = conexion.getConexion().createStatement().executeUpdate("UPDATE tabla SET columna = 'valor' WHERE condicion");
            // resultSet.close();
        }

        // Cuando hayas terminado, asegúrate de cerrar la conexión
        //conexion.getDisconnected();
    }
        
    
             
}
