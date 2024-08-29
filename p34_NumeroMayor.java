// p34_NumeroMayor - Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        float  n1, n2, n3, max;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Dame numero 1: "); n1 = obj.nextFloat();
        System.out.println("Dame numero 2: "); n2 = obj.nextFloat();  
        System.out.println("Dame numero 3: "); n3 = obj.nextFloat();

        max = Math.max( Math.max(n1, n2), n3 );

        System.out.printf("El numero mayor entre los tres es %.2f", max);
    }
}