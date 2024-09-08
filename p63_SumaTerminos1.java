//p63_SumaTerminos1 - imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;
public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int term, i;
        double s = 0;
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        System.out.print("Cuántos términos? ");
        term = scanner.nextInt();
        
        StringBuilder secuencia = new StringBuilder();
        
        for (i = 1; i <= term; i++) {
            if (i > 1) {
                secuencia.append("+");
            }
            if (i == 1) {
                secuencia.append("1");
            } else {
                secuencia.append("1/").append(i);
            }
            s += 1.0 / i;
        }
        
       
        System.out.println(secuencia.toString());
        
        
        System.out.printf("Suma: %.3f\n", s);

    }
}
