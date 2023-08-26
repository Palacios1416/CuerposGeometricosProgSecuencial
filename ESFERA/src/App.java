import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double area, volumen, radio, areaZonaEsferica, volumenZonaEsferica;
        double radiomayor, radiomenor, altura, radiomayorCasquete, alturaCasquete;
        double volumenCasquete, areaCasquete;
        
        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();
        
        area = 4 * (3.1416) * (radio*radio);
        volumen = (1.33) * (3.1416) * radio*radio*radio;
        //en el volumen es 4/3 pero no daba el resultado correcto
        //asi que lo cambié por su valor en decimal 1.33

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+area);
        System.out.println("El volumen es: "+volumen);

        //termina calculo de la esfera

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("ZONA ESFERICA");
        /*se vuelven a pedir los valores porque es un calculo de una zona
          en especifico de la esfera */
        System.out.print("Ingrese el radio mayor: ");
        radiomayor = scanner.nextDouble();
        System.out.print("Ingrese el radio menor: ");
        radiomenor = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();

        System.out.println("::::::::::::::::::::::::::::::");
        areaZonaEsferica = 2 * (3.1416) * radiomayor * altura;
        volumenZonaEsferica = ((3.1416) * altura * ((altura*altura) + 3*(radiomenor*radiomenor) + 3*(radiomayor*radiomayor)))/6;
        System.out.println("el area de la zona esferica es: "+ areaZonaEsferica);
        System.out.println("el voluemen de la zona esfercia es: "+ volumenZonaEsferica);

        //termina calculo de la zona esferica

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("CASQUETE ESFERICO");
        /*se vuelven a pedir los valores porque es un calculo de una zona
          en especifico de la esfera */
        System.out.print("Ingrese el radio mayor: ");
        radiomayorCasquete = scanner.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        alturaCasquete = scanner.nextDouble();

        System.out.println("::::::::::::::::::::::::::::::");
        areaCasquete = 2 * (3.1416) * radiomayorCasquete * alturaCasquete;
        volumenCasquete = (((3.1416) * (alturaCasquete*alturaCasquete)) * ((3*radiomayorCasquete) - alturaCasquete))/3;
        System.out.println("el area del casquete esferico es: "+ areaCasquete);
        System.out.println("el volumen del casquete esferico es: "+ volumenCasquete);
        
        //termina calculo del casquete esferico

    }
}
