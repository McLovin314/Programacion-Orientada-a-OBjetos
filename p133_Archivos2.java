import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class p133_Archivos2 {
    public static void main(String[] args) {
        String[] ciudades = {"Zacatecas", "Fresnillo", "Cd Guzman", "Rio Grande", "Guadalajara", "Novolato", "Zacatlan", "Rio Florido", "Tepetortas", "Momax", "Huejucar"};
        File arch = new File("ciudades.txt");

        System.out.print("\033[H\033[2J");
        if (! arch.exists()) {
            System.out.println("No existe, por lo tanto, lo vamos a crear");
            try {
                BufferedWriter fciudades = new BufferedWriter(new FileWriter(arch));
                for (String ciudad : ciudades) {
                    fciudades.write(ciudad + "\n");
                }
                fciudades.close();
                System.out.println("Archivo creado con exito... ");
            } catch (Exception e) {
                System.out.println("Hubo error al manipular el archivo " + e.getMessage());
             }
        }
    }
}
        
  