package principal;

import java.util.Scanner;

public class triangulo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double var1 = sc.nextDouble();
    double var2 = sc.nextDouble();
    double var3 = sc.nextDouble();

    if (var1 == var2 && var1 == var3) {
        System.out.println("Su triangulo es equilatero");
    } else if (var1 != var2 && var2 != var3 && var1 != var3) {
        System.out.println("Su triangulo es isoceles");
    } else {
        System.out.println("Su triangulo es escaleno");
    }
}
