//p07_OperadoresAsignacion - Efecetua operaciones usando los diferentes operadores de asignacion

import java.util.Scanner;

public class p07_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); //Comando para borrar pantalla de la consola

        System.out.print("Dame un numero: ");
        float num = new Scanner(System.in).nextInt();

        System.out.printf("El numero original  :  %.2f \n",num);
        System.out.printf("incrementar en 1    :  %.2f \n", ++num);
        System.out.printf("Sumar  80             :  %.2f \n", num += 80);
        System.out.printf("Resta  35             :  %.2f \n", num -= 35);
        System.out.printf("Multiplicar x15       :  %.2f \n", num *= 15);
        System.out.printf("Dvision entre 4       :  %.2f \n", num /= 4);
        System.out.printf("Decrementar en 1      :  %.2f \n", --num);
            
        



        
    }
    
}
