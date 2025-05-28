import java.util.Scanner;
import static java.util.Locale.US;

// Aula 02 - Entrada de Dados
public class Aula02EntradaDados {
    public static void main(String[] args) {
        // Locale.setDefault(US); // EM CASO DAS PESSOAS DIGITAREM COM PONTO (.)
        Scanner sc = new Scanner(System.in);

        // para STRING
        /*
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        */

        // para números INT
        /*
        int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);
        */

        // para double
        /*
        double x;
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);
        */

        // para char
        /*
        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);
        */

        // Agora lendo vários dados na mesma linha
        String a;
        int b;
        double c;
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println("Você digitou: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
