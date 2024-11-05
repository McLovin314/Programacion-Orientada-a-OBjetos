import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class p135_Archivos4 {
     public static void capturarDatos(ArrayList<String> datos) {
        String dato="";
        System.out.println("\nIntroduce un dato y presiona <ENTER>, dato vacio para terminar ");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (dato.isEmpty())  break;
                datos.add(dato);
            }
        }

    public static void mostrarDatos (ArrayList<String> datos) {
        System.out.println("\nLos datos hasta el momento son: ");
        for (String dato : datos)
            System.out.println(dato);
    }

    public static void grabarDatos(String archivo, ArrayList<String> datos) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)
            fdatos.write(dato + "\n");
        fdatos.close();
    }

    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        ArrayList<String> datos = new ArrayList<>();
        String archivo = "datos.txt";

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("-------- Procesamiento de datos --------");
            System.out.println("Capturar datos ................... [1]");
            System.out.println("Grabar datos en el archivo ....... [2]");
            System.out.println("Leer datos en el archivo ......... [3]");
            System.out.println("Mostrar datos .................... [4]");
            System.out.println("SALIR ............................ [5]");
            System.out.println("Selecciona una opcion ? "); op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nCaptura de datos ...");
                    capturarDatos(datos); break;
                case 2:
                    System.out.println("\nGrabando datos en archivo ...");
                    try {
                        grabarDatos(archivo, datos);
                    }    catch (Exception e) {
                        System.out.println("Error al grabar el archivo...");
                    }
                case 3:
                    System.out.println("\nLeyendo datos de archivo ...");    break;
                case 4:
                    System.out.println("\nMostrando datos ...");    break;
                case 5:
                    System.out.println("\nSaliendo del sistema ...");    break;
                default:
                    System.out.println("\nOpcion invalida ..!!!! ... !!! ... !!!");    break;
            }
            System.out.println("\n\n<<Presione cualquier tecla para continuar >>"); obj.nextLine();obj.nextLine();
        } while (op!=5);
        System.out.println("\nProceso terminado...");
    }
}
    

