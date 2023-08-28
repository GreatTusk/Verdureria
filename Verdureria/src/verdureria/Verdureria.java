/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verdureria;

/**
 *
 * @author F776
 */
public class Verdureria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto zanahoria = new Producto(890, "1000", "Verdura", "Zanahoria", "1000 gramos");
        Producto pepino = new Producto(579, "1110", "Verdura", "Pepino", "1 unidad");

        Solicitud solicitud = new Solicitud(1, 0, "16/12/2019", "cliente1", "");
        
        solicitud.agregarProducto(zanahoria);
        solicitud.agregarProducto(pepino);
        solicitud.descuentoTotal();
        // Mostrar el detalle de la solicitud
        System.out.println("Detalle de la Solicitud:");
        System.out.println("Número: " + solicitud.getNumero());
        System.out.println("Cliente: " + solicitud.getCliente());
        System.out.println("Fecha: " + solicitud.getFecha());
        System.out.println("Total: $" + solicitud.getTotal());
        System.out.println("Productos:");
        for (Producto producto : solicitud.getProductosList()) {
            System.out.println(producto.getDescripcion() + " - $" + producto.getPrecio());
        }

    }
    
}
