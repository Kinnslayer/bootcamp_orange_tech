package Desafios_de_Codigo;
import java.util.Scanner;

public class Desafio_Codigo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comprando 1 doce, você leva 2!");
        System.out.print("Insira o valor: ");
        int dinheiro = scanner.nextInt();
        int doce = 0;

        //Loop para dobrar o número de doces de acordo com o valor de entrada
        for (int i = 0; i < dinheiro; i++){
            doce = doce +2;
        } 
           System.out.println("O cliente obteve" + " " + doce + " " + "doces");
    }
    
}
