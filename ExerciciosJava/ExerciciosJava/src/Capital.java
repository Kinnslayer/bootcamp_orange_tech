import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a capital do Brasil? ");
        String resposta = scanner.next();
        String brasilia;

        while (resposta == brasilia){
            System.out.println("Resposta errada, tente novamente");
            System.out.println("Qual é a capital do Brasil? ");
            resposta = scanner.next();
        }
            System.out.println("Parabéns! Não fez mais que a obrigação.");
    }
    
}
