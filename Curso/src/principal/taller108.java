package principal;

import java.util.Scanner;

public class taller108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int sumaDivisores = 0;
        int cantidadDivisores = 0;

        System.out.print("Divisores: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
                sumaDivisores += i;
                cantidadDivisores++;
            }
        }

        double promedioDivisores = (double) sumaDivisores / cantidadDivisores;

        System.out.println("\nCantidad de Divisores: " + cantidadDivisores);
        System.out.println("Promedio de la suma de los divisores: " + promedioDivisores);

        if (sumaDivisores - numero == numero) {
            System.out.println("Numero Perfecto: Si");
        } else {
            System.out.println("Numero Perfecto: No");
        }
    }
}
