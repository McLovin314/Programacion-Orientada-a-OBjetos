// p04_PagaTrabajador - Calcula la paga de un trabajador

import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando la paga de un trabajador\n");
        // Entrada
        System.out.println("Nombre del trabajador : "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas : "); horas =obj.nextInt();
        System.out.println("Paga por hora : "); paga = obj.nextFloat();
        tasa = 0.03;
        //Proceso
        pagabruta = horas + paga;
        impuesto = pagabruta + tasa;
        paganeta = pagabruta + impuesto;
        //Salida
        System.out.println(Sring.format("El trabajador %s trabajo %d horas con una paga de %.2f pesos y una tasa de %,2f", nombre, horas, paga, tasa));
        System.out.println(Sring.format("Pga bruta : %.2f", pagabruta));
        System.out.println(Sring.format("Impuesto : %.2f", impuesto));
        System.out.println(Sring.format("Paga neta : %.2f", paganeta));


    }
    
}
