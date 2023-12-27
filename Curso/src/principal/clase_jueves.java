package principal;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class clase_jueves {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Mostramos por pantalla, un aviso para ingresar los valores    
            System.out.println("Añada valores: ");
            // Ingresamos los valores de las variables 
            System.out.println("Añada a: ");
            double a = sc.nextDouble();
            System.out.println("Añada b: ");
            double b = sc.nextDouble();
            System.out.println("Añada c: ");
            double c = sc.nextDouble();
            // Dividimos el ejercicio en numeradores y denominadores
            double numerador_1 = sqrt(pow(b, 2)*(pow(a, 2)+pow(b, 2))-a);
            
            double denominador_1 = pow(a, 2)*(b-pow(c, 2))+c;

            double numerador_2 = pow(b, 2)-2*b*a+pow(a, 2);

            double denominador_2 = pow(c, 2)-2*c*a+pow(a, 2);
            // Agrupamos el ejercicio, en dos partes
            double ecuacion_1 = numerador_1/denominador_1;
            double ecuacion_2 = numerador_2/denominador_2;
            // Restamos la ecuacion 1 con la ecuacion 2
            double solucion = ecuacion_1 - ecuacion_2;
            // Mostramos por pantalla, el resultado
            System.out.println("El resultado de su operacion es: " + solucion);
        }
    }
}
