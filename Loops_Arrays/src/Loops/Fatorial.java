package Loops;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número fatorial desejado: ");
        int fatorial = scanner.nextInt();

        int mult = 1;

        System.out.print("O fatorial é: " + fatorial + "! = ");
        for (int i = fatorial; i >= 1 ; i--){
            mult = mult * i;
        } 
        
        System.out.println(mult);
    }
}
