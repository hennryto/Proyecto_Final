
package Clases;

import java.awt.List;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Carrito {
    private int id;
    private String descripion;
     private int cantidad;
     private int precio;
     private int iva;
     private int envio;
      private int total;    
     private ArrayList<Productos> carrito;
     private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getEnvio() {
        return envio;
    }

    public void setEnvio(int envio) {
        this.envio = envio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Productos> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Productos> carrito) {
        this.carrito = carrito;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Carrito() {
    }

    public Carrito(int id, String descripion, int cantidad, int precio, int iva, int envio, int total, ArrayList<Productos> carrito, Date fecha) {
        this.id = id;
        this.descripion = descripion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
        this.envio = envio;
        this.total = total;
        this.carrito = carrito;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", descripion=" + descripion + ", cantidad=" + cantidad + ", precio=" + precio + ", iva=" + iva + ", envio=" + envio + ", total=" + total + ", carrito=" + carrito + ", fecha=" + fecha + '}';
    }

    public Carrito(String descripion) {
        this.descripion = descripion;
    }

    public void setDescripcion(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



     
     
     
}

