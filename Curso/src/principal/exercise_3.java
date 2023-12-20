package principal;

import java.util.Scanner;

/*
Create a program to calculate the height of a cone knowing the volume and the radius of its base.
radius of its base.
Vcone = ( 1 / 3 ) * ( PI * r^2 * h )
Then, clearing the height "h" from the formula we would have that:
h = ( 3 * Vcono ) / ( PI * r^2 )
 */
public class exercise_3 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the value of the volume and the radius of the base of the triangle, in centimeters: ");

        final double PI = 3.141592653589793;
        double volume = sc.nextDouble();
        double radius = sc.nextDouble();

        double triangle_height = (volume * 3) / (PI * (radius*radius));

        System.out.println("The height of the triangle, is: " + triangle_height + " cm.");
    }

}
}
