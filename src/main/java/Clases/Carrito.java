
package Clases;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Carrito {
    int id;
    String descripion;
     int cantidad;
     double precio;
     double total;
     double importe;
     ArrayList<Productos> carrito;
     


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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public ArrayList<Productos> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Productos> carrito) {
        this.carrito = carrito;
    }

    public Carrito() {
    }

    public Carrito(int id, String descripion, int cantidad, double precio, double total, double importe, ArrayList<Productos> carrito) {
        this.id = id;
        this.descripion = descripion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.importe = importe;
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", descripion=" + descripion + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + ", importe=" + importe + ", carrito=" + carrito + '}';
    }
  
    
  

}
