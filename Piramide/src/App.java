import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

        Scanner entrada = new Scanner(System.in);

        int cantidadLados;
        double longitudLados, altura, apotemaBase, perimetroBase, apotemaPiramide, areaBase;
        double areaLateral, areaTotal, volumen;

        System.out.println("Ingrese la cantidad de lados: ");
        cantidadLados = entrada.nextInt();
        System.out.println("Ingrese la medida de los lados: ");
        longitudLados = entrada.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el apotema de la base: ");
        apotemaBase = entrada.nextDouble();


         perimetroBase = cantidadLados * longitudLados;
         apotemaPiramide = (Math.sqrt(altura * altura) + (apotemaBase * apotemaBase));
         areaLateral = (perimetroBase * apotemaPiramide) / 2;

         areaBase = perimetroBase * 2 * (apotemaBase + apotemaPiramide);
         areaTotal = areaLateral + areaBase;

         volumen = (areaBase * altura) / 3;
   
         System.out.println("El area lateral de la piramide es: "+ areaLateral);
         System.out.println("El area total de la piramide es: "+ areaTotal);
         System.out.println("El volumen de la piramide es: "+ volumen);
         entrada.close();
        
       
    }
}
