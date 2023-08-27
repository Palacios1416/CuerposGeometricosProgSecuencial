import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area, volumen, arista, diametro;
        System.out.print("Ingrese la arista: ");
        arista = scanner.nextDouble();

        area = 6 * (arista*arista);
        volumen = (arista*arista*arista);
        diametro = arista * Math.sqrt(3);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        System.out.println("La diametro es: " + diametro);
        
    }
}
