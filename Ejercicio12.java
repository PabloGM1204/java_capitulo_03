import java.util.Scanner;
public class Ejercicio12{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice la nota que tienes que sacer en el proximo examen");
        System.out.print("Introduce la nota de tu primer examen: ");
        float examen1 = sc.nextFloat();
        System.out.print("Introduce que nota quieres sacar: ");
        float nota = sc.nextFloat();
        float examen2 = ((nota * 100)-(examen1*40)) / 60; 
        System.out.println("Para tener un "+nota+"tienes que sacar un "+examen2+" en el segundo examen");
    }
}