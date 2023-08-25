import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int cantidadLados;
        double longitudLados, altura, areaLateral, areaTotal, volumen;
        double perimetroBase, areaBase, apotema, alfa;

        System.out.println("Cantidad de lados: ");
        cantidadLados = entrada.nextInt();
        System.out.println("Longitud de lados: ");
        longitudLados = entrada.nextDouble();
        System.out.println("Altura: ");
        altura = entrada.nextInt();

        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;

        alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/ 2));
        areaBase = (perimetroBase * apotema)/ 2;
        areaTotal = areaLateral + 2 * areaBase; 

        volumen = areaBase * altura;

        System.out.println("El area lateral del prisma es de : " + areaLateral + "unidades cuadradas.");
        System.out.println("El area total del prisma es de : " + areaTotal + "unidades cuadradas.");
        System.out.println("El volumne del prisma es de : " + volumen + "unidades cubicas");

        entrada.close();
        

    }
}
