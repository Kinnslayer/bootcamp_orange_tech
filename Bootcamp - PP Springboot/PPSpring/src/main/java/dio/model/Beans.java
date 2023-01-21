package dio.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Cavalo cavalo(){
        System.out.println("Criando um registro do cavalo...");
        Cavalo cavalo = new Cavalo();
        cavalo.setCor("Preto");
        cavalo.setPorte("Grande");
        cavalo.setRaca("Lusitano");
        cavalo.setValor(60000);
        return cavalo;
    }
}
