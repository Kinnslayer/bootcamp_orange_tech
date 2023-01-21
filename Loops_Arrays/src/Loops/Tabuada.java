package Loops;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da tabuada requerida: ");
        int tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "X" + i + "=" + (tabuada*i));
        }
    }
    
}
