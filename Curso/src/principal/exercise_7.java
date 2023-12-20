package principal;

import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }

        System.out.println("un valor de 4 valores");
        int a1 = 4324;
        int a2 = a1/1000;
        int a3 = a1%1000;
        int a31 = a3/100;
        int a4 = a31%100;
        int a41 = a4/10;
        int a5 = a41%1;

        String invertido = String.valueOf(a2) + String.valueOf(a31) + String.valueOf(a41) + String.valueOf(a5);
        System.out.println("Su numero invertido es"+ invertido);
    }
}
