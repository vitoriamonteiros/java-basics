import java.util.Locale;

public class Aula01Exercicio {
    public static void main(String[] args) {

// EXERCICIO DE FIXAÇÃO

/*        Products:
        Computer, which price is $ 2100,00
        Office desk, which price is $ 650,50

        Record:30 years old, code 5290 and gender: F

        Measue eight decimal places: 53,234567
        Rouded (three decimal places): 53,235
        US decimal point: 53.235
        Process finished with exit code 0
    */

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender= 'F';

        double price1 = 2100.0;
        double price2 =650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, which price is $ %.2f %n%s, which price is $ %.2f%n%n", product1, price1,product2,price2);
        System.out.printf("Record:%d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measue eight decimal places: %.6f %nRouded (three decimal places): %.3f %n",measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
