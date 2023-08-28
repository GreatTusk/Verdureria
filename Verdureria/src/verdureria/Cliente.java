/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verdureria;

/**
 *
 * @author F776
 */
public class Cliente {
    private int rut, dv, fono;
    private String direccion, mail, nombre;

    public Cliente(int rut, int dv, int fono, String direccion, String mail, String nombre) {
        if (Validacion.validacionRut(rut, dv)) {
            this.rut = rut;
            this.dv = dv;
        }
   
        if (Validacion.validacionFono(fono)) {
            this.fono = fono;
        }
        
        this.direccion = direccion;
        if (Validacion.validacionMail(mail)) {
            this.mail = mail;
        }
        this.nombre = nombre;
    }

    public Cliente() {
    }
    
    public void setRutDv(int rut, int dv) {
        if (Validacion.validacionRut(rut, dv)) {
            this.rut = rut;
            this.dv = dv;
        }
    }
    
    public int getRut() {
        return rut;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        if (Validacion.validacionFono(fono)) {
            this.fono = fono;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (Validacion.validacionMail(mail)) {
            this.mail = mail;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
