import java.util.Scanner;

import javafx.scene.paint.Stop;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String array[] = scanner.next().split("/");

        System.out.printf("Imovel: %s R$%s %s", array[0], array[1], array[2]);
    }
}
