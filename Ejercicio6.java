import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la que cae el objeto: ");
        double altura = sc.nextDouble();
        double g = 9.81;
        double tiempo = Math.sqrt((2*altura)/g);
        if (tiempo<=0) {
            System.out.println("No se ha podido calcular el tiempo, introduzca una altura válida");
        }
        else {
            System.out.println("El tiempo que tarda en caer es de "+tiempo+" segundos.");
        }
        sc.close();
    }    
}
