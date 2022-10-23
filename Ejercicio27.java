import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor = sc.next();
        String choco="nada";
        if ((sabor).equals("chocolate")) {
            System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
            choco = sc.next();
        }
        System.out.print("¿Quiere nata? (si o no): ");
        String nata = sc.next();
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        String nombre = sc.next();

        if ((sabor).equals("chocolate")) {
            if ((choco).equals("negro")) {
                System.out.println("Tarta de chocolate negro: 14,00 euros");
                precio = precio+14;
            } else if ((choco).equals("blanco")) {
                System.out.println("Tarta de chocolate negro: 15,00 euros");
                precio = precio+15;
        }
        } else if ((sabor).equals("manzana")) {
            System.out.println("Tarta de manzana: 18,00 euros");
            precio = precio+18;
        } else if ((sabor).equals("fresa")) {
            System.out.println("Tarta de manzana: 16,00 euros");
            precio = precio+16;
        }
        if ((nata).equals("si")) {
            System.out.println("Con nata: 2,50 euros");
            precio = precio+2.50;
        }
        if ((nombre).equals("si")) {
            System.out.println("Con nombre: 2,75 euros");
            precio = precio+2.75;
        }
        System.out.println("Total: "+precio+(" euros"));
        sc.close();
    }
}
