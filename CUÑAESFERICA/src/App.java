import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double volumen;
        double radio, nGrado;

        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();
        System.out.print
        ("Ingrese los grados: ");
        nGrado = scanner.nextDouble();

        volumen = (4/3)  * ((3.1416) * (radio*radio*radio) * nGrado)/360;

         System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("El volumen es: "+ volumen);
       
    }
}
