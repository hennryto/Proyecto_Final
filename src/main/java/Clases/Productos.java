/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 50683
 */
public class Productos {
    private int id;
    private String tipo;
    private String descripcion;
    private Double precio;
    private int inventario;
    private int cantidad;
    
    
     
    
       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public Productos() {
    }

    public Productos(int id, String tipo, String descripcion, Double precio, int inventario, int cantidad) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.inventario = inventario;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", tipo=" + tipo + ", descripcion=" + descripcion + ", precio=" + precio + ", inventario=" + inventario + ", cantidad=" + cantidad + '}';
    }


    }



    

