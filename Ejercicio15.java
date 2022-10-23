import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija el símbolo que quiere que se use en la pirámide: ");
        String simb = sc.next();
        System.out.print("¿De qué lado desea que apunte la pirámide? (arriba, abajo, derecha, izquierda): ");
        String pira = sc.next();
        if ((pira.equals("arriba"))) {
            System.out.println("  "+simb);
            System.out.println(" "+simb+simb+simb);
            System.out.println(simb+simb+simb+simb+simb);
        } else if ((pira).equals("derecha")) {
            System.out.println(simb);
            System.out.println(simb+simb);
            System.out.println(simb+simb+simb);
            System.out.println(simb+simb);
            System.out.println(simb);
        } else if ((pira).equals("izquierda")) {
            System.out.println("  "+simb);
            System.out.println(" "+simb+simb);
            System.out.println(simb+simb+simb);
            System.out.println(" "+simb+simb);
            System.out.println("  "+simb);
        } else if ((pira).equals("abajo")) {
            System.out.println(simb+simb+simb+simb+simb);
            System.out.println(" "+simb+simb+simb);
            System.out.println("  "+simb);
        } sc.close();
    }
}
