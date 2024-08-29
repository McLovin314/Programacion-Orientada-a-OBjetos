// p38_AceptarEstudianteV2 - Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado.
//La Universidad How High SA es solo para hombres mayores de 21 años con un promedio de entre 8 y 9.5.

import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre;
        char sexo;
        int edad;
        double c1, c2, c3, prom;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Universidad How High S.A DE C.V\nSistema de Admision\n");
        System.out.print("Dame tu nombre: ");
        nombre = obj.nextLine();

        System.out.print("Introduce tu sexo:\n[H]ombre\n[M]ujer\n");
        sexo = Character.toUpperCase( obj.next().charAt(0) );
        switch (sexo) {
            case 'H': System.out.print("Introduce tu edad..."); break;
            case 'M': System.out.print("Lo sentimos la escuela solo admite a hombres...:"); edad = obj.nextInt();
            if (edad < 21) { System.out.println("Lo sentimos la escuela solo acepta a mayores de 21...");}
            else if(edad >= 21) 
                System.out.println("Dame la calificacion 1 ");
                c1 = obj.nextFloat();
                System.out.println("Dame la calificacion 2 ");
                c2 = obj.nextFloat();
                System.out.println("Dame la calificacion 3 ");
                c3 = obj.nextFloat();
                prom = ((c1 + c2 + c3)/3);
                if (prom >= 8){ System.out.println("¡Felicidades " + nombre + " has sido aceptado para la universidad con tu promedio de "+ prom + "!" );}
                else if (prom < 8) {System.out.println("Lo sentimos no tienes el promedio necesario");      
                }
                break; }
            }
        }