//p90_Temperaturas

public class p90_Temperaturas {
    public static void main(String[] args) {
        
        float [] Temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        //Para mostrar el primer y el tercer elemento del arreglo:

        System.out.print("\033[H\033[2J");
        System.out.println("Dentro de este Arreglo de Temperaturas");
        System.out.println("El Primer Elemento es: " + Temperaturas[0]);
        System.out.println("El Tercer Elemento es: " + Temperaturas[2]);

        //Para mostrar todos los elementos que tiene el arreglo

        System.out.println("Los elementos que contiene este Arrglo son: ");
        for (float temp : Temperaturas) {
            System.out.print(temp + " ");
        }
         //Poner 0 a todos los valores mayores a 10.

         for (int i = 0; i < Temperaturas.length; i++) {
            if (Temperaturas[i]> 10) {
                Temperaturas[i] = 0;
                
            }
        }
        System.out.println("\nElementos del arreglo actualizados: ");
        for (float temp : Temperaturas) {
            System.out.print(temp + " ");
        }

    }
    
}
