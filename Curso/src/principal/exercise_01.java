package principal;

import java.util.Scanner;
/* 
Create a program to calculate the volume of a cube knowing the length of its three sides (they do not have to be equal).
its three sides (they do not have to be equal).
*/
public class exercise_01 {
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter lengths: ");

            float L1 = sc.nextFloat();
            float L2 = sc.nextFloat();
            float L3 = sc.nextFloat();

            float vol = L1 * L2 * L3;

            System.out.println("The volume of the cube is: " + vol);
        }
    }
}
