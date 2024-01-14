package principal;

import java.util.Scanner;

public class taller107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese la potencia máxima: ");
        int exponenteMaximo = scanner.nextInt();

        for (int i = 0; i <= exponenteMaximo; i++) {
            int resultado = (int) Math.pow(base, i);
            System.out.print(resultado + " ");
        }
    }
}
