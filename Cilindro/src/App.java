import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

        System.out.println("Tercera version");
      
       Scanner entrada = new Scanner(System.in);

       double altura, radio; 
       double perimetroBase, areaBase;
       double areaLateral, areaTotal, volumen;

       System.out.println("Ingrese la altura: ");
       altura = entrada.nextDouble();
       System.out.println("Ingrese el radio: ");
       radio = entrada.nextDouble();

       perimetroBase = 2 * Math.PI * (radio * radio);
       areaLateral = perimetroBase * altura;

       areaBase = Math.PI * (radio * radio);
       areaTotal = areaLateral + 2 * areaBase;

       volumen = areaBase * altura;

       System.out.println("El area lateral del cilindro es: " + areaLateral);
       System.out.println("El area total del cilindro es: " + areaTotal);
       System.out.println("El volumen del cilindro es: " + volumen);
       entrada.close();

    }
}
