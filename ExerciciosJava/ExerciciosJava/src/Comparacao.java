import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        if (numero > 80){
            System.out.print("O número é maior que 80");
        }
        else if (numero < 25){
            System.out.print("O número é menor que 25");
        }
        else if (numero == 40){
            System.out.print("O número é igual a 40");
        }
    }
}
