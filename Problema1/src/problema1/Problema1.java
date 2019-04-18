package problema1;
import java.util.Scanner;
/**
 *
 * @author Sant Garcia
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);// se usa para pedir la entrada
                                                // de datos
       
        System.out.println("Ingrese las horas que trabajo el empleado:");
        int horas = entrada.nextInt();//horas
        System.out.println("Ingrese el costo de hora de trabajo:");
        double costoh = entrada.nextDouble();//costo de cada hora
        
        double pago = horas*costoh;        
        double descuento = pago * 0.10;//descuento seguro social
        double pagofin = pago - descuento;
        
        
        System.out.printf("El valor mensual a pagar es: %s\nEl valor de "
                + "descuento del seguro es: %s\n"
                + "El sueldo menusal del empleado es: %s", pago, descuento,
                pagofin);
        
        
    }
    
}
