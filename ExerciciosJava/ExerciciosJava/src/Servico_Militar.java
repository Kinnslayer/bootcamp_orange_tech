import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Servico_Militar {
    private static char resposta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String sexo = "M";
        int idade;
        int saude;
        char resposta = 'S';
        int counter = 0;
 
        
        while (resposta == 'S' || resposta == 's'){

            
            System.out.println("Qual o seu nome? ");
            nome = scanner.next();

            System.out.println("Qual é o seu sexo? Digite M para masculino e F para Feminino");
            sexo = scanner.nextLine();

            System.out.println("Qual a sua idade? ");
            idade = scanner.nextInt();

            System.out.println("Você está saudável? Digite 1 para sim e 2 para não. ");
            saude = scanner.nextInt();

            if (sexo == "M" && idade >= 18 && saude == 1){
                System.out.println("Você está habilitado para o serviço militar!");
                counter++;
            }
            else System.out.println("Você não está apto(a) ao serviço militar!");

            System.out.println("Você gostaria de continuar registrando? S - Sim / N - não" );
            resposta = scanner.next().charAt(0);
        }
            System.out.println("O total de pessoas alistadas é: " + counter);
    }
}

