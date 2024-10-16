package p113_SegundoExamenParcial;

public class JugadorEntrenador  extends Jugador{
    private int Subordinados;
    private int Proyectos;
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total= salario + getBono();
    }
    public double getBono() {
        double Salario= 0;
        return (Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
    }
    
    public String toString() {
        return "JugadorEntrenador [Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", toString()="
                + super.toString() + "]";
    }
    
   
    
    
    
    
    
   
    
}
