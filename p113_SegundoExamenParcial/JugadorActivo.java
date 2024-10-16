package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partido;
    private int Goles;
    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partido, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partido = partido;
        Goles = goles;
        Total= salario + getBono();
    }
    
    public double getBono() {
        double Salario= 0;
        return (Salario * 0.10) + (Partido * 50) + (Goles * 5);
    }
    
    public String toString() {
        return "JugadorActivo [Partido=" + Partido + ", Goles=" + Goles + ", toString()=" + super.toString() + "]";
    }
    
    
   
    
    
    
    
}
