import java.util.Scanner;
public class Ejercicio5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcual el area de un rectangulo");
        System.out.print("Dime el ancho del rectangulo: ");
        double anc = sc.nextDouble();
        System.out.print("Dime el largo de la base: ");
        double lag = sc.nextDouble();
        System.out.println("El area del rectangulo es "+(anc*lag));
    }
}