// p82_InicializarArregloCadenas 
public class p82_InicializaArregloCadenas {
    public static void main(String[] args) {

        String[] muns = new String[10];

        muns[0] = "Apozol";
        muns[1] = "Apulco";
        muns[2] = "Cañitas";
        muns[3] = "Jerez";
        muns[4] = "Fresnillo";
        muns[5] = "Rio Grande";
        muns[6] = "Sain Alto";
        muns[7] = "Sombrerete";
        muns[8] = "Teul de Gonzalez Ortega";
        muns[9] = "Zacatecas";
        //muns[11] = "Atolinga"; no existe posicion 10

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.printf("Primer elemento %.2f\n", muns[0]);
        System.out.printf("Segundo elemento %.2f\n", muns[6]);
        //System.out.println("Otro " + nums[10]); //No es posible fuera de rango


        System.out.println("\nTodos los elementos del arreglo con un for con base al indice:");
        for (int i = 0; i < muns.length; i++) {
            System.out.printf("%s ", muns[i]);
        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for sin indice:");
        for (String m : muns) {
        System.out.printf("%s ", m);
        }
        System.out.println("\n\nProceso terminado ");
    }
}