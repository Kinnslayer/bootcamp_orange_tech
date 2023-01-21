import java.util.Scanner;

public class Igual_Diferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        if (numeroUm == numeroDois){
            System.out.print("Os números são iguais!!");
        }
        else System.out.print("Os números são diferentes!!");
    }
    
}
