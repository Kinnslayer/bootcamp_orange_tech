package Desafios_de_Codigo;
import java.util.Scanner;

public class Desafio_Codigo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantidade de páginas para ser lida: ");
        int paginas = scanner.nextInt();
        
        int paginasLidas = 3;
        int dia = 0;
        
        //Loop para fazer a multiplicação de páginas lidas por dia 
        for (int i = 0; i < paginas; i = i+3){
            dia++;
        }
            System.out.println(dia + " " + "dias");
    }
    
}
