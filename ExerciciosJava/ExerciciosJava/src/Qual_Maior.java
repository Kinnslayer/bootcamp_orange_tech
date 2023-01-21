import java.util.Scanner;

public class Qual_Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int numeroDois = scanner.nextInt();
        
        if (numeroUm > numeroDois){
            System.out.print("O número maior é: " + numeroUm);
        } 
        else System.out.print("O número maior é: " + numeroDois);
    }
}
