// p77_DiaSemana - función que pida un número entero entre 1 y 7 y devuelva el día de la semana

import java.util.Scanner;

public class p77_DiaSemana {

    public static String DiaSemana(int dia) {
        switch (dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Dia invalido";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("Dame el numero del dia de la semana: ");
        dia = scanner.nextInt();

        String Dia = DiaSemana(dia);
        System.out.println("El dia es "+Dia);
    }

}