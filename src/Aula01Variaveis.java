import java.util.Locale;

public class Aula01Variaveis {
    public static void main(String[] args) {
        System.out.print("Hello!");
        System.out.print("Hello!");
        System.out.println("Hello!"); // acrescentar "ln" para quebrar linha
        System.out.println("Hello!");
        System.out.println("Hello!");

        int y = 3;
        double v = 10.687978987;
        System.out.println(y);
        System.out.println(v);
        System.out.printf("%.2f%n", v); //limitar quantas casa decimais
        System.out.printf("%.4f%n", v);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", v);

        System.out.printf("RESULTADO = " + v + "METROS");
        System.out.printf("RESULTADO = %2f METROS%n ", v );
        System.out.printf("RESULTADO = %2f METROS%n ", v );

        //concatenando
        String nome = "Vi";
        int idade = 31;
        double renda = 29500.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }

}
