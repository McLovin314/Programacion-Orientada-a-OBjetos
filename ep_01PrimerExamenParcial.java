//Primer Examen Parcial - Datos a solicitar: Nombre, Edad, Sexo, Tipo de Participante (Alumno, Docente, Trabajador)
// Costos de inscripcion: Alumno - 40, Docente - 60, Trabajador - 80
//Solo se aceptan a los mayores de 23 años
//< 50 – El evento concluye con ganancias BAJAS, > 50 y < 1000 – El evento concluye con ganancias MODERADAS, > 1000 – El evento concluye con BUENAS ganancias.

import java.util.Scanner;

public class ep_01PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        char sexo, participante;
        int edad;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Universidad How High S.A DE C.V\nEspecialistas en Programacion Avanzada\nControl de Inscripciones");
        System.out.print("Dame tu nombre: ");
        nombre = obj.nextLine();

        System.out.print("Introduce tu sexo:\n[H]ombre\n[M]ujer\n");
        sexo = Character.toUpperCase( obj.next().charAt(0) );

        System.out.print("Dame tu edad: ");
        edad = obj.nextInt();
        if (edad >= 23) {
            System.out.println("Felicidades, has sido aceptado en esta Universidad");
            
        } else {
        
            
        }
           
    
           


            
        
        
    
    
    }

            
        



       

     
        
    
}