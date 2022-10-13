import java.util.Scanner;
public class Ejercicio1{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa multiplica dos números");
        System.out.print("Digame el primero número: ");
        int n1 = sc.nextInt();
        System.out.print("Digame el otro número: ");
        int n2 = sc.nextInt();
        int t = n1 * n2;
        System.out.printf("%d * %d = %d", n1, n2, t);
        sc.close();
    }
}