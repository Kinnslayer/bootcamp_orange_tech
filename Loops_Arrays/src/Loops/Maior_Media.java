package Loops;
import java.util.Scanner;

public class Maior_Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma  = 0;
        int maior = 0;

        int counter = 0;

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            counter++;
        } while (counter < 5 );

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
