//p31_NumerosRomanos - Dado un numero entre 1 a 10, muestra sus valores en números romanos

import java.util.Scanner;


public class p31_NumerosRomanos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un número entre 1 a 10 y te mostrare su equivalente en numeros romanos:  ");
        int num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1: System.out.println("1"); break;
            case 2: System.out.println("2"); break;
            case 3: System.out.println("3"); break;
            case 4: System.out.println("4"); break;
            case 5: System.out.println("5"); break;
            case 6: System.out.println("6"); break;
            case 7: System.out.println("7"); break;
            case 8: System.out.println("8"); break;
            case 9: System.out.println("9"); break;
            case 10: System.out.println("10"); break;
            default:
                System.out.println("Número invalido");
                break;
        }

    
    }
    
}
