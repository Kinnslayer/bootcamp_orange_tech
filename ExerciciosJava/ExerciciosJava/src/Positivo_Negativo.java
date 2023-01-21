import java.util.Scanner;

public class Positivo_Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Insira um número aleatório: ");
            int numero = scanner.nextInt();
            
            if(numero > 0){
                System.out.println("Número positivo!");
            }
            else if(numero < 0){
                System.out.println("Número negativo!");
            }
            else System.out.println("Número zero!");
        }
    }
}
