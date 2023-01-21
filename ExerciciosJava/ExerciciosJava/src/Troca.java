import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor para A: ");
        int varA = scanner.nextInt();
        System.out.print("Insira um valor para B: ");
        int varB = scanner.nextInt();

        int varC;

        varC = varA;
        varA = varB;
        varB = varC;

        System.out.println("Valor trocado de A:" + varA);
        System.out.print("Valor trocado de B:" + varB);



    }
}
