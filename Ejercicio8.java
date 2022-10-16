import java.util.Scanner;
public class Ejercicio8{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula el salario");
        System.out.print("Digame la cantidad de horas que ha trabajado esta semana: ");
        double h = sc.nextDouble();
        System.out.print("Su salario semanal es de "+(h*12)+" euros");
    }
}