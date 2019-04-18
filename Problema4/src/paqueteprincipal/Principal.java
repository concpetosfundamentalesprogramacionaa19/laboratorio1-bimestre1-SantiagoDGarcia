package paqueteprincipal;
import paquete1.*;//importación o traslado de datos de los paquetes
import paquete2.*;
import paquete3.*;
/**
 *
 * @author Sant Garcia
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
       String resultado = MiClase1.edad >14 ? "y mayor de edad" : 
               "y menor de edad"; //operacion lógica
       
       //transcripción de datos
       System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%s %s", 
                MiClase2.nombre, MiClase3.apellido, MiClase1.edad,resultado);
        
        
        
    }
    
}
