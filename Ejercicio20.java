import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiere comprobar (máximo 5 cifras):");
        int num = sc.nextInt();
        if (num>=0 && num<10) {
            System.out.println("El número comienza es capicua");
        } else if (num>=10 && num<100) {
            if (num % 10 == num/10) { 
            System.out.println("El número es capicua");
            } else {
                System.out.println("El número no es capicua"); }
        } else if (num>=100 && num<1000) {
            if (num % 10 == num/100) { 
                System.out.println("El número es capicua");
                } else {
                    System.out.println("El número no es capicua"); }
        } else if (num>=1000 && num<10000) {
            if ((num % 10 == num/1000) && ((num/10)%10)==((num/100)%10)) { 
                System.out.println("El número es capicua");
                } else {
                    System.out.println("El número no es capicua"); }
        } else if (num>=10000 && num<100000) {
            if ((num % 10 == num/10000) && ((num/10)%10)==((num/1000)%10)) { 
                System.out.println("El número es capicua");
                } else {
                    System.out.println("El número no es capicua"); }
        } else {
        System.out.println("Has introducido un número de más de 5 cifras"); }
        sc.close();
        }
}
