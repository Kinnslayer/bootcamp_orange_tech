import java.util.Scanner;

public class Numero_Extenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();

        if (numero == 1){
            System.out.print("Número um");
        }
        else if (numero == 2){
            System.out.print("Número dois");
        }
        else if (numero == 3){
            System.out.print("Número três");
        }
        else if (numero == 4){
            System.out.print("Número quatro");
        }
        else if (numero == 5){
            System.out.print("Número cinco");
        }
        else System.out.print("Número inválido!!");
        }
    }

