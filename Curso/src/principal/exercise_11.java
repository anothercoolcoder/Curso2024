package principal;

import java.util.Scanner;

public class exercise_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del perimetro del circulo: ");
            double perimetro = sc.nextDouble();
            final double pi = 3.14;
            double diametro = perimetro/pi;
            double radio = diametro/2;
            double area = pi * (radio*radio);
            System.out.println("Esta es la area del circulo "+ area);
        }
    }
}
