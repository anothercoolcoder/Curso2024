package principal;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class clasepapi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Clase");
        System.out.println("Valor a: ");
        double a = sc.nextDouble();
        System.out.println("Valor b: ");
        double b = sc.nextDouble();
        System.out.println("Valor c: ");
        double c = sc.nextDouble();

        double determinante = pow(b,2)-(4*a*c);
        System.out.println("El valor del determinante es" + determinante);

        if (determinante > 0) {
            double raiz_1 = (-b +sqrt (determinante))/(2*a);
            double raiz_2 = (-b -sqrt (determinante))/(2*a);
            System.out.println("Positivo"+raiz_1);
            System.out.println("Negativo"+raiz_2);
        
            
        } else if (determinante == 0 ) {
            double raiz_3 = -b /(2*a);
            System.out.println("El resultado es "+ raiz_3);

        }else{
            System.out.println("no es posible");
        }

    }
}
