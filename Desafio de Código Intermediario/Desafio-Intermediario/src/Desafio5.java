import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasNoCamarote = 0;  

        System.out.println("Digite o número de pessoas na fila: ");
        int tamanhoDaFila = scanner.nextInt();

        for (int i = 0; i <= tamanhoDaFila; i++){
            if (i%2 !=0){
                pessoasNoCamarote++;
            }
        }
        System.out.println(pessoasNoCamarote + " " + "pessoas no camarote");

    }

}