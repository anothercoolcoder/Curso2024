package principal;

import java.util.Scanner;

public class taller103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = obtenerNumero(sc, 1);
        int numero2 = obtenerNumero(sc, numero1);
        int numero3 = obtenerNumero(sc, numero2);
        int numero4 = obtenerNumero(sc, numero3);
        int numero5 = obtenerNumero(sc, numero4);

        System.out.println("\nIntervalo [1-2]:");
        menuBuscar(sc, 1, 2);

        System.out.println("\nIntervalo [2-3]:");
        menuBuscar(sc, 2, 3);

        System.out.println("\nIntervalo [3-4]:");
        menuBuscar(sc, 3, 4);

        System.out.println("\nIntervalo [4-5]:");
        menuBuscar(sc, 4, 5);
    }

    private static int obtenerNumero(Scanner scanner, int numeroAnterior) {
        int numero;

        do {
            System.out.print("Ingrese un número mayor que " + numeroAnterior + ": ");
            numero = scanner.nextInt();

            if (numero <= numeroAnterior) {
                System.out.println("Error: El número debe ser mayor que " + numeroAnterior + ". Inténtelo de nuevo.");
            }

        } while (numero <= numeroAnterior);

        return numero;
    }

    private static void menuBuscar(Scanner scanner, int inicio, int fin) {
        System.out.println("1. Números pares");
        System.out.println("2. Números impares");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                buscarParesEnIntervalo(inicio, fin);
                break;
            case 2:
                buscarImparesEnIntervalo(inicio, fin);
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                menuBuscar(scanner, inicio, fin);
        }
    }

    private static void buscarParesEnIntervalo(int inicio, int fin) {
        System.out.println("Números pares en el intervalo [" + inicio + ", " + fin + "]:");
        int cantidadPares = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                cantidadPares++;
            }
        }

        System.out.println("Cantidad de números pares: " + cantidadPares);
    }

    private static void buscarImparesEnIntervalo(int inicio, int fin) {
        System.out.println("Números impares en el intervalo [" + inicio + ", " + fin + "]:");
        int cantidadImpares = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
