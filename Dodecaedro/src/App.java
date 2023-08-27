import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

        Scanner entrada = new Scanner(System.in);

        double arista;
        double area, volumen;

        System.out.println("Ingrese la arista:");
        arista = entrada.nextDouble();

        area = 3 * arista * arista * Math.sqrt(25 + 10 * Math.sqrt(5));

        volumen = (Math.pow(arista, 3)) / 4 * (15 + 7 * Math.sqrt(5));

        System.out.println("El area de el dodecaedro es: " + area + "centimetros cuadrados.");
        System.out.println("El volumen de el dodecaedro es: " + volumen + "centimetros cubicos.");

        entrada.close();
       
    }
}
