//p24_PagaTrabajador - 

import java.util.Scanner;
public class p24_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas, extra = 0;
        float paga, impuesto, tasa, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        tasa = 0.02f;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Calcukando la paga de un trabajador, las horas extras se pagan el doble (>40)");
        System.out.println("Dame tu nombre: "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas: "); paga = obj.nextInt();
        System.out.println("Paga x Hora: "); paga = obj.nextFloat();

        if (horas > 40) {
            extra = horas - 40;
            pagabruta = 40 * paga + (extra * paga * 2);

            
        }
        else {
            pagabruta = horas * paga;
        }

        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.printf("El trabajador %s trabajo %d horas a una paga de %.2f pesos, a una tasa de %.2d");
        System.out.println("Paga Brtuta = "+ pagabruta);
        System.out.println("Impuesto = " + impuesto);
        System.out.println("Paga Neta = " + paganeta);

        System.out.println("\nFelicidades por llegar hasta aqui");

    }
    
}
