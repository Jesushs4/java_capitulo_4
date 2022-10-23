import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas que has trabajado");
        int horas = sc.nextInt();
        if (horas<=40) {
            System.out.println("Se han trabajado "+horas+" horas, por lo que a 12 euros la hora se cobrarán "+horas*12+" euros");
        } else if (horas>40) {
            System.out.println("Se han trabajado "+horas+" horas, por lo que a 12 euros la hora se cobrarán "+((40*12)+((horas-40)*16))+" euros"); 
        }
        sc.close();

    }
    
}