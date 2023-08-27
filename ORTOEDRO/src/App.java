import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area, volumen, longitudLado;
        double altura, ancho, diagonal;

        System.out.print("Ingrese la longitud: ");
        longitudLado = scanner.nextDouble();
        System.out.print("Ingrese la anchura: ");
        ancho = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();

        area = 2 * ((longitudLado*ancho) + (longitudLado*altura) + (ancho*altura));
        diagonal = Math.sqrt((longitudLado*longitudLado) + (ancho*ancho) + (altura*altura));
        volumen = longitudLado*altura*ancho;

        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El diagonal es: "+ diagonal);
        System.out.println("El volumen es: "+ volumen);
    }
}
