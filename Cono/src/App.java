import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        
        Scanner entrada = new Scanner(System.in);

         double radio, altura;
         double perimetroBase, generatriz, areaBase;
         double areaLateral, areaTotal, volumen;

         System.out.println("Ingrese el radio del cono: ");
         radio = entrada.nextDouble();
         System.out.println("Ingrese la altura del cono: ");
         altura = entrada.nextDouble();


         perimetroBase = (Math.PI * radio * altura + Math.PI * radio * radio);
         generatriz = (Math.sqrt (altura * altura) + (radio * radio));
         areaLateral = (perimetroBase * generatriz) / 2;

         areaBase = (Math.PI * radio * radio);
         areaTotal =  areaLateral + areaBase;

         volumen = (areaBase * altura) / 3;

         System.out.println("El area lateral del cono es: " + areaLateral);
         System.out.println("El area total del cono es: " + areaTotal);
         System.out.println("El volumen del cono es: " + volumen);

         entrada.close();

    }
}
