package Desafios_de_Codigo;
import java.util.Scanner;

public class Desafio_Codigo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Insira a porcentagem do download em um número de 1 a 10: ");
        int tamanho = scanner.nextInt();
        
        //Loop para gerar o resultado de acordo com o valor de entrada
        for (int i = 1; i <= tamanho; i++){
            System.out.print("/");   
        }            
         
        }
        
    }
    

