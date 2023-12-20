package principal;

import java.util.Scanner;
/*
Create a program to calculate the area of a triangle knowing its base and height.
height.
 */
public class exercise_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Between the base and height of the triangle: ");

            float base  = sc.nextFloat();
            float height = sc.nextFloat();

            float area = (base * height) / 2;

            System.out.println("The area of the triangle is: " + area);
        }

    }
}
