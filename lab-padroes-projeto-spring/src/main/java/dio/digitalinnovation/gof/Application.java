package dio.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os segyuintes módulos foram selecionados
 * - Spriong Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author evandrojr
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
