import java.util.Scanner;

public class Desconto_Automovel {
    public static void menu() {
        System.out.println("Escolha o tipo do seu veículo");
        System.out.println("1 - Álcool");      
        System.out.println("2 - Gasolina");       
        System.out.println("3 - Diesel");  
    }

    public static void alcool() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você escolheu o automóvel a álcool!");
        System.out.println("Qual é o custo total do veículo?" );
        int custoVeiculo = scanner.nextInt();
        int custoVeiculoDesconto = (int) (custoVeiculo - (custoVeiculo * 0.25));
        System.out.println("O valor do seu veículo com desconto é: " + "R$" + custoVeiculoDesconto);
    }

    public static void gasolina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você escolheu o automóvel a gasolina!");
        System.out.println("Qual é o custo total do veículo?" );
        int custoVeiculo = scanner.nextInt();
        int custoVeiculoDesconto = (int) (custoVeiculo - (custoVeiculo * 0.21));
        System.out.println("O valor do seu veículo com desconto é: " + "R$" + custoVeiculoDesconto);
    }

    public static void diesel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você escolheu o automóvel a diesel!");
        System.out.println("Qual é o custo total do veículo?" );
        int custoVeiculo = scanner.nextInt();
        int custoVeiculoDesconto = (int) (custoVeiculo - (custoVeiculo * 0.14));
        System.out.println("O valor do seu veículo com desconto é: " + "R$" + custoVeiculoDesconto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            menu();
            opcao = scanner.nextInt();

            switch(opcao){
            
            case 1:
                alcool();
                break;
                  
            case 2:
                gasolina();
                break;
            
            case 3:
                diesel();
                break;
               
            default:
                System.out.println("Opção inválida.");    
              }
        } while (opcao != 0);

     }
    
}



   
                
                
        

        


