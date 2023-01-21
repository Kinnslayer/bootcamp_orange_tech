import java.util.Scanner;

public class Graus {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura em graus Celsius: ");
        int tempCelsius = scanner.nextInt();

        int tempFahrenheit = ((9 * tempCelsius) + 160) / 5;

        System.out.print("A conversão de Celsius para Fahrenheit é: " + tempFahrenheit);

    }
}
