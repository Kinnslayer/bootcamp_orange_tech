import java.util.Scanner;

public class Quatro_Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        int soma = numeroUm + numeroDois;
        int subtracao = numeroUm - numeroDois;
        int divisao = numeroUm / numeroDois;
        int multiplicacao = numeroUm * numeroDois;
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A divisão dos dois números é: " + divisao);
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
    }
}
