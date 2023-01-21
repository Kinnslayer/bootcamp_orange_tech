import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12 correspondendo ao mês do ano:");
        int mes = scanner.nextInt();

        if (mes == 1){
            System.out.print("Janeiro!");
        }
        else if (mes == 2){
            System.out.print("Fevereiro!");
        }
        else if (mes == 3){
            System.out.print("Março!");
        }
        else if (mes == 4){
            System.out.print("Abril!");
        }
        else if (mes == 5){
            System.out.print("Maio!");
        }
        else if (mes == 6){
            System.out.print("Junho!");
        }
        else if (mes == 7){
            System.out.print("Julho!");
        }
        else if (mes == 8){
            System.out.print("Agosto!");
        }
        else if (mes == 9){
            System.out.print("Setembro!");
        }
        else if (mes == 10){
            System.out.print("Outubro!");
        }
        else if (mes == 11){
            System.out.print("Novembro!");
        }
        else if (mes == 12){
            System.out.print("Dezembro!");
        }
        else System.out.print("Mês inválido!");
        
        

    }
}
