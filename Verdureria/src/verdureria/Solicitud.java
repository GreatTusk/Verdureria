/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verdureria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author F776
 */
public class Solicitud {
    private int numero, total;
    private String fecha, cliente, productos;
    private List<Producto> productosList; // Agregar esta lista 
    
    public Solicitud(int numero, int total, String fecha, String cliente, String productos) {
        this.numero = numero;
        this.total = total;
        if (Validacion.validacionFecha(fecha)) {
            this.fecha = fecha;
        }
        this.cliente = cliente;
        this.productos = productos;
        this.productosList = new ArrayList<>();
    }

    public Solicitud() {
    }

    public List<Producto> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Producto> productosList) {
        this.productosList = productosList;
    }
    
  
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (Validacion.validacionFecha(fecha)) {
            this.fecha = fecha;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    public void descuentoTotal() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el descuento a aplicar (%): ");
    int descuento = scanner.nextInt();
    this.total = this.total * (1 - (descuento / 100));
    }


    
   

    

    // Método para agregar productos a la lista
    public void agregarProducto(Producto producto) {
        productosList.add(producto);
        recalcularTotal(); // Actualiza el total cuando se agrega un producto
    }

    // Método para recalcular el total de la solicitud
    private void recalcularTotal() {
        int nuevoTotal = 0;
        for (Producto producto : productosList) {
            nuevoTotal += producto.getPrecio();
        }
        this.total = nuevoTotal;
    }
    
    
}
