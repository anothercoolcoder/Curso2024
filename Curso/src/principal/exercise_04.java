package principal;

import java.util.Scanner;

/*
 Make a program that, given the ages of three people, calculates the average age.
 */

public class exercise_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the ages of 3 people, to calculate their average: ");
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();

            int average = (p1 + p2 + p3)/3;
            System.out.println("The average of the ages, is: " + average + ".");
        }
    }
}
