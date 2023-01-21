package main.designpatterns.prototype;

import java.util.Scanner;

public class PrototypeTeste {
       
        public static void main(String[] args) {
            //Testes do padrão de projeto Prototype
            
            Animal animal1 = new Animal();
            animal1.getNome();
            animal1.setCor("Marrom");
            animal1.setPorte("Grande");
            animal1.setRaca("Árabe");
            animal1.setValor(20000);

            //Fazendo um clone do animal1
            Animal animal2 = (Animal) animal1.clone();

            //Printando os valores antes das mudanças do objeto clonado
            System.out.println("=== Antes de mudar os atributos do clone ===");
            System.out.println("Animal1 - " + animal1.getNome() + " " 
            + animal1.getCor() + " " + animal1.getPorte() + " " + animal1.getRaca()
            + " " + "R$" + animal1.getValor());
            System.out.println("Animal2 - " + animal2.getNome() + " " 
            + animal2.getCor() + " " + animal2.getPorte() + " " + animal2.getRaca()
            + " " + "R$" + animal2.getValor());
            
            //Fazendo o update dos atributos ao clone
            animal2.getNome();
            animal2.setCor("Branco");
            animal2.setPorte("Médio");
            animal2.setRaca("Percheron");
            animal2.setValor(40000);

            //Verificando o estado dos dois objetos e vendo que o objeto original está inalterado
            System.out.println("=== Depois de mudar os atributos do clone ===");
            System.out.println("Animal1 - " + animal1.getNome() + " " 
            + animal1.getCor() + " " + animal1.getPorte() + " " + animal1.getRaca()
            + " " + "R$" + animal1.getValor());
            System.out.println("Animal2 - " + animal2.getNome() + " " 
            + animal2.getCor() + " " + animal2.getPorte() + " " + animal2.getRaca()
            + " " + "R$" + animal2.getValor());

            //Aplicando mais um exemplo
            System.out.println("=== Outro registro de animal ===");
            Animal animal3 = (Animal) animal1.clone();
            animal3.getNome();
            animal3.setCor("Branco");
            animal3.setPorte("Grande");
            animal3.setRaca("Lusitano");
            animal3.setValor(60000);

            System.out.println("Animal3 - " + animal3.getNome() + " " 
            + animal3.getCor() + " " + animal3.getPorte() + " " + animal3.getRaca()
            + " " + "R$" + animal3.getValor());

        }

   
    




}