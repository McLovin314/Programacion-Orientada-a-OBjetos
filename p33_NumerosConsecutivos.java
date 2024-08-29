//p33_NumerosConsecutivos - Dados 3 numeros verificar que sean consecutivos

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        int  n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Dame numero 1: "); n1 = obj.nextInt();
        System.out.println("Dame numero 2: "); n2 = obj.nextInt();  
        System.out.println("Dame numero 3: "); n3 = obj.nextInt();

        if ((n1 < n2) && (n2 < n3)) {
            System.out.println("Los numeros son consecutivos");
        }
        else 
        System.out.println("Los numeros NO son consecutivos");
    }
}