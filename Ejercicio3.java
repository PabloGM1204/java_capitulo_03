import java.util.Scanner;
public class Ejercicio3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa convierte de pesetas a euros ");
        System.out.print("Digame cuantas pesetas quiere convertir a euros: ");
        double pesetas = sc.nextDouble();
        double euros = 0.006;
        System.out.println("Son "+(pesetas*euros)+" en euros.");
    }
}