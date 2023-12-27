package principal;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class exercise_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Lado a");
            double a = sc.nextDouble();
            System.out.println("Lado b");
            double b = sc.nextDouble();
            System.out.println("Lado c");
            double c = sc.nextDouble();
            
            double p = (a+b+c)/2;

            System.out.println("El valor de p es: "+ p);

            double area = sqrt(p*((p-a)*(p-b)*(p-c)));
            System.out.println("El valor del area es:" + area);
        }
    }
}
