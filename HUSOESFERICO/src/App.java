import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area;
        double radio, nGrado;

        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();
        System.out.print
        ("Ingrese los grados: ");
        nGrado = scanner.nextDouble();

        area = (4 * (3.1416) * (radio*radio) * nGrado)/360;
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);

    }
}
