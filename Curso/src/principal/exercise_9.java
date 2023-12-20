package principal;

import java.util.Scanner;

public class exercise_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese el valor de las 3 personas: ");
        double p1 = sc.nextFloat();
        double p2 = sc.nextFloat();
        double p3 = sc.nextFloat();

        double total = (p1+p2+p3);
        double pp1 = (p1*100)/total;
        double pp2 = (p2*100)/total;
        double pp3 = (p3*100)/total;
        System.out.println(pp1+ "%");
        System.out.println(pp2+ "%");
        System.out.println(pp3+ "%");
    }
}
