import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura, alturaCaraLateral, longitudBaseMayor, longitudBaseMenor;
        double areaBaseMayor, areaBaseMenor;
        double areaLateral, areaTotal, volumen;

        System.out.println("Ingrese el altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese la altura de la cara lateral:");
        alturaCaraLateral = entrada.nextDouble();
        System.out.println("Ingrese la medidad de la base mayor");
        longitudBaseMayor = entrada.nextDouble();
        System.out.println("Ingrese la medida la base menor");
        longitudBaseMenor = entrada.nextDouble();

        areaLateral = (4 *(longitudBaseMayor + longitudBaseMenor) * alturaCaraLateral) / 2;

        areaBaseMayor = longitudBaseMayor * longitudBaseMayor;
        areaBaseMenor = longitudBaseMenor * longitudBaseMenor;
        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;

        volumen = (altura / 3 ) * (areaBaseMayor + areaBaseMenor + (Math.sqrt(areaBaseMayor * areaBaseMenor)));

        System.out.println("El area lateral del tronco de piramide es: " + areaLateral + "centimetro cubicos.");
        System.out.println("El area total del tronco de piramide es: " + areaTotal + "centimetros cubicos.");
        System.out.println("El volumen del tronco de piramide es: " + volumen + "centimetros cubicos.");

        entrada.close();



        

        

    }
}
