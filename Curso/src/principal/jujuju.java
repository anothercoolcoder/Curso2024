package principal;

import java.util.Objects;
import java.util.Scanner;

public class jujuju {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una vocal: ");
        String letra = sc.nextLine();

        if (Objects.equals(letra, "a")||(Objects.equals(letra, "A"))) {
            System.out.println("Tu letra es a");
        }

        if (Objects.equals(letra, "e")||(Objects.equals(letra, "E"))) {
            System.out.println("Tu letra es e");
        }

        if (Objects.equals(letra, "i")||(Objects.equals(letra, "I"))) {
            System.out.println("Tu letra es i");
        }

        if (Objects.equals(letra, "o")||(Objects.equals(letra, "O"))) {
            System.out.println("Tu letra es o");
        }

        if (Objects.equals(letra, "u")||(Objects.equals(letra, "U"))) {
            System.out.println("Tu letra es u");
        }

    }
}
