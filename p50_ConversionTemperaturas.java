//p50_ConversionTemperaturas - Se desea calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores introducidos por el usuario

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int ini, fin, c;
        float Faren1=9, Faren2=5, Faren3=32;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Tabla de conversion de Celcius a Fahrenheit");
        do {       
            do {
            System.out.print("Dame inicio   :   "); ini = obj.nextInt();
            System.out.print("Dame fin      :   "); fin = obj.nextInt();
        } while (fin < ini);
        c = ini;
        System.out.println("Celcius \t\t Fahrenheit");
        System.out.println("============================================");
        while (c <= fin) {
            System.out.printf("%10d  =  %10.2f\n", c, (((c * Faren1)/Faren2)+Faren3));
            c++;
        }
        System.out.println("============================================");
        System.out.print("Deseas continuar (S/N)?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        
    }
}