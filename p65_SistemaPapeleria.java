//p65_Sistema de papeleria 
//Carta $3, Oficio $4, Doble Oficio $6
//venta menor 50 pesos - “venta moderada”
//venta entre 50 y 100 pesos - “venta frecuente
//venta mayor a 101 - “venta superada”


import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        char Tamaño, resp;
        int cantidad,venta, preciototal, carta, oficio, doble, cantcarta, cantoficio, cantdoble, fin, fin2;
        Scanner obj = new Scanner(System.in);
        venta=1; //Las ventas se inician en 1 para ir en aumento en caso de seguir con las ventas
        cantidad = preciototal = carta = oficio = doble = cantcarta = cantoficio = fin = fin2 = cantdoble = 0; //Todas las variables se inician en cero
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("-------------------------------------");
        System.out.println("Papelería -Pepé Papeles-, SA. de CV.");
        System.out.println("Sistema de ventas");
        System.out.println("-------------------------------------");
        
        
        do { //En este ciclo se realizan los procesos de ventas y finaliza hasta que se indica
        System.out.println("\nVenta: " + venta++);

        System.out.println("Tipo de Copia:  ");
        System.out.println("[C]arta    -  $3");
        System.out.println("[O]ficio   -  $4 ");
        System.out.println("[D]oble    -  $6 ");
        System.out.print("Elije:");
        Tamaño = Character.toUpperCase( obj.next().charAt(0) );
        System.out.print("cuantas copias vas a querer ??: "); cantidad = new Scanner(System.in).nextInt();
            
        System.out.print("Deseas continuar (S/N)?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        switch (Tamaño) { //En la variable tamaño se guardan los tipos de copiado y sus caracteristicas
            case 'C': cantcarta = cantidad;
                preciototal = (cantcarta  * 3 );
                carta = preciototal;
             break;
            case 'O': cantoficio = cantidad;
                preciototal= ( cantoficio  * 4); 
                oficio = preciototal;
            break;   
            case 'D': cantdoble = cantidad;
                preciototal = (cantdoble  * 6);
                doble = preciototal;
            break;
            default: break;}

    
        } while (resp != 'N'); //Indica que al dar N como respuesta, se termina el ciclo
        System.out.println("\n===========================================");
        System.out.println("Resumen diario de ventas ");
        System.out.println("\n===========================================");
        System.out.println("\nVentas realizadas : "+ (venta - 1));


        System.out.println("============================================="); 
        System.out.printf ("\ncarta        :%d - $%d",cantcarta, carta );
        System.out.printf ("\noficio       :%d - $%d",cantoficio, oficio );
        System.out.printf ("\ndoble        :%d - $%d",cantdoble, doble );
        System.out.println("\n=============================================");


        fin = carta + oficio + doble; //Aqui se almacenan las sumas de la cantidad de tipo de copias y la suma del precio
        fin2 = cantcarta+cantoficio+cantdoble;

        System.out.printf("total ventas :%d - $%d",fin2,fin);

        if (fin < 50) { //Condiciones para los conteos finales de rentas
            System.out.println("\nVenta moderada");
        } else if (fin >= 50 && fin <= 100) {
            System.out.println("\nVenta frecuente");
        } else {
            System.out.println("\nVenta superada");
        }

        obj.close();
    }
}