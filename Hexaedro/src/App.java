import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

         Scanner entrada = new Scanner(System.in);

         double arista;
         double area, diagonal, volumen;

         System.out.println("Ingrese la arista: ");
         arista = entrada.nextDouble();

         area = 6 * Math.pow(arista, 2);

         diagonal = Math.sqrt(arista * arista + arista * arista + arista * arista);

         volumen = Math.pow(arista, 3);
    
         System.out.println("El area del exaedro es: " + area);
         System.out.println("La diagonal del exaedro es: " + diagonal);
         System.out.println("El volumen del exaedro es: " + volumen);

         entrada.close();
    
        }   
}
