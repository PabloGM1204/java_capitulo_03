import java.util.Scanner;
public class Ejercicio4{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace varias operaciones de dos números");
        System.out.print("Dime el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Dime el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
        System.out.println(n1+" * "+n2+" = "+(n1*n2));
        System.out.println(n1+" / "+n2+" = "+(n1/n2));
    }
}