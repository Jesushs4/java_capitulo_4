import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la hora:");
        int hora = sc.nextInt();
        System.out.println("Introduzca los minutos:");
        int minutos = sc.nextInt();
        int segundos = (hora*3600)+(minutos*60);
        System.out.println("Faltarán "+(86400-segundos)+" segundos para la medianoche");
        sc.close();
    }
    
}
