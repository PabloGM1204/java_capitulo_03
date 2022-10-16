import java.util.Scanner;
public class Ejercicio10{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este progama cambia de Mb a Kb");
        System.out.print("Digame cuantos Mb quiere convertir: ");
        double Mb = sc.nextDouble();
        System.out.print("Son "+(Mb*1000)+" Kb");
    }
}