import java.util.Scanner;
public class Ejercicio9{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula el volumen de un cono");
        System.out.print("Dime la altura del cono: ");
        double alt = sc.nextDouble();
        System.out.print("Dime el radio del cono: ");
        double rad = sc.nextDouble();
        System.out.println("El volumen de tu cono es: "+((Math.PI*(Math.pow(rad, 2)*alt))/3));
    }
}