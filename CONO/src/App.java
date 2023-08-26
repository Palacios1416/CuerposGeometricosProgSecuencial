import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double arealateral, areatotal, volumen;
        double altura, radio, generatriz;

        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();
        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();

        generatriz = Math.sqrt((altura*altura) + (radio*radio));

        arealateral = (3.1416) * radio * generatriz;
        areatotal = (3.1416) * radio * (generatriz + radio);
        volumen = ((3.1416) * (radio*radio) * altura)/3;

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area lateral es: " + arealateral);
        System.out.println("El area total es: "+ areatotal);
        System.out.println("El volumen es: "+ volumen);
        


    }
}
