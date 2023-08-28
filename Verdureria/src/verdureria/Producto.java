/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verdureria;

/**
 *
 * @author F776
 */
public class Producto {
    private int precio;
    private String codigo, subcategoria, descripcion, unidadKilos;

    public Producto(int precio, String codigo, String subcategoria, String descripcion, String unidadKilos) {
        if (Validacion.validacionPrecio(precio)) {
            this.precio = precio;
        }
        if (Validacion.validacionCodigo(codigo)) {
            this.codigo = codigo;
        }
        if (Validacion.validacionSubcategoria(subcategoria)) {
            this.subcategoria = subcategoria;
        }
        this.descripcion = descripcion;
        this.unidadKilos = unidadKilos;
    }

    public Producto() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (Validacion.validacionPrecio(precio)) {
            this.precio = precio;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (Validacion.validacionCodigo(codigo)) {
            this.codigo = codigo;
        }
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        if (Validacion.validacionSubcategoria(subcategoria)) {
            this.subcategoria = subcategoria;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadKilos() {
        return unidadKilos;
    }

    public void setUnidadKilos(String unidadKilos) {
        this.unidadKilos = unidadKilos;
    }
    
    

    
    
    
}
