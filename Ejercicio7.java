import java.util.Scanner;
public class Ejercicio7{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que calcula el iva de tu factura");
        System.out.print("Dime cuanto es su base imponible: ");
        double bai = sc.nextDouble();
        System.out.println("El iva = "+(bai*0.21));
        System.out.println("Total de la factura = "+((bai*0.21)+bai));
        
    }
}