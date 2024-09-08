//p64_SumaTerminos1 - imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;
public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nterm, nterms, i;
        double s = 0;
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        System.out.print("Cuántos términos? ");
        nterm = scanner.nextInt();
        
        StringBuilder secuencia = new StringBuilder();
        
        for (i = 1; i <= nterm; i++) {
            StringBuilder term = new StringBuilder();
            for (int j=0;j < i; j++) { 
                term.append("1");
            }
            nterms = Integer.parseInt(term.toString());
            s += nterms;
            if (i > 1) {
                secuencia.append("+");
            }
            secuencia.append(term.toString());
        }
        System.out.println(secuencia.toString());
        System.out.printf("Suma: %.3f\n", s);

    }
}