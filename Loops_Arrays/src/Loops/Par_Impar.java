package Loops;
import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        int qntdNumeros;
        int numeros;
        int numPar = 0; 
        int numImpar = 0;
        int counter = 0;

        System.out.println("Insira o conjunto de números para análise: ");
        qntdNumeros = scanner.nextInt();

        do {
            System.out.println("Insira os números:");
            numeros = scanner.nextInt();

            if (numeros % 2 == 0 ) numPar++;
            else numImpar++;

            counter++;

        } while (counter < qntdNumeros);

        System.out.println("O número de Pares: " + numPar);
        System.out.println("O número de Impares " + numImpar);
    }

}