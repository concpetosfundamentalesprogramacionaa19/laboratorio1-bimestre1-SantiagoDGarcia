package problema2;
import java.util.Scanner;
/**
 *
 * @author Sant Garcia
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String x , y , z;
        
        Scanner entrada = new Scanner(System.in);
        //entrada de valores para las variables
        System.out.println("Ingrese valor de x:");
        x = entrada.nextLine();
        System.out.println("Ingrese valor de y:");
        y = entrada.nextLine();
        System.out.println("Ingrese valor de z:");
        z = entrada.nextLine();
        
        //conversion de string a double 
        double x2 = Double.parseDouble(x);
        double y2 = Double.parseDouble(y);
        double z2 = Double.parseDouble(z);
        
        //calculo de m, mediante fórmula 
        double m = ((x2+(y2/z2))/(x2-(y2/z2)));
        
        System.out.printf("El valor de m, en base a las variables\nx = %.1f\n\t"
                + "y = %.1f\n\t\tz = %.1f\nda como resultado:\n\tm = %.2f",
                x2 , y2, z2, m);
        
        
        
        
        
    }
    
}
