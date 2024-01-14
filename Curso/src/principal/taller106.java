package principal;

import java.util.Scanner;

public class taller106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero mayor que 1: ");
        int numero = scanner.nextInt();

        boolean esPrimo = verificarPrimo(numero);

        if (esPrimo) {
            System.out.println("El número ingresado es un número PRIMO");
        } else {
            System.out.println("El número ingresado no es un número PRIMO");
        }
    }

    private static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

