//p10_HipotenusaTriangulo - Sacar la hipotenusa de un triángulo

import java.util.Scanner;

public class p10_HipotenusaTriangulo {

        public static void main(String[] args) {
                double lado1, lado2, hipotenusa;
                Scanner obj = new Scanner(System.in);


                System.out.println("\nCalculando la hipotenusa de un triángulo:\n");
                System.out.print("Dame el lado 1: ");
                lado1 = obj.nextDouble();
                System.out.print("Dame el lado 2: ");
                lado2 = obj.nextDouble();

                hipotenusa = Math.sqrt(lado1 * lado1 + lado2 * lado2);

                System.out.print("\nPara un triángulo de lado 1: " + lado1 + " y un lado 2: " + lado2 + " su hipotenusa es de: " + hipotenusa);
                System.out.println(String.format("\nPara un triángulo de lado 1 %.2f y un lado 2 %.2f su hipotenusa es %.2f" , lado1, lado2, hipotenusa));

  

        }
}
        