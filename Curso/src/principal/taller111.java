package principal;

import java.util.Scanner;

public class taller111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del rectángulo: ");
        int altura = scanner.nextInt();

        System.out.print("Ingrese el ancho del rectángulo: ");
        int ancho = scanner.nextInt();

        System.out.print("Ingrese el carácter para dibujar el rectángulo: ");
        char caracter = scanner.next().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

