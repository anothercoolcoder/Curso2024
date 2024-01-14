package principal;

import java.util.Scanner;

public class taller110 {
    
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPerfecto(int numero) {
        int suma = 1;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                suma += i;
                if (i != numero / i) {
                    suma += numero / i;
                }
            }
        }
        return suma == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int pares = 0, impares = 0, primos = 0, perfectos = 0;

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (esPrimo(i)) {
                primos++;
            }

            if (esPerfecto(i)) {
                perfectos++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
        System.out.println("Números primos: " + primos);
        System.out.println("Números perfectos: " + perfectos);

        scanner.close();
    }
}
