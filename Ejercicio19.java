import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiere comprobar (máximo 5 cifras):");
        int num = sc.nextInt();
        if ((num>=0 && num<10) || (num<0 && num>-10)) {
            System.out.println("El número tiene 1 cifra");
        } else if ((num>=10 && num<100) || (num<=-10 && num>-100)) {
            System.out.println("El número tiene 2 cifras");
        } else if ((num>=100 && num<1000) || (num<=-100 && num>-1000)) {
            System.out.println("El número tiene 3 cifras");
        } else if ((num>=1000 && num<10000) || (num<=-1000 && num>-10000)) {
            System.out.println("El número tiene 4 cifras");
        } else if ((num>=10000 && num<100000) || (num<=-10000 && num>-100000)) {
            System.out.println("El número tiene 5 cifras");
        } else {
        System.out.println("Has introducido un número de más de 5 cifras"); }
        sc.close();
    }
}
