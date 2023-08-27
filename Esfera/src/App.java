import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
      
        Scanner entrada = new Scanner(System.in);

        double radio;
        double areaEsfera, volumenEsfera;

        System.out.println("Ingrese el radio de la esfera");
        radio = entrada.nextDouble();

        areaEsfera = 4 * (Math.PI * radio * radio);
        
        volumenEsfera = 4 * (Math.PI * radio * radio * radio) / 3;

        System.out.println("El area de la esfera es: " + areaEsfera);
        System.out.println("El volumen de la esfera es: " + volumenEsfera);
        
        entrada.close();


    }
}
