import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax+b=0");
    System.out.print("Introduzca un valor para a: ");
    double a = sc.nextDouble();
    System.out.print("Introduzca un valor para b: ");
    double b = sc.nextDouble();
    double x = -b/a;
    if (a==0) {
    System.out.print("La ecuación no tiene solución"); 
    } else
    System.out.print("La solución de x es "+x); 
    sc.close();

    }

    
}
