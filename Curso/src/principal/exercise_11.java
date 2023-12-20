package principal;

import java.util.Scanner;

public class exercise_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe notas de tus parciales: ");

        double p1 = sc.nextFloat();
        double p2 = sc.nextFloat();
        double p3 = sc.nextFloat();
        double p4 = sc.nextFloat();
        double p5 = sc.nextFloat();

        double promedio = (p1+p2+p3+p4+p5)/5;

        System.out.println("Tu promedio es: " + promedio);
        
        System.out.println("Escribe la nota de tu exposicion: ");

        double exposicion = sc.nextFloat();
        System.out.println("Nota exposicion " + exposicion);

        System.out.println("Escribe la nota de tu taller: ");

        double taller = sc.nextFloat();
        System.out.println("Nota taller " + taller);

        double promedio_p = (60*promedio)/100;
        double exposicion_p = (25*exposicion)/100;
        double taller_p = (15*taller)/100;
        double nota_final = promedio_p+exposicion_p+taller_p;

        System.out.println("Esta es su nota " + nota_final);
    }
        
}
