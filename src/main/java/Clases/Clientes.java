/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 50683
 */
public class Clientes extends Persona{
    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Clientes() {
    }

    public Clientes(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Clientes(int codigoCliente, String nombre, String apellido, String direccion, String telefono, String id) {
        super(nombre, apellido, direccion, telefono, id);
        this.codigoCliente = codigoCliente;
    }
    
    
}
