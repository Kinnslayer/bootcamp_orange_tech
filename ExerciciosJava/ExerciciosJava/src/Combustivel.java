import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a distância percorrida: ");
        int kmPercorrido = scanner.nextInt();
        System.out.print("Insira o combustível gasto: ");
        int combustivelGasto = scanner.nextInt();

        int consumoMedio = kmPercorrido / combustivelGasto;
        System.out.print("O consumo médio do automóvel é: " + consumoMedio + "km/litro");
    }
    
}
