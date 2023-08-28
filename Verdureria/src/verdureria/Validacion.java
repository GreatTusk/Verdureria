/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verdureria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author F776
 */
public class Validacion {
    
    public static boolean validacionPrecio(int precio) {
        return precio > 0;
    }
    
    public static boolean validacionCodigo(String codigo) {
        return codigo.length() == 4;
    }
    
    public static boolean validacionSubcategoria(String subcategoria) {
        return subcategoria.equalsIgnoreCase("Verdura") || subcategoria.equalsIgnoreCase("Fruta");
    }
    
    public static boolean validacionFono(int telefono) {
        return telefono<100000000;
    }
    
    public static boolean validacionMail(String mail) {
        return mail.length()>=6;
    }
    
    public static boolean validacionRut(int rut, int dv) {
        int suma = 0;
        int multiplicador = 1;
        
        String rutStr = String.valueOf(rut);
        String dvStr = String.valueOf(dv);
        
        String rutCompletoStr = rutStr + dvStr;
        
        for (int i = rutCompletoStr.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(rutCompletoStr.charAt(i));
            suma += digito * multiplicador;
            multiplicador = (multiplicador + 1) % 7 == 0 ? 2 : multiplicador + 1;
        }
        
        int digitoVerificadorEsperado = 11 - suma % 11;
        String digitoVerificadorCalculado;
        
        switch (digitoVerificadorEsperado) {
            case 11:
                digitoVerificadorCalculado = "0";
                break;
            case 10:
                digitoVerificadorCalculado = "k";
                break;
            default:
                digitoVerificadorCalculado = String.valueOf(digitoVerificadorEsperado);
                break;
        }
        
        return dvStr.equalsIgnoreCase(digitoVerificadorCalculado);
    }

    public static boolean validacionFecha(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // No permite fechas inválidas (por ejemplo, 31/02/2023)
        
        try {
            Date date = sdf.parse(fecha);
            return true; // Si la fecha se pudo parsear correctamente, es válida
        } catch (ParseException e) {
            return false; // Si ocurrió una excepción, la fecha es inválida
        }
    }
    
}
