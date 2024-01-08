package principal;

import java.util.Scanner;

public class exercise_00 {
    public static void main(String[] args) {
        
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();

        System.out.println("Hola " +name+ ", ¿como estas?");
      }
    }

}
