package Loops;
import java.util.Scanner;

public class Ordem_Inversa {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Programa de como fazer a impressão de um array invertido
        int[] vetor = {13, 15, 6, 8, 10};
        
        System.out.print("Vetor: ");
        int counter = 0;

        while (counter <= vetor.length -1) {
            System.out.print(vetor[counter] + " ");
            counter++;
         }
    
         System.out.print("\nVetor inverso: ");
         for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
         }
   } 
   
}
