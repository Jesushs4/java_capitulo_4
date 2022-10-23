import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un número para el día de la semana (1-7): ");
        int dia = sc.nextInt();
        switch(dia) {
            case 1:
                System.out.printf("Es lunes");
            break;

            case 2:
                System.out.printf("Es martes");
            break;

            case 3:
                System.out.printf("Es miercoles");
            break;

            case 4:
                System.out.printf("Es jueves");
            break;

            case 5:
                System.out.printf("Es viernes");
            break;

            case 6:
                System.out.printf("Es sábado");
            break;

            case 7:
                System.out.printf("Es domingo");
            break;
        default:
            System.out.printf("El día de la semana no es válido, elija un número del 1 al 7.");

        }
        sc.close();
    }
    
}
