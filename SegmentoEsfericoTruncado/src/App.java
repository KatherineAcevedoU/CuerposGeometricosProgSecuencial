import java.util.Scanner;
public class App {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        double radio, altitud, circunferenciaEsfera;
        double areaZonaEsferica, volumenZonaEsferica, areaCasqueteEsferico, volumenCasqueteEsferico;

        System.out.println("Ingrese el radio");
        radio = entrada.nextDouble();
        System.out.println("Ingrese la altitud");
        altitud = entrada.nextDouble();
        System.out.println("Ingrese la circunferencia esferica");
        circunferenciaEsfera = entrada.nextDouble();

        //circunferenciaEsfera = (radio * radio) + (altitud * altitud) / (2 * altitud);  

        areaZonaEsferica  =  2 * Math.PI * circunferenciaEsfera * altitud;
        volumenZonaEsferica = Math.PI * altitud * (altitud * altitud + (3 * circunferenciaEsfera * circunferenciaEsfera) + (3 * radio * radio)) / 6;

        areaCasqueteEsferico = 2 * Math.PI * circunferenciaEsfera * altitud;
        volumenCasqueteEsferico = Math.PI * altitud * altitud * (3 * circunferenciaEsfera - altitud) / 3;

        System.out.println("El area de la zona esferica es: " + areaZonaEsferica);
        System.out.println("El volumen de la zona esferica es: " + volumenZonaEsferica);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El area del casquete esferico es: " + areaCasqueteEsferico);
        System.out.println("El volumen del casquete esferico es: " + volumenCasqueteEsferico);

        entrada.close();
        
        

    } 

}    