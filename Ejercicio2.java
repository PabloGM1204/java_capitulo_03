import java.util.Scanner;
public class Ejercicio2{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa convierte de euros a pesetas.");
        System.out.print("Digame cuantos euros a convertir: ");
        double euros = sc.nextDouble();
        double pesetas = 166.386;
        System.out.println("Son "+(euros*pesetas)+" pesetas");
    }
}