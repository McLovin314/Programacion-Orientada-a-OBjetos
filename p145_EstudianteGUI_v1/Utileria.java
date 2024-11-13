package p145_EstudianteGUI_v1;

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
    
}
