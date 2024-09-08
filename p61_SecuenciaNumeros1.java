//p61_SecuenciaNumeros1 - Imprimir la secuencia de numeros que el usuario desee

import java.util.Scanner;
public class p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
       
        int n, i, j;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿Cuantos renglones? "); n = new Scanner(System.in).nextInt();

        for (i = 1; i <=n; i++) {
            for (j = 1; j <=i; j++) 
                System.out.print(i + " ");

            System.out.println();
        }
        obj.close();
    }
    
}