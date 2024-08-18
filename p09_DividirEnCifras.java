//p09_DividirEnCifras - Divide un numero de tres cifras en unidades, decenas y centenas

import java.util.Scanner;

public class p09_DividirEnCifras {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num, unidades, decenas, centenas;

        System.out.print("Dame un numero entero de 3 cifras: ");

        num = new Scanner(System.in).nextInt();

        centenas = num / 100;
        decenas = (num - centenas * 100) / 10;
        unidades = (num - (centenas * 100 + decenas * 10) );

        System.out.print("El numero introducido fue: " + num);
        System.out.print("Centenas: " + centenas);
        System.out.print("Decenas: " + decenas);
        System.out.print("Unidades: " + unidades);

    }

    
}

