import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

        Scanner entrada = new Scanner(System.in);

        double radio, grado;
        double husoAreaEsferico, cuñaVolumenEsferica; 

        System.out.println("Ingrese el radio:");
        radio = entrada.nextDouble();
        System.out.println("Ingrese el angulo:");
        grado = entrada.nextDouble();

        husoAreaEsferico = (4 * Math.PI * radio * radio * grado) / 360;

        cuñaVolumenEsferica = ((4 * Math.PI * radio * radio * radio * grado)) / (3 * 360);

        System.out.println("El huso esferico es: " + husoAreaEsferico + "Centimetros cubicos");
        System.out.println("La cuña esferica es: " + cuñaVolumenEsferica + "centimetros cubicos");

        entrada.close();



        
        
        
    }
}
