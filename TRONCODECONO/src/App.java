import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double areaLateral, areaTotal, volumen;
        double generatriz, aBasemayor, altura, restaRadios;
        double radiomayor, radiomenor, aBasemenor;

        System.out.print("Ingrese el radio mayor: ");
        radiomayor = scanner.nextDouble();
        System.out.print("Ingrese el radio menor: ");
        radiomenor = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();

        restaRadios = radiomayor - radiomenor;
        generatriz = Math.sqrt((altura*altura) + (restaRadios*restaRadios));
        /* para calcular la generatriz se utiliza una modificacion en la formula de la hipotenusa
         * la resta del radiomayor menos el radiomenor es el que se eleva al cuadrado
         */
        areaLateral = (3.1416) * generatriz * (radiomayor + radiomenor);
        aBasemayor = (3.1416) * (radiomayor * radiomayor);
        aBasemenor = (3.1416) * (radiomenor * radiomenor);
        areaTotal = areaLateral + aBasemayor + aBasemenor;
        volumen = ((3.1416) * altura * ((radiomayor*radiomayor) + (radiomenor*radiomenor) + (radiomayor*radiomenor)))/3;

        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("El area lateral es: "+ areaLateral);
        System.out.println("El area total es: "+ areaTotal);
        System.out.println("El volumen es: "+ volumen);
        

    }
}
