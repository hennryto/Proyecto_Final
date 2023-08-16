/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Clases.Conexion;
import Clases.Productos;
import Clases.Services.ProducInventoryService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DataProductos {
    public ArrayList<Productos> getProductos() {

        Connection connection = Conexion.getConexion();

        Statement stmt;
        ResultSet rs;
        ArrayList<Productos> listaProductos = new ArrayList<>();

        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Products order by descripcion");

            while (rs.next()) {
                Productos prod = new Productos();
                prod.setId(rs.getInt("id"));
                prod.setTipo(rs.getString("tipo"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecio(rs.getDouble("precio"));
                //TODO:
                //prod.setInventario(rs.getInt("inventario"));
//                prod.setCantidad(rs.getInt("cantidad"));
               
                listaProductos.add(prod);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProductos;
    }  
}
