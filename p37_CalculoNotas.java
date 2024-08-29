// p37_CalculoNotas - Se desea calcular el promedio de 5 calificaciones introducidas por el usuario,

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        Float cal1, cal2, cal3, cal4, cal5, prom;
        String prom1;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame la Primera calificacion:  "); cal1 = obj.nextFloat();
        System.out.print("Dame la Segunda calificacion:  "); cal2 = obj.nextFloat();        
        System.out.print("Dame la Tercera calificacion:  "); cal3 = obj.nextFloat();        
        System.out.print("Dame la Cuarta calificacion:  "); cal4 = obj.nextFloat();
        System.out.print("Dame la Quinta calificacion:  "); cal5 = obj.nextFloat();

        prom = ((cal1 + cal2 + cal3 + cal4 +cal5)/5);
        System.out.println("Tu promedio es de: "+ prom);

        if( prom >0 && prom <= 6 ) {
            System.out.println("Quedas reprobado");}
        else if( prom >6 && prom <=7 ) {
                System.out.println("Pasas de panzazo");}
        else if( prom >7 && prom <=8 ) {
                System.out.println("Muy bien, puedes mejorar");}
        else if( prom >8 && prom <=9 ) {
            System.out.println("Excelente sigue así");}
        else if( prom >9 && prom <=10 ) {
            System.out.println("Perfecto tu esfuerzo valió la pena");}
    }
    
}