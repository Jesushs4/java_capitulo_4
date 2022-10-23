import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiere comprobar (máximo 5 cifras):");
        int num = sc.nextInt();
        if (num>=0 && num<10) {
            System.out.println("El número comienza por "+num);
        } else if (num>=10 && num<100) {
            System.out.println("El número comienza por "+(num/10));
        } else if (num>=100 && num<1000) {
            System.out.println("El número comienza por "+(num/100));
        } else if (num>=1000 && num<10000) {
            System.out.println("El número comienza por "+(num/1000));
        } else if (num>=10000 && num<100000) {
            System.out.println("El número comienza por "+(num/10000));
        } else {
        System.out.println("Has introducido un número de más de 5 cifras"); }
        sc.close();
    }
    
}
