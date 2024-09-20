// p78_MedidasLongitud -dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros apies

import java.util.Scanner;
public class p78_MedidasLongitud {
    public static float PaC(float in){
        return( in = in * 2.54f);
    }

    public static float MaP(float m){
        return( m = m * 3.28f);
    }

    public static void main(String[] args) {
        int op;
        Float in, m;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        do{
        System.out.println("Conversion de Longitudes");
        System.out.println("1. C a F\n2. F a C\n3. Salir");
        System.out.print("Elige  : "); op = obj.nextInt();

        switch (op) {
            case 1:
            System.out.println("Convertir de Pulgadas a Centimetros");
            System.out.print("¿Cuantas pulgadas? "); in = obj.nextFloat();
            System.out.print("Centimetros: "+ PaC(in)); break;

            case 2:
            System.out.println("Convertir de Metros a Pies");
            System.out.print("Dame los metros: "); m = obj.nextFloat();
            System.out.print("El resultado es: "+ MaP(m)); break;
            
            case 3:
            System.out.println("\nGracias por utilizar este programa"); break;
        
            default:break;
        }

            System.out.println("\n<Presiona cualquier tecla para continuar>");obj.nextLine();obj.nextLine();
        } while (op!=3);
        System.out.println("\nPrograma terminado");
    obj.close();
    }
    
    
}