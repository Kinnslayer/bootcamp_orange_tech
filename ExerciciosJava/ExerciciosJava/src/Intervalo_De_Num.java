import java.util.Scanner;

public class Intervalo_De_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número aleatório: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200){
            System.out.print("Esse número está no intervalo entre 100 e 200!");
        }
        else System.out.print("Esse número não está no intervalo de 100 e 200!!");
    }
}
