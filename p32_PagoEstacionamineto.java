//p32_PagoEstacionamiento - Administra el pago del estacionamiento de acuerdo a la zona:
//Norte: 3%, Sur: 5%, Este: 10% y Sur: 20%

import java.util.Scanner;

public class p32_PagoEstacionamineto {
    public static void main(String[] args) {
        float pago, total, imp;
        char estacionamiento;
        Scanner obj = new Scanner(System.in);

        pago = total = imp = 0;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elige el tipo de estacionamiento que usaste: ");
        System.out.println("Estacionamiento ¨[N]orte - 3% ");
        System.out.println("Estacionamiento ¨[S]ur - 5% ");
        System.out.println("Estacionamiento ¨[E]ste - 10% ");
        System.out.println("Estacionamiento ¨[O]este - 20% ");
        System.out.printf("Elije ? ");
        estacionamiento = Character.toUpperCase( obj.next().charAt(0) );
        switch (estacionamiento) {
            case 'N' : imp = 0.03f; break;
            case 'S' : imp = 0.05f; break;
            case 'E' : imp = 0.10f; break;    
            case 'O' : imp = 0.20f; break;
            default:
                break;
        }
        System.out.print("Cuanto pagaste ? "); pago = obj.nextFloat();
        total = pago * (1 + imp);
        total = (pago * imp ) + pago;
        System.out.printf("");


    }
    
}
