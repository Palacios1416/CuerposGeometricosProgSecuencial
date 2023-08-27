import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double areaLateral, areaTotal, volumen;
        double apotema, ladoMayor, ladoMenor;
        double altura, pBasemayor, pBasemenor;
        double aBasemayor, aBasemenor, catetoAdyacente;

        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado mayor: ");
        ladoMayor = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado menor: ");
        ladoMenor = scanner.nextDouble(); 

        aBasemayor = ladoMayor * ladoMayor;
        aBasemenor = ladoMenor * ladoMenor;
        pBasemayor = ladoMayor * 4; //4 es la cant de lados
        pBasemenor = ladoMenor * 4;
        catetoAdyacente = (ladoMayor/2) - ladoMenor;
        apotema = Math.sqrt((altura*altura) + (catetoAdyacente*catetoAdyacente));
        areaLateral = ((pBasemayor + pBasemenor)/2) * apotema;
        areaTotal = areaLateral + aBasemayor + aBasemenor;
        volumen = (altura/3) * (aBasemayor + aBasemenor + Math.sqrt(aBasemayor*aBasemenor));
        
        System.out.println("::::::::::::::::::::::::::");
        System.out.println("El area lateral es: " + areaLateral);
        System.out.println("El area total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
    }
}
