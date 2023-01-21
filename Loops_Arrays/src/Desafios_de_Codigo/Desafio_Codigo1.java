package Desafios_de_Codigo;
import java.util.Scanner;

public class Desafio_Codigo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos meses você pretende poupar? ");
        int entrada = scanner.nextInt();
        
        int mesada = 50;
        int resultado = 0;
        int contador = 0;       
        
        //Loop para multiplicar a mesada em razão do valor de entrada.
        for(int i = entrada; i <= entrada; i++){
            resultado = (mesada * entrada);
            contador++;       
        }
        System.out.println("A mesada de acordo com o tempo de poupança é de: " + resultado + " " + "reais");
        
    }
    
}
