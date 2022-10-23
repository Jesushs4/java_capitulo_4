import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca la segunda nota");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        if (media>=5) {
            System.out.println("Nota del primer control: "+nota1);
            System.out.println("Nota del primer control: "+nota2);
            System.out.println("Tu nota de programacion es: "+media);
        } else if (media<5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recu = sc.next();
            if (("apto").equals(recu)) {
                System.out.println("Nota del primer control: "+nota1);
                System.out.println("Nota del primer control: "+nota2);
                System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto");
                System.out.println("Tu nota de programacion es 5");

            } else {
                System.out.println("Nota del primer control: "+nota1);
                System.out.println("Nota del primer control: "+nota2);
                System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto");
                System.out.println("Tu nota de programacion es: "+media);
            }
        } sc.close();
    }
}
