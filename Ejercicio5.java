import java.util.Scanner;
public class Ejercicio5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcual el area de un triangulo");
        System.out.print("Dime la altura del triangulo: ");
        double alt = sc.nextDouble();
        System.out.print("Dime la altura de la base: ");
        double bas = sc.nextDouble();
        System.out.println("El area del triangulo es "+((bas*alt)/2));
    }
}