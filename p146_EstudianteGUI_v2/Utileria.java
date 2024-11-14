package p146_EstudianteGUI_v2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//En esta clase se crea un arreglo donde se van a guardar los datos de los estudiantes haciendo uso de los metodos creados en la clase "Estudiante".
public class Utileria {
    public static ArrayList<Estudiante> inicializarDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Monkey D Luffy", 22, 40, "muwychan@gmail.com"));
        datos.add(new Estudiante("Gangster Gastino", 34, 20, "cesarclown@gmail.com"));
        datos.add(new Estudiante("Charlote Katacuri", 26, 55.5, "mrDonuts@gmail.com"));
        return datos;

    }

     public static void grabarDatos(String archivo, ArrayList<Estudiante> datos ) throws IOException{
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Estudiante> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Estudiante>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
    
}
