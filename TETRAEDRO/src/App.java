import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area, volumen, arista, altura;
        System.out.print("Ingrese la arista: ");
        arista = scanner.nextDouble();

        area = (arista*arista) * Math.sqrt(3);
        volumen = (Math.sqrt(2)/12) * (arista*arista*arista);
        altura = arista * (Math.sqrt(6)/3);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        System.out.println("La altura es: " + altura);
    }
}
