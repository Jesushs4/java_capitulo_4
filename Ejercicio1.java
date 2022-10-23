import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija el dia de la semana: Lunes, Martes, Miercoles, Jueves, Viernes: ");
        String dia = sc.next();
        if (dia.equals("Lunes")) {
            System.out.println("Tocará Programación.");
        } else if (dia.equals("Martes")) {
            System.out.println("Tocará Base de Datos.");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Tocará Entornos de Desarrollo.");
        } else if (dia.equals("Jueves")) {
            System.out.println("Tocará Programación.");
        } else if (dia.equals("Viernes")) {
            System.out.println("Tocará FOL."); }
        sc.close();
    }
}