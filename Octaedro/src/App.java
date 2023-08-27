
import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        
        Scanner entrada = new Scanner(System.in);

        double arista;
        double area, volumen;

        System.out.println("Ingrese el arista:");
        arista = entrada.nextDouble();

        area = 2 * arista * arista * Math.sqrt(3);

        volumen = (Math.pow(arista, 3) * Math.sqrt(2)) / 3;

        System.out.println("El area del octaedro es: " + area + "centimetros cuadrados.");
        System.out.println("El volumen del octaedro es: " + volumen + "centimetros cubicos.");

        entrada.close();
    }
}
