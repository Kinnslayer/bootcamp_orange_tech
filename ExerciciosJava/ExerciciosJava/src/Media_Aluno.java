import java.util.Scanner;

public class Media_Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o nome do Aluno: ");
        String nomeAluno = scanner.next();
        System.out.print("Insira a primeira nota: ");
        int primeiraNota = scanner.nextInt();
        System.out.print("Insira a segunda nota: ");
        int segundaNota = scanner.nextInt();
        System.out.print("Insira a terceira nota: ");
        int terceiraNota = scanner.nextInt();

        int mediaNotas = (primeiraNota + segundaNota + terceiraNota) /3;

        System.out.print("O aluno" + " " + nomeAluno + " " + "finalizou com a média de "
                         + " " + mediaNotas);
    }
    
}
