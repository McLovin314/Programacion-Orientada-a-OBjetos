//p49_ParesDescendentes - Se desea imprimir los números pares desde 100 hasta el número que el usuario decida (n),

import java.util.Scanner;
public class p49_ParesDescendentes {
    public static void main(String[] args) {
        int c, n, s, con;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            con =0;
            c = 100;
            n = s = 0;
            System.out.println("Imprime pares de forma descendente de 100 hasta n\n");
            System.out.print("Hasta donde deseas los pares? ");
            n = obj.nextInt();
            while (c >= n){
                System.out.printf("%d ", c);
                con ++;
                s += c;
                c -= 2;
            }
            System.out.printf("\nLa suma de los pares hasta %d es %d, y su promedio es %d \n",n,s, s/con);

            System.out.printf("Deseas continuar (S/N)?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso Terminado");
    }
    
}
