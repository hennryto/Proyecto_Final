/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 50683
 */
public class Productos {
    private String tipo;
    private String descripcion;
    private Double precio;
    private int inventario;
    private int cantidad;

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

    public Productos(String tipo, String descripcion, Double precio, int inventario) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Productos de la tienda" + "Tipo=" + tipo + ", Descripcion=" + descripcion + ", Precio=" + precio + ", Inventario=" + inventario + "";
    }
    
}
