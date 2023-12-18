package principal;

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value in meters, it will be converted to centimeters, kilometers, inches and feet: ");
        double value = sc.nextFloat();
        double cm = value * 100;
        double km = value / 1000;
        double inches = value * 39.37;
        double feet = value * 3.28; 
        
        System.out.println(cm + " Cm");
        System.out.println(km + " Km");
        System.out.println(inches + " Inch");
        System.out.println(feet + " Pies"); 
    }
}
