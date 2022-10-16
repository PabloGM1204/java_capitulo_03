import java.util.Scanner;
public class Ejercicio11{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa cambia de Kb a Mb");
        System.out.print("Dime cuantos Kb quiere convertir: ");
        double kb = sc.nextDouble();
        System.out.println("Son "+(kb/1000)+" Mb");
    }
}