import java.util.Scanner;

public class Aula03Exercicio {
    public static void main(String[] args) {
       //exercicio1
        /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        Entrada: 10 e 30 Saida: SOMA =40
        Entrada: -30 e 10 Saida: SOMA =-20
        Entrada: 0 e 0 Saida: SOMA =0*/

        Scanner sc = new Scanner(System.in);

        int x, b;

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();


    }
}
