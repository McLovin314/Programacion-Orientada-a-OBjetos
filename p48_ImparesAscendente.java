//p48_ImparesAscendente - imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n)

import java.util.Scanner;
public class p48_ImparesAscendente {
    public static void main(String[] args) {
        int n,c,s, con=0;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Imprime números impares ascendentes\n");
            System.out.print("Hasta donde ? "); n = obj.nextInt();
            c=1;
            s=0;c=( c%2==0 ? ++c : c);
            while( c<=n ) {
            System.out.printf("%d ",c);
            con ++;
            s = s + c;
            c += 2;
            }
            System.out.printf("\nLa suma de los impares hasta %d es %d, y su promedio es %d \n",n,s, s/con);
                System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
                } while( resp != 'N' );
                System.out.println("\nGracias por utilizar este programa !");

    }
}