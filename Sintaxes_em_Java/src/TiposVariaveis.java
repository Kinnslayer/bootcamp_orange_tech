import java.util.Scanner;

public class TiposVariaveis {

    public static void main (String [] args) {
        //Criando o Scanner para o usuário poder inputar os dados.
        Scanner scanner = new Scanner(System.in);

     //Insira as notas que deseja obter a média.
       System.out.println("Digite a primeira nota");
       double primeiraNota = scanner.nextDouble();

       System.out.println("Digite a segunda nota");
       double segundaNota = scanner.nextDouble();

       System.out.println("Digite a terceira nota");
       double terceiraNota = scanner.nextDouble();

       System.out.println("Digite a quarta nota");
       double quartaNota = scanner.nextDouble();

       System.out.println("Digite a quinta nota");
       double quintaNota = scanner.nextDouble();
       
       String mediaFinal = mediaFinal(primeiraNota, segundaNota, terceiraNota, quartaNota, quintaNota);
        
       System.out.println(mediaFinal);   
    }
     
    public static String mediaFinal (double primeiraNota, double segundaNota, double terceiraNota, double quartaNota, double quintaNota) {
        return "A média final é : " + (primeiraNota + segundaNota + terceiraNota + quartaNota + quintaNota) / 5 ;

 
    }

    
}
