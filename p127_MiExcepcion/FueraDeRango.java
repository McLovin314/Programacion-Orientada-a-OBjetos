package p127_MiExcepcion;

//Para crear nuestra propia excepcion, heredamos de la clase Excepcion
//Creamos un constructor, que pase el mensaje del error a la clase base
public class FueraDeRango  extends Exception{
    public FueraDeRango(String error) {
        super(error);
    }
    
}
