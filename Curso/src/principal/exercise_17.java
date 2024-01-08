package principal;

import java.util.Scanner;

public class exercise_17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            if (edad >= 18 && edad <= 20) {
                System.out.println("Puede tomar una cerveza");
            } else {
                System.out.println("No puede tomar una cerveza");
            }
        }
    }
}
