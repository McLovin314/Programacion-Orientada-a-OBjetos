package p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    protected char Sexo; //Tiene que ser protected para que la detecte cuando la usemos en la clase de Equipo
    private String Descripcion;
    private double Salario;
    protected double Total;
    
    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }
    public abstract double getBono();
    
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario + ", Total=" + Total + "]";
    }

    
    
    
    

    
}
