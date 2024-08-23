//p26_TipoAngulo - Muestra el tipo de angulo según los grados • < 90 agudo, 90 recto, > 90 y < 180 obtuso, 180 llano, 180 y < 360 concavo

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nDame un angulo entre 0  y 360 grados, y te dire su tipo: ");
        int angulo = new Scanner(System.in).nextInt();

        if ( angulo<0 || angulo>360) 
            System.out.println("De cual fumaste..."); 
            
        else {
            System.out.print("El tipo de angulo es: ");
            if(angulo<90) System.out.println("\nAgudo");
            if(angulo==90) System.out.println("\nRecto");
            if(angulo>90 && angulo<180) System.out.println("\nObtuso");
            if(angulo==180) System.out.println("\nLlano");
            if(angulo>180 && angulo<360) System.out.println("\nConcavo");
            if(angulo==360) System.out.println("\nCompleto");
        }

            
            
            
            
            
            
    


        
        
        
        
    }
    
}
