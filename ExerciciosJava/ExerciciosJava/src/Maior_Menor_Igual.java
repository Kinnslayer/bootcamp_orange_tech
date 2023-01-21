import java.util.Scanner;

public class Maior_Menor_Igual {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 20){
            System.out.println("Maior do que 20");           
        }
        else if (numero == 20){
            System.out.println("Igual a 20");
        }
        else System.out.println("Menor do que 20");
    }
}
