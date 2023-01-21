import java.util.Scanner;

public class Soma_Simples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        int resultado = numeroUm + numeroDois;
        System.out.print("A soma dos dois números é: " + resultado);
    }
}
