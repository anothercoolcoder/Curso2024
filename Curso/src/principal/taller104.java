package principal;

import java.util.Scanner;

public class taller104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número del intervalo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número del intervalo: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Números pares en el intervalo [" + numero1 + ", " + numero2 + "]:");
        int sumaPares = 0;
        int cantidadPares = 0;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sumaPares += i;
                cantidadPares++;
            }
        }

        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Cantidad de números pares: " + cantidadPares);

        System.out.println("\nNúmeros impares en el intervalo [" + numero1 + ", " + numero2 + "]:");
        int sumaImpares = 0;
        int cantidadImpares = 0;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sumaImpares += i;
                cantidadImpares++;
            }
        }

        System.out.println("Suma de los impares: " + sumaImpares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        System.out.println("\nSuma total: " + (sumaPares + sumaImpares));
    }
}
