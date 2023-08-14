/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 50683
 */
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Productos> productos;

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public Inventario() {
    }

    public Inventario(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Productos producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del inventario
    public void eliminarProducto(Productos producto) {
        productos.remove(producto);
    }

    // Método para obtener la cantidad total de productos en inventario
    public int obtenerCantidadTotal() {
        int cantidadTotal = 0;
        for (Productos producto : productos) {
            cantidadTotal += producto.getInventario();
        }
        return cantidadTotal;
    }

    // Método para obtener el valor total del inventario
    public double obtenerValorTotal() {
        double valorTotal = 0;
        for (Productos producto : productos) {
            valorTotal += producto.getInventario() * producto.getPrecio();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }
    
    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (Productos producto : productos) {
            System.out.println("ID: " + producto.getId());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Descripción: " + producto.getDescripcion());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Inventario: " + producto.getInventario());
            System.out.println("------------------------");
        }
    }
    
}