/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Services;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ProducInventoryService {

    public ProducInventoryService() {
    }

    public void agregarProducto(int productId, int cantidad) {
        try {
            Connection connection = Conexion.getConexion();
            PreparedStatement ps = connection.prepareStatement("insert into Inventario(product_id, cantidad) values (?,?)");
            ps.setInt(1, productId);
            ps.setInt(2, cantidad);

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void actualizarProductoInventario(int productId, int cantidad) {
        try {
            Connection connection = Conexion.getConexion();
            PreparedStatement ps = connection.prepareStatement("UPDATE inventario SET cantidad = ? WHERE product_id = ?");
            ps.setInt(1, cantidad);
            ps.setInt(2, productId);

            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public Map getProducts() {
        Map<Integer, Integer> product_map = new HashMap<>();
        try {
            Connection connection = Conexion.getConexion();
            PreparedStatement ps = connection.prepareStatement("Select product_id, cantidad from Inventario");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // retrieve and print the values for the current row
                product_map.put(rs.getInt("product_id"), rs.getInt("cantidad"));
            }
            return product_map;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return product_map;
        }
    }
}
