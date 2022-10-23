import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que desea comprobar:");
        int num = sc.nextInt();
        System.out.println("El numero termina en "+(num % 10));
        sc.close();
    }
    
}
