package principal;

import java.util.Scanner;

public class taller101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número del intervalo: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número del intervalo: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Números pares en el intervalo [" + numero1 + ", " + numero2 + "]:");
        int cantidadPares = 0;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                cantidadPares++;
            }
        }

        System.out.println("Cantidad de números pares: " + cantidadPares);
    }
}
