package Desafios_de_Codigo;
import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Desafio_Codigo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para não ser multado, sua velocidade tem que estar abaixo de 68km/h");
        System.out.print("Digite a velocidade: ");
        int velocidadeAtual = scanner.nextInt();

        //Loop para verificar se o carro está acima da velocidade permitida
        if (velocidadeAtual >= 68){
            System.out.println("Foi multado");
        }    
            else System.out.println("Nao foi multado");
    
    }
    
}
