import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String resposta;
        String senha;
        
        System.out.println("=====Bem vindos a charada Java=====");
        System.out.println("Informe a senha: "); 
        senha = scanner.next();
        
        do{            
            System.out.println("Digite o código para sair do programa: ");
            resposta = scanner.next();
            
        } while (resposta == senha);
        
    }
}
