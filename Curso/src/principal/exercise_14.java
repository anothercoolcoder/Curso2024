package principal;

import java.util.Scanner;

public class exercise_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Presupuesto: ");
        double Presupuesto = sc.nextFloat();
        double gine = (40 * Presupuesto)/100;
        double pedi = (35 * Presupuesto)/100;
        double trauma = (25 *Presupuesto)/100;

        System.out.println(pedi);
        System.out.println(gine);
        System.out.println(trauma);
    }
}
