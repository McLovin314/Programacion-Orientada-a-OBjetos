//p29_Calculadora - Realiza operaciones matematicas basicas sobre dos numeros


import java.util.Scanner;


public class p29_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Efectuando operaciones matematicas basicas sobre 2 numeros ");
        System.out.print("Dame un numero 1 ? "); n1 = obj.nextFloat();
        System.out.print("Dame un numero 2 ? "); n2 = obj.nextFloat();
        System.out.print("Operaciones + - * / ^ ? "); op = obj.next().charAt(0);

        switch (op) {
            case '+':System.out.printf("n1 + n2 = %.2f", n1 + n2); break;
            case '-':System.out.printf("n1 - n2 = %.2f", n1 - n2);break;
            case '*':System.out.printf("n1 * n2 = %.2f", n1 * n2);break;
            case '/':System.out.printf("n1 / n2 = %.2f", n1 / n2);break;
            case '^':System.out.printf("n1 / n2 = %.2f", Math.pow(n1, n2));break;
            
            default:
            System.out.printf("\nOperación Inválida ...");

                break;
        }

    }
    
}