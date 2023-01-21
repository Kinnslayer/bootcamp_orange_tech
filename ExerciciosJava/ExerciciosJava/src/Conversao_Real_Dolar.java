import java.util.Locale;
import java.util.Scanner;

public class Conversao_Real_Dolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Insira o valor da cotação do Dolar: ");
        float cotacaoDolar = scanner.nextFloat();
        System.out.print("Insira a quantidade de Dolar disponível: ");
        float dolarDisponivel = scanner.nextFloat();

        float conversaoReal = dolarDisponivel * cotacaoDolar;

        System.out.print("A conversão para real é de R$ " + conversaoReal);
    }
}
