import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué hora es? (Introduzca la hora exacta sin minutos): ");
        int hora = sc.nextInt();
        if (hora>=6 && hora<=12) {
            System.out.println("Buenos días");
        } else if (hora>=13 && hora<=20) {
            System.out.println("Buenas tardes");
        } else if (hora<=24 && hora>=0){
            System.out.println("Buenas noches");
        } else {
            System.out.println("Introduzca una hora valida (0-24)"); }
        sc.close();
    }
    
}
