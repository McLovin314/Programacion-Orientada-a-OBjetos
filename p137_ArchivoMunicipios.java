import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class p137_ArchivoMunicipios {

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        
        String[] municipios = { "Futbol", "Beisbol", "Ciclismo", "Atletismo", "Natacion", "Motociclismo" };
        File arch = new File("deportes.txt");

        if (arch.exists()) 
            
            System.out.println("El archivo ya existe !");
      
        
        else {    
            try {
                BufferedWriter fmunicipios = new BufferedWriter(new FileWriter(arch));
                for (String municipio : municipios) 
                fmunicipios.write(municipio + "\n");
                fmunicipios.close();            
                
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }

        }
        try (BufferedReader fmunicipios = new BufferedReader(new FileReader(arch))) {
            System.out.println("\nContenido del archivo:");
            String linea;
            while ((linea = fmunicipios.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Problemas al leer el archivo.");
            System.out.println(e);
        }
        System.out.println("Longitud final el archivo escrito " + arch.length());
    }
    
}