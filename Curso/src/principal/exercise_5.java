package principal;
/*
Create a program to calculate the grade point average of a student who has 5 grades (the grade ranges from 0.0 - 5.0).
has 5 grades (the grade ranges from 0.0 - 5.0). The result should be displayed to 2
decimal places.
 */
import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grades, to calculate the grade point average: ");        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float p3 = sc.nextFloat();
        float p4 = sc.nextFloat();
        float p5 = sc.nextFloat();

        float average = (p1 + p2 + p3 + p4 + p5)/3;
        System.out.println("The average of the grades, is: " + average);
        }
}
