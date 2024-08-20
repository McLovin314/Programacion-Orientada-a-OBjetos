//p11_CalcularAngulo - Calcular el tercer angulo de un triángulo en base a otros dos angulos

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el area del tercer angulo de un triángulo:\n");
        System.out.print("Dame el angulo 1: ");
        angulo1 = obj.nextDouble();
        System.out.print("Dame el angulo 2: ");
        angulo2 = obj.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("\nPara un triángulo de angulo 1: %.2f y un angulo 2: %.2f su angulo 3: es %.2f\n" , angulo1, angulo2, angulo3));


    }

    
}