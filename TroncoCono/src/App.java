import java.util.Scanner;
public class App {
    public static void main(String[] args)  {

        Scanner entrada = new Scanner(System.in);

        double altura, radioMenor, radioMayor;
        double generatriz;
        double areaLateral, areaTotal, volumen; 

        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el radio menor");
        radioMenor = entrada.nextDouble();
        System.out.println("Ingrese el radio mayor");
        radioMayor = entrada.nextDouble();

        double elevacion = radioMayor - radioMenor;
        generatriz = Math.sqrt ((altura * altura) + (Math.pow(elevacion, 2)));
        areaLateral =Math.PI * (generatriz) * ((radioMayor + radioMenor));

        areaTotal = areaLateral + (Math.PI *(radioMayor * radioMayor)) + (Math.PI *(radioMenor * radioMenor));

        volumen = Math.PI * altura * ((radioMayor * radioMayor) + (radioMenor * radioMenor) + Math.sqrt((radioMayor * radioMayor) * (radioMenor * radioMenor))) / 3;

        System.out.println("El area lateral del tronco de cono es: " + areaLateral);
        System.out.println("El area total del tronco de cono es: " + areaTotal);
        System.out.println("El volumen del tronco de cono es: " + volumen);

        entrada.close();

        

    }
}
