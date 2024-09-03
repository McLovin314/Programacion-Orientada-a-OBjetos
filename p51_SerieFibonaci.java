//p51_SerieFibonaci - Se desean imprimir los primeros n números de la será de Fibonacci. El proceso debe de poder repetirse hasta que el usuario lo decida.

import java.util.Scanner;

public class p51_SerieFibonaci {

    public static void main(String[] args) {

        int MAX = 0;
        int N1 = 0;
		int N2 = 1;
        int fibonacci = '\0';
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime los numeros de la serie Fibonaci \n");
        System.out.print("Dame un numero entero  : "); MAX = new Scanner (System.in).nextInt();

        for (int i = 2; i < MAX; i++) {

			fibonacci = N1 + N2;
			System.out.print(fibonacci + " ");

			N1 = N2;
			N2 = fibonacci;
		}

    }
    
}