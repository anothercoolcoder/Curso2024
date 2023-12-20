package principal;

import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una temperatura: ");   
        double celsius = sc.nextFloat();
        double faren = 1.8*celsius+32;
        System.out.println(faren+" farenhei");
    }
}
