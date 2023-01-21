import java.util.Locale;
import java.util.Scanner;

public class Venda_Automovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Insira o custo de fábrica do automóvel: ");
        double custoFabricaAuto = scanner.nextDouble();
        double porcDistribuidor = 0.28d;
        double porcImpostos = 0.45d;

        double custoImposto = (custoFabricaAuto + (custoFabricaAuto * porcImpostos));
        double custoFinalVenda = (custoImposto + (custoImposto * porcDistribuidor));

        System.out.print("O custo final para venda ao consumidor é de: " + "R$" + custoFinalVenda);
    }
}
