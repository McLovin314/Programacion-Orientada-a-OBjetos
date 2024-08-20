//p12_ConvertirTemperatura - Convertir la temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class p12_ConvertirTemperatura {

    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nConvertir grados fahrenheit a celsius:\n");
        System.out.print("Dame los grados fahrenheit: ");
        fahrenheit = obj.nextDouble();

        celsius = (fahrenheit - 32) * (5.0/9.0);

        System.out.println(String.format("\nPara convefrtir unos grados fahrenheit: %.2f a grados celsius %.2f\n" , fahrenheit, celsius));




    }
}