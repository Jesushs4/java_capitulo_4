import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int punt = 0;
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String preg1 = sc.next();
        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        String preg2 = sc.next();
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        String preg3 = sc.next();
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o se arregla el pelo y se asea con más frecuencia (si es mujer)");
        String preg4 = sc.next();
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        String preg5 = sc.next();
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estas tú delante");
        String preg6 = sc.next();
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        String preg7 = sc.next();
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        String preg8 = sc.next();
        System.out.println("9. Has notado que últimamente se perfuma más");
        String preg9 = sc.next();
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        String preg10 = sc.next();
        if ((preg1).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg2).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg3).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg4).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg5).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg6).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg7).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg8).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg9).equals("verdadero")) {
            punt=punt+3;
        }
        if ((preg10).equals("verdadero")) {
            punt=punt+3;
        }
        if (punt>=0 && punt<=10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        else if (punt>=11 && punt<=22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (punt>=22 && punt<=30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        } sc.close();
        }
    }
