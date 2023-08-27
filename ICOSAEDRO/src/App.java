import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area, volumen, arista;

        System.out.print("Ingrese la arista: ");
        arista = scanner.nextDouble();

        area = 5 * (arista*arista) * Math.sqrt(3);
        volumen = ((5 * (3 + Math.sqrt(5)))/12) * (arista * arista * arista);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
    }
}
