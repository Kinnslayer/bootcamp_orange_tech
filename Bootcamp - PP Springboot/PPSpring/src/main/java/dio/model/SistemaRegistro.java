package dio.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaRegistro {
    @Autowired
    private Cavalo lusitano;
    @Autowired
    private Cavalo percheron;
    @Autowired
    private Cavalo friesian;

    public void enviarRegistroLusitano(){
        System.out.println(lusitano);
        System.out.println("Registro feito com sucesso.");
    }    

    public void enviarRegistroPercheron(){
        percheron.setPorte("Grande");
        percheron.setCor("Cinza");
        percheron.setRaca("Percheron");
        percheron.setValor(80000);
        System.out.println(percheron);
        System.out.println("Registro feito com sucesso");

    }

    public void enviarRegistroFriesian(){
        friesian.setPorte("Médio");
        friesian.setCor("Preto");
        friesian.setRaca("Friesian");
        friesian.setValor(130000);
        System.out.println(friesian);
        System.out.println("Registro feito com sucesso");

    }   
    
}
