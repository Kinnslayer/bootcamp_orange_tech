package main.designpatterns.proxy;

import java.util.Scanner;

public class ProxyTeste {

    // RealSubject / Implementação - RegistroAnimal
    // Proxy - LazyRegistroAnimal
    // Subject - Interface

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    IRegistroAnimal registroAnimal = new LazyRegistroAnimal();
    ServicoBusca servicoBusca = new ServicoBusca(registroAnimal);
    System.out.println("Serviço de busca criado.");    
    //   servicoBusca.buscarAnimal(1);
    //   servicoBusca.buscarAnimal(2); 
    //   servicoBusca.buscarAnimal(3);        
    }

    @Override
    public String toString() {
        return "ProxyTeste []";
    }

}

class ServicoBusca {

    private IRegistroAnimal registroAnimal;

    public ServicoBusca(IRegistroAnimal registroAnimal){
            this.registroAnimal = registroAnimal;
    }

        public Object buscarAnimal(long id){
            return registroAnimal.find(id);
    }
}

    

interface IRegistroAnimal {
    Object find(long id);
}
    
class RegistroAnimal implements IRegistroAnimal{

    public RegistroAnimal() {
        System.out.println("Criando conexão com o banco.");
        simulaTempoAlto();
    }

    public Object find(long id) {
        // Busca o animal e retorna
        simulaTempoAlto();
        return new Object();
    }

    private void simulaTempoAlto() {
        try {
            // Cria a conexão com o banco
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     }       
        
}


class LazyRegistroAnimal implements IRegistroAnimal {

    private IRegistroAnimal regReal;

    @Override
    public Object find(long id) {
        inicializaReg();
        return regReal.find(id);
    }


    private void inicializaReg() {
        if (regReal == null) {
            regReal = new RegistroAnimal();
        }
    }

}