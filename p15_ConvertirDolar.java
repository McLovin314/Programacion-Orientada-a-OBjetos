//p15_ConvertirDolar - Convertir pesos a dolar

import java.util.Scanner;

public class p15_ConvertirDolar {

    public static void main(String[] args) {
        double pesos, dolares;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nConvertir pesos a dolares:\n");
        System.out.print("Dame los pesos: ");
        pesos =  obj.nextDouble();

        dolares = (pesos / 18.77);

        System.out.println(String.format("\nLa cantidad de pesos: %.2f a dolares: %.2f\n" , pesos, dolares));

    }
}
    
