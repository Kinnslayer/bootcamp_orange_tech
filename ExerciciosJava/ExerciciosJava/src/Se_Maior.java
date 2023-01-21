import java.util.Scanner;

public class Se_Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número aleatório: ");
        int numero = scanner.nextInt();

        if(numero > 10){
            System.out.print("Parabéns! Esse número é maior que 10!");
        }
        else System.out.print("Esse número não é maior que 10!");
    }
}
