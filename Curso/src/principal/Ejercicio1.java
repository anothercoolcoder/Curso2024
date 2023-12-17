package principal;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las longitudes: ");

        float L1 = sc.nextFloat();
        float L2 = sc.nextFloat();
        float L3 = sc.nextFloat();

        float vol = L1 * L2 * L3;

        System.out.println("El volumen del cubo es: " + vol);
    }
}
