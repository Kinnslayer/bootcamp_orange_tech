import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os ingredientes: ");
        String listaIngredientes[] = scanner.next().split(";");


        System.out.printf("\n%s \n%s \n%s \n%s", listaIngredientes[0], 
        listaIngredientes[1], listaIngredientes[2], listaIngredientes[3]);
    }
}
