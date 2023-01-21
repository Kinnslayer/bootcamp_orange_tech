import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do vendedor: ");
        String nomeVendedor = scanner.next();
        System.out.print("Insira o salário fixo por mês: ");
        int salarioFixo = scanner.nextInt();
        System.out.print("Insira o total de vendas no mês: ");
        int totalVendas = scanner.nextInt();

        int salarioComComissao = (int) (salarioFixo + (totalVendas * 0.15));

        System.out.println("O vendedor" + " " + nomeVendedor + " " + "tem o salario fixo de"
                     + " " + "R$" + salarioFixo + " " + "e com comissão fica" + "R$" + salarioComComissao);
    }
    
}
