import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Elija el valor de b: ");
        int b = sc.nextInt();
        System.out.print("Elija el valor de c: ");
        int c = sc.nextInt();
        double raiz = (b*b)-(4*a*c);
        double operacion1 = (-b-(Math.sqrt(raiz)))/(2*a);
        double operacion2 = (-b+(Math.sqrt(raiz)))/(2*a);

        
        if (raiz<0) {
            System.out.println("La operación no se puede realizar");
        } else if (a==0) {
            System.out.println("La operación no se puede realizar");
        } else {
            System.out.println("La primera solución es "+operacion1);
            System.out.println("La segunda solución es "+operacion2);

        } sc.close();
    }
    
}
