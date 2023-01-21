import java.util.Scanner;

public class Prestacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor total da sua compra: ");
        int compra = scanner.nextInt();

        int compraPrestacoes = compra / 5;

        System.out.print("O total das suas parcelas em 5x sem juros é de:"
                         + " " + "R$" + compraPrestacoes );
    }    
}
