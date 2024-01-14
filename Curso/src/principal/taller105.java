package principal;

import java.util.Scanner;

public class taller105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese el primer número del intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el segundo número del intervalo: ");
        int fin = scanner.nextInt();

        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        System.out.println("Múltiplos de " + numero + " en el intervalo [" + inicio + ", " + fin + "]:");
        int cantidadMultiplos = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % numero == 0) {
                System.out.println(i);
                cantidadMultiplos++;
            }
        }

        System.out.println("Cantidad de múltiplos de " + numero + ": " + cantidadMultiplos);
    }
}
