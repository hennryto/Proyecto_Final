/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 50683
 */
import java.util.Date;
import java.util.ArrayList;

public class Historial {
    private int id;
    private Date fecha;
    private ArrayList<Carrito> carritos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }

    public Historial() {
    }

    public Historial(int id, Date fecha, ArrayList<Carrito> carritos) {
        this.id = id;
        this.fecha = fecha;
        this.carritos = carritos;
    }

    @Override
    public String toString() {
        return "Historial{" + "id=" + id + ", fecha=" + fecha + ", carritos=" + carritos + '}';
    }
        // Método para agregar un carrito al histórico de compras
    public void agregarCarrito(Carrito carrito) {
        carritos.add(carrito);
    }

    // Método para mostrar la lista de totales de compras realizadas
    public void mostrarTotalesCompras() {
        System.out.println("Histórico de compras:");
        for (Carrito carrito : carritos) {
            System.out.println("Fecha: " + carrito.getFecha() + ", Total: " + carrito.getTotal());
        }
    }

    // Método para mostrar el detalle de una compra específica
    public void mostrarDetalleCompra(int carritoId) {
        for (Carrito carrito : carritos) {
            if (carrito.getId() == carritoId) {
                System.out.println("Detalle de la compra con ID " + carritoId + ":");
                System.out.println("Fecha: " + carrito.getFecha());
                System.out.println("Descripción: " + carrito.getDescripcion());
                System.out.println("Cantidad: " + carrito.getCantidad());
                System.out.println("Precio unitario: " + carrito.getPrecio());
                System.out.println("IVA: " + carrito.getIva());
                System.out.println("Costo de envío: " + carrito.getEnvio());
                System.out.println("Total: " + carrito.getTotal());
                System.out.println("Productos en el carrito:");
                for (Productos producto : carrito.getCarrito()) {
//                    System.out.println("- " + producto.getDescripcion() + ", Cantidad: " + producto.getCantidad());
                }
                return;
            }
        }
        System.out.println("No se encontró una compra con ID " + carritoId);
    }
}
