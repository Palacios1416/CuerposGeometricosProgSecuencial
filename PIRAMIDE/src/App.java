import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double arealateral, areatotal, volumen;
        double aBase, apotema, apotemaCentral, altura, distancialados;
        
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();
        System.out.print("Ingrese la longitud de los lados: ");
        distancialados = scanner.nextDouble();
 
        apotemaCentral = distancialados/2;

        apotema = Math.sqrt((altura * altura) + (apotemaCentral * apotemaCentral));

        arealateral = ((4 * distancialados) * apotema) / 2 ; 
        aBase = distancialados*distancialados;
        areatotal = arealateral + aBase;
        volumen = (aBase * altura) / 3;

        System.out.println(":::::::::::::::::::::::::::::::::::");

        System.out.println("El area lateral es: " + arealateral);
        System.out.println("El area total es: " + areatotal);
        System.out.println("El volumen es: " + volumen);
        // 4 significa que la piramide tiene 4 lados



    }
}
