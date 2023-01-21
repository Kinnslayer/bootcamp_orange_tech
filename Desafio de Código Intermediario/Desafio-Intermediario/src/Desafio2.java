import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a velocidade:");
        int velocidade = scanner.nextInt();
        
        System.out.println("Digite a quantidade de multas:");
        int multas = scanner.nextInt();

        if (velocidade <= 80){
            System.out.println(multas + "multas.Nao levou pontos na carteira");
        }
        else if (velocidade > 80 && multas < 2){
            System.out.println(multas + 1 + "multas.Nao levou pontos na carteira");
        }
        else {
            System.out.println(multas + 1 + "multas.Levou pontos na carteira");
        }

          
         
    }
}
