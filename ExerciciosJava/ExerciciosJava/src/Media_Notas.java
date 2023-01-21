import java.util.Locale;
import java.util.Scanner;

public class Media_Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Insira as três notas do aluno");
        float primeiraNota = scanner.nextFloat();
        float segundaNota = scanner.nextFloat();
        float terceiraNota = scanner.nextFloat();

        float mediaNotas = (primeiraNota + segundaNota + terceiraNota) /3;

        if (mediaNotas >= 7){
            System.out.print("Você foi aprovado com uma média de: " + mediaNotas);
        }
        else if (mediaNotas <= 5){ 
            System.out.print("Você foi reprovado com uma média de: " + mediaNotas);
        }   
        else if (mediaNotas >= 5.1 && mediaNotas <= 6.9){
            System.out.print("Você está de recuperação com uma média de: " + mediaNotas);
        }
        else System.out.print("Insira uma nota válida!");
    }
}
