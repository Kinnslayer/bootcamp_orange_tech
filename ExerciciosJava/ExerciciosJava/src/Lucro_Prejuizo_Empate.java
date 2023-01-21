import java.util.Scanner;

public class Lucro_Prejuizo_Empate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        int precoCusto = scanner.nextInt();

        System.out.print("Digite o preço de venda: ");
        int precoVenda = scanner.nextInt();

        int mediaPrecoCusto = 0;
        int mediaPrecoVenda = 0;

        int i = 0;

        for (; i <= 3 ; i++){          

            if (precoCusto > precoVenda){
                System.out.println("Prejuízo");
            }

            else if (precoCusto < precoVenda){
                System.out.println("Lucro");
            }

            else if (precoCusto == precoVenda){
                System.out.println("Empate");
            }
            
        }
        System.out.println("A média de preço de custo é: " + (precoCusto * i) / i);
        System.out.println("A média do preço de venda é: " + (precoVenda * i) / i);
    }
}
