package p98_Circulo;

public class App {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(10.40);  //Instanciar y //Asignar valores a las propiedades
        System.out.println(c1);

        Circulo c2 = new Circulo();  //Instanciar
        c2.setRadio(12.45);    //Asignar valores a las propiedades

        System.out.println(c2.toString());      //Invocar metodo tostring() del objeto
        System.out.println("El radio es : " + c2.getRadio() );
        System.out.println("Area = " + c1.getArea() );
        System.out.println("Circunferencia = " + c1.getCircunferencia() );
    }
    
}
