import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
         
        Scanner entrada = new Scanner(System.in);

        double arista;
        double area, volumen;

        System.out.println("Ingrese la arista:");
        arista = entrada.nextDouble();

        area = 5 * Math.sqrt(3) * Math.pow(arista, 2);

        volumen = (5 * Math.pow(arista, 3)) / 12 * (3 + Math.sqrt(5));

        System.out.println("El area del icosaedro es: " + area + "centimetros cuadrados.");
        System.out.println("El volumen del icosaedro es: " + volumen + "centimetros cubicos.");
        
        entrada.close();
        
    }
}
