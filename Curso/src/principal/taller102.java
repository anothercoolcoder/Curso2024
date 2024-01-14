package principal;

import java.util.Scanner;

public class taller102 {
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

        System.out.println("Números impares en el intervalo [" + numero1 + ", " + numero2 + "]:");
        int cantidadImpares = 0;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
