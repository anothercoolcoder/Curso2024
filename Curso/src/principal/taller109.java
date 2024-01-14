package principal;

import java.util.Scanner;

public class taller109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero mayor que cero: ");
        int numero = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial + ".");
    }
}

