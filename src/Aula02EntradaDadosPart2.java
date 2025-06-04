import java.util.Scanner;

public class Aula02EntradaDadosPart2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1,s2,s3;

        s1 = sc.nextLine(); // frase completa
        s2 = sc.next(); // apenas a primeira palavra
        sc.nextLine(); //compensar a quebra de linha anterior
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
