package problema3;
import java.util.Scanner;
/**
 *
 * @author Sant Garcia
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nota1 , nota2 , nota3;// declaracion de variables
        
        //entrada de datos
        System.out.println("Ingrese la nota 1:");
        nota1 = entrada.nextLine();
        System.out.println("Ingrese la nota 2:");
        nota2 = entrada.nextLine();
        System.out.println("Ingrese la nota 3:");
        nota3 = entrada.nextLine();
        
        //convergencia de los datos String-Double
        double n12 = Double.parseDouble(nota1);
        double n22 = Double.parseDouble(nota2);
        double n32 = Double.parseDouble(nota3);
        
        //promedio de las notas
        double prom = (n12+n22+n32)/3;
        
        //resultado
        String resultado = prom>14 ? "Usted ha superado el año escolar" :
                "Usted NO ha superado el año escolar";
        
        System.out.printf("%s\n", resultado);
    }
    
}
