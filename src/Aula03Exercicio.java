import java.util.Locale;
import java.util.Scanner;

public class Aula03Exercicio {
    public static void main(String[] args) {
       //exercicio1
        /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        Entrada: 10 e 30 Saida: SOMA =40
        Entrada: -30 e 10 Saida: SOMA =-20
        Entrada: 0 e 0 Saida: SOMA =0*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

/*
        int num1, num2, soma;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);
*/
        //EXERCICIO 02
/*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
*/

/*
        double R, A, pi = 3.14159;

        R = sc.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);
*/

        //EXERCICIO 03
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
        int A, B, C, D, dif;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        dif = A * B - C * D;

        System.out.println("DIFERENCA = " + dif);


        sc.close();
    }
}
