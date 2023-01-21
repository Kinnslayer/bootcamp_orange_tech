import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu salário: ");
        int salario = scanner.nextInt();

        if (salario <= 600){
            System.out.print("Seu salário é: " + salario);
        }
        else if (salario <= 1200){
            System.out.print("Seu salário é: " + (salario - (salario * 0.20)));
        }
        else if (salario <= 2000){
            System.out.print("Seu salário é: " + (salario - (salario * 0.25)));
        }
        else{
            System.out.print("Seu salário é: " + (salario - (salario * 0.30)));
        } 
            
        }
    }
    

