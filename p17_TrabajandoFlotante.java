//p17_TrabajandoFlotante - Trabajando con numeros y literales de tipo flotante

public class p17_TrabajandoFlotante {
    public static void main(String[] args) {
        float num1 = 423.45f;
        float num2 = 123f;
        float num3 = 1.94e-8f;

        double num4 = 1232312321.424242d;
        double num5 = .3456;

        
        System.out.print("\033[H\033[2J"); System.out.flush();

        
        System.out.println("\nUso de String.format para formateo de numeros flotantes:\n");
        System.out.println(String.format("num1 y num2 en formato flotante                    : %f  -  %f", num1, num2));
        System.out.println(String.format("num1 y num2 en formato flotante con decimales      : %.2f  -  %.3f", num1, num2));
        System.out.println(String.format("num1 en formato flotante alineado                  : %10.2f", num1));
        System.out.println(String.format("num2 en formato flotante alineado                  : %10.2f", num2));
        System.out.println(String.format("num3 en formato exponencial                        : %e", num3));
        System.out.println(String.format("num3 en formato exponencial cifras                 : %.3e", num3));
        System.out.println(String.format("num4 en con separadores de miles y decimales       : %,.2f", num4));

        System.out.println("\nUso de String.out.print para formateo de numeros flotantes:\n");
        System.out.printf("num1 y num2 en formato flotante                        : %f  -  %f", num1, num2);
        System.out.printf("num3 y num4 en formato flotante con decimales          : %.8f  -  %.2f", num3, num4);
        System.out.printf("num5 y num5 en formato exponencial                     : %e  -  %e \n", num4, num5);
        System.out.printf("num5 y num5 en formato exponencial con decimal         : %.2e  -  %.2e \n", num4, num5);

        System.out.println("\nUso de MIN_VALUE y MAX_VALUE para conocer los rangos de los numeros enteros");
        System.out.println(String.format("\nTipo float            MIN: %.1e  MAX: %.1e", Float.MIN_VALUE, Float.MAX_VALUE));
        System.out.println(String.format("\nTipo double           MIN: %.1e  MAX: %.1e", Double.MIN_VALUE, Double.MAX_VALUE));






    }
    
}
