import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        while (numero < 30 ||  numero > 90) { 
            System.out.println("Número Inválido!");
            System.out.print("Digite um número:");
            numero = scanner.nextInt();                     
        }
        
        System.out.println("Seu número é" + " " + numero);       
        
    }
    
}
