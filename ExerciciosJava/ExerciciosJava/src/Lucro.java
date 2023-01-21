import java.util.Scanner;

public class Lucro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        int compra = scanner.nextInt();

        if (compra <= 20){
            System.out.println("Total da sua compra é: " + (compra = (int) (compra + (compra * 0.50))));
        }
        else System.out.println("Total da sua compra é: " + (compra = (int) (compra +  (compra *0.35))));
    }
    
}
