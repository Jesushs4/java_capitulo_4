import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jug1 = sc.next();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jug2 = sc.next();
        if ((jug1).equals("piedra")) {
            if ((jug2).equals("piedra")) {
                System.out.println("Empate");
            } else if ((jug2).equals("papel")) {
                System.out.println("El jugador 2 gana");
            } else if ((jug2).equals("tijera")) {
                System.out.println("El jugador 1 gana");
            }

            
        } else if ((jug1).equals("tijera")) {
            if ((jug2).equals("piedra")) {
                System.out.println("El jugador 2 gana");
            } else if ((jug2).equals("papel")) {
                System.out.println("El jugador 1 gana");
            } else if ((jug2).equals("tijera")) {
                System.out.println("Empate");
            } 
            
            else if ((jug1).equals("papel")) {
                if ((jug2).equals("piedra")) {
                    System.out.println("El jugador 1 gana");
                } else if ((jug2).equals("papel")) {
                    System.out.println("Empate"); }
                } else if ((jug2).equals("tijera")) {
                    System.out.println("El jugador 2 gana");}
    } else {
        System.out.println("Introduzca opciones válidas");
    } sc.close();
}
}
