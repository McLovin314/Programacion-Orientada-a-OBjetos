// p62_SecuenciaNumeros2 - imprimir la secuencia de números mostrados el número de renglones que el usuario desee

import java.util.Scanner;
public class p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
       
        int n, i, j;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿Cuantos renglones? "); n = new Scanner(System.in).nextInt();

        for (i = 1; i <=n; i++) {
            for (j = 1; j <=i; j++) 
                System.out.print(j + " ");

            System.out.println();
        }
        obj.close();
    }
    
}