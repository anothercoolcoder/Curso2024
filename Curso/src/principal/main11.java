package principal;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba dos valores de un rango: ");

        int rangoinf = sc.nextInt();
        int rangosup = sc.nextInt();
        System.err.println("pares con do");
        int nuevados = rangoinf;
        do {
            if (nuevados%2 == 0) {
                System.out.println("El numero es: " + nuevados);

            } 
                nuevados ++;
            }while (nuevados <= rangosup);
        
        
        System.err.println("pares con while");
        int nueva = rangoinf;
        while (nueva <= rangosup){
            if( nueva % 2 ==0){
                System.out.println("El numero es: "+ nueva );
            }

            nueva++;
        }
        System.err.println("pares con for");
        for (int num = rangoinf ; num <=  rangosup; num++){
            if (num %2 == 0) {
                System.out.println("El numero es: " +num);
            }
        }

    }
}