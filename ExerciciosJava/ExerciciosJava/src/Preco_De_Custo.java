import java.util.Locale;
import java.util.Scanner;

public class Preco_De_Custo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Insira o preço de custo do produto: ");
        float precoCusto = scanner.nextFloat();
        System.out.print("Insira o valor de acréscimo percentual ao produto: ");
        float precoAcrescimo = scanner.nextFloat();

        float precoVenda = (float) precoCusto + (precoCusto * (precoAcrescimo / 100));

        System.out.print("Valor de venda final é de: " + "R$" + precoVenda);
    }
    
}
