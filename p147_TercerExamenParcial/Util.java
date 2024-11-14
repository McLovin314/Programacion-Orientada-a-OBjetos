package p147_TercerExamenParcial;

//Aqui se crean los datos de los jugadores

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
     public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Cristiano Ronaldo", 27, 'H', "Casado", "Delantero", 10000));
        datos.add(new Jugador("Leonel Messi", 30, 'H', "Soltero", "Defensa", 50000));
        return datos;
    } 

     public static void grabarDatos(String archivo, ArrayList<Jugador> datos ) throws IOException{
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Jugador> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Jugador>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
    
    
}
