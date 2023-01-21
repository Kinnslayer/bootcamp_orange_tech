import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo:");
        String arquivoDoPC = scanner.next();

        int index = arquivoDoPC.indexOf(".mp3");
    
        if (index != -1){   
            System.out.println("Salvar");
        } else System.out.println("Deletar");
        


    }
}