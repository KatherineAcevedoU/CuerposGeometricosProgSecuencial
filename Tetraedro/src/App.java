import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

        Scanner entrada = new Scanner(System.in);

        double arista;
        double area, volumen, altura;

        System.out.println("Ingrese el arista:");
        arista = entrada.nextDouble();

        area = Math.sqrt(3) * Math.pow(arista, 2);

        volumen = (Math.pow(arista, 3) * Math.sqrt(2)) / 12;

        altura = (arista * Math.sqrt(6)) / 3;

        System.out.println("El area del tetraedro es: " + area + "centimetros cuadrados");
        System.out.println("La altura del tetraedro es: " + altura + "centimetros");
        System.out.println("El volumen del tetraedro es: " + volumen + "centimetros cubicos");

        entrada.close();
      
    }
}

