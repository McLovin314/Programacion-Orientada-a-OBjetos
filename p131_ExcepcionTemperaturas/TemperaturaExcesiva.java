package p131_ExcepcionTemperaturas;

public class TemperaturaExcesiva extends Exception {
    public TemperaturaExcesiva(String error){
        super(error);
    }
}