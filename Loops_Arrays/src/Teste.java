import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int qtdEntrevistados = 0; 
        int qtdMenorIdade = 0;
        int somaIdades = 0;        
        double porcentagemMenorIdade= 0; 
        double mediaIdade = 0;

        int maisNovo = 999;
        int maisVelho = 0;
        
        
        do {    
            System.out.print("Escreva sua idade: ");
            int idadeInformada = scanner.nextInt();
                
                if (idadeInformada > maisVelho){
                    maisVelho = idadeInformada;
                }
                if (idadeInformada < maisNovo){
                    maisNovo = idadeInformada;
                }
                if (idadeInformada < 18){
                    qtdMenorIdade++;
                }
                somaIdades = somaIdades + idadeInformada;
                qtdEntrevistados++;               

        } while (qtdEntrevistados < 5 );

        porcentagemMenorIdade = (qtdMenorIdade / 5);
        mediaIdade = somaIdades / 5;

        System.out.println("Mais novo: " + maisNovo);
        System.out.println("Mais velho: " + maisVelho);
        System.out.println("Porcentagem de menores de idade: " + porcentagemMenorIdade);
        System.out.println("Média das idades: " + mediaIdade);
        System.out.println(qtdMenorIdade);
    }
        
    }