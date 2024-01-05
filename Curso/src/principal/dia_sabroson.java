package principal;

import java.util.Scanner;

public class dia_sabroson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ingresamos dos valores
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        // comprobamos cual valor es mayor
        if (num1>num2) {
            System.out.println("el primer valor es mayor al segundo");
        } else {
            System.out.println("el segundo valor es mayor");
        }
        // dividimo el numero entre 2, si el residuo es cero es par
        if (num1 % 2 == 0) {
            System.out.println(num1 + " es un número par");
        } else {
            System.out.println(num1 + " es un número impar");
        }
        // dividimo el numero entre 2, si el residuo es cero es par
if (num2 % 2 == 0) {System.out.println(num2 + " es un número par");} else {System.out.println(num2 + " es un número impar");}}}