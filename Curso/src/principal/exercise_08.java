package principal;

import java.util.Scanner;

public class exercise_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Dame un monto en pesos, para pasarlo a dolares, euros y bolivares: ");

            double pesos = sc.nextFloat();
            double dolar = pesos/2500;
            double euro = pesos/3000;
            double bolivar = pesos*0.52;

            System.out.println(dolar);
            System.out.println(euro);
            System.out.println(bolivar);
        }

    }
}
