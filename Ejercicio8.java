import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca la segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca la tercera nota:");
        double nota3 = sc.nextDouble();
        double media = ((nota1+nota2+nota3)/3);
        if (media<5)
            System.out.printf("La media es de %.2f, le queda un insuficiente", media); 
        else if (media>=5 && media<6)    
            System.out.printf("La media es de %.2f, le queda un suficiente", media);
        else if (media>=6 && media<7)
            System.out.printf("La media es de %.2f, le queda un bien", media);
        else if (media>=7 && media<9)
            System.out.printf("La media es de %.2f, le queda un notable", media);
        else if (media>=9) {
        System.out.printf("La media es de %.2f, le queda un excelente", media); }
        sc.close();
    }  
    
}
