package principal;

import java.util.Scanner;

public class pumpim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double ecuacion = (b*b)-(4*a*c);

        if (ecuacion > 0) {
            System.out.println("Dos soluciones");
            
        } else {
            System.out.println("Una solucion");
        }

    }
}
