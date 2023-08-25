import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double altura, radio;
        double areatotal, arealateral, volumen;
        
        System.out.println("CILINDRO");
        System.out.print("Introduzca el radio: ");
        radio = scanner.nextDouble();
        System.out.print("Introduzca el altura: ");
        altura = scanner.nextDouble();
        
        arealateral = 2 * (3.1416) * radio * altura;
        areatotal = 2 * (3.1416) * radio * (altura + radio);
        volumen = (3.1416) * (radio * radio) * altura;

        System.out.println("el area lateral es: " + arealateral);
        System.out.println("el area total es: " + areatotal);
        System.out.println("el volumen es: " + volumen);

        
    }
}
