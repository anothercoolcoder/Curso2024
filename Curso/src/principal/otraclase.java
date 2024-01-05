package principal;

import java.util.Random;
import java.util.Scanner;

public class otraclase {
    public static void main(String[] args) {
       Random random = new Random();

       int var1 = 1 + random.nextInt(10);
       int var2 = 1 + random.nextInt(10);

       int suma = var1 + var2;
       Scanner sc = new Scanner(System.in);
       System.out.println("Intente adivinar la suma de dos numeros aleatorios: ");

       int varusu = sc.nextInt();

       if (varusu == suma) {
        System.out.println("Has acertado, el numero era: "+ suma);
       } else {
        System.out.println("Te equivocaste, el numero era: " +suma);
       }
    }
}
