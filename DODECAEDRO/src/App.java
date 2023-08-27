import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area, volumen, arista, areaPentagonal, apotema;

        System.out.print("Ingrese la arista: ");
        arista = scanner.nextDouble();

        area = 3* (arista*arista) * Math.sqrt(25 + (10 * (Math.sqrt(5))));
        volumen = ((15 + (7 * (Math.sqrt(5))))/4) * (arista * arista * arista);
        apotema = arista/(1.45);
        areaPentagonal = ((5 * arista)/2) * apotema;

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        System.out.println("El area pentagonal es: " + areaPentagonal);
    }
}
