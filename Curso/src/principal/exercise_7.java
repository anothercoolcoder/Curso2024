package principal;

import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }

        System.out.println("un valor de 4 valores");
        int number = 4324;
        int dig1 = number/1000;
        int dig2 = (number%1000)/100;
        int dig3 = (number%100)/10;
        int dig4 = (number%10);

        String invertido = Integer.toString(dig4) + Integer.toString(dig3) + Integer.toString(dig2) + Integer.toString(dig1);

        System.out.println(invertido);
    }
}
