package principal;

import java.util.Scanner;

class prueba01 {

    void iniciarEncuesta() {
        Scanner sc = new Scanner(System.in);

        int hombres = 0;
        int mujeres = 0;
        int consumeComidaChatarra = 0;
        int noConsumeComidaChatarra = 0;
        int hamburguesa = 0;
        int pizza = 0;
        int picada = 0;
        int frutas = 0;
        int jugos = 0;
        int suplementos = 0;

        System.out.print("Ingrese la cantidad de personas a encuestar (N): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese su tipo de sexo (1-H/2-M): ");
            int sexo = sc.nextInt();
            if (sexo == 1) {
                hombres++;
            } else if (sexo == 2) {
                mujeres++;
            }

            System.out.print("Usted consume comida chatarra (1-si/2-no): ");
            int consumeChatarra = sc.nextInt();
            if (consumeChatarra == 1) {
                consumeComidaChatarra++;
                System.out.print("Que prefiere 1-Hamburguesa, 2-Pizza, 3-Picada: ");
                int opcionChatarra = sc.nextInt();
                if (opcionChatarra == 1) {
                    hamburguesa++;
                } else if (opcionChatarra == 2) {
                    pizza++;
                } else if (opcionChatarra == 3) {
                    picada++;
                }
            } else if (consumeChatarra == 2) {
                noConsumeComidaChatarra++;
                System.out.print("Que prefiere 1-Frutas, 2-Jugos, 3-Suplementos: ");
                int opcionNoChatarra = sc.nextInt();
                if (opcionNoChatarra == 1) {
                    frutas++;
                } else if (opcionNoChatarra == 2) {
                    jugos++;
                } else if (opcionNoChatarra == 3) {
                    suplementos++;
                }
            }
        }

        System.out.println("\nResultados de la Encuesta:");
        System.out.println("Cantidad de Hombres encuestados: " + hombres);
        System.out.println("Cantidad de Mujeres encuestadas: " + mujeres);
        System.out.println("Cantidad de personas que consumen comida chatarra: " + consumeComidaChatarra);
        System.out.println("Cantidad de personas que no consumen comida chatarra: " + noConsumeComidaChatarra);
        System.out.println("La comida chatarra que más consumen: " + getMasConsumida(hamburguesa, pizza, picada));
        System.out.println("Lo que menos gusta a quienes no consumen comida chatarra: " + getMenosGustado(frutas, jugos, suplementos));
    }

    String getMasConsumida(int hamburguesa, int pizza, int picada) {
        if (hamburguesa >= pizza && hamburguesa >= picada) {
            return "Hamburguesa";
        } else if (pizza >= hamburguesa && pizza >= picada) {
            return "Pizza";
        } else {
            return "Picada";
        }
    }

    String getMenosGustado(int frutas, int jugos, int suplementos) {
        if (frutas <= jugos && frutas <= suplementos) {
            return "Frutas";
        } else if (jugos <= frutas && jugos <= suplementos) {
            return "Jugos";
        } else {
            return "Suplementos";
        }
    }

    public static void main(String[] args) {
        prueba01 simulador = new prueba01();
        simulador.iniciarEncuesta();
    }
}
