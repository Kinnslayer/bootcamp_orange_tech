package Loops;
import java.util.Scanner;

public class Nome_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Se o usuário for maior de idade ele pode entrar
        String nome;
        int idade;

            System.out.println("====Bem vindo a auto escola Java====");
            
            System.out.println("Nome: ");
            nome = scanner.next();
                               
            System.out.println("Idade: ");
            idade = scanner.nextInt();
            
            while(idade < 18) {
            System.out.println("Você não pode entrar!"); break;              
            }
              

        }

            
        
    }
    

