package dio.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PpSpringApp {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoSpringApplication.class, args);
	}
	
	public CommandLineRunner run(SistemaRegistro sistema) throws Exception {
		return args -> {
			sistema.enviarRegistroLusitano();
			sistema.enviarRegistroPercheron();
			sistema.enviarRegistroFriesian();
		};
	}
}
