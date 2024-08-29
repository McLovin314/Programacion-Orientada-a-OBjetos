//p35_ContinentesMundo - Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre:
// 1 Asia, 2 África, 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa.

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        int n1;
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Dame el numero de tu continente, recuerda que solo hay 6 continentes...");

        System.out.print("Elije:");
        n1 = new Scanner(System.in).nextInt();
        switch (n1) {
                case 1: System.out.println("El continentes numero 1 es Asia"); break;
                case 2: System.out.println("El continentes numero 2 es África"); break;
                case 3: System.out.println("El continentes numero 3 es América del Norte"); break;
                case 4: System.out.println("El continentes numero 4 es América del Sur"); break;
                case 5: System.out.println("El continentes numero 5 es Antártida"); break;
                case 6: System.out.println("El continentes numero 6 es Europa"); break;
            default: System.out.println("El continente solicitado no existe"); break;
        }
        
    }
}