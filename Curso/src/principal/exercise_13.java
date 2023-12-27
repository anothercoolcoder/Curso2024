package principal;

import java.util.Scanner;

public class exercise_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingrese el valor del sueldo base: ");
            double base = sc.nextFloat();
            System.out.println("ingrese el total de ventas");
            double ventas = sc.nextFloat();
            double venta_porcentaje = (20*base)/100;
            double ventas_final= ventas*venta_porcentaje;
            double sueldo = base + ventas_final;
            System.out.println("Su sueldo final es: "+ sueldo);
        }
    
    }
}
