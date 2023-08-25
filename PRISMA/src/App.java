import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double arealateral, areatotal, volumen;
        double pBase, distanciaLados, altura, aBase; //pBase = perimetro
        int numeroLados=5;
        double apotema, anguloradianes;

        System.out.println("PRISMA");
        System.out.print("Introduzca la altura: ");
        altura = scanner.nextDouble();
        System.out.print("Introduzca la distancia de los lados: ");
        distanciaLados = scanner.nextDouble();

        pBase = numeroLados*distanciaLados;
        arealateral = pBase * altura;

        anguloradianes = (3.1416/180) * (360/numeroLados);
        apotema = distanciaLados / (2 * Math.tan(anguloradianes/2));
        aBase = (pBase * apotema)/2;

        areatotal = arealateral + 2 * aBase;
        volumen = aBase * altura;




    }
}
