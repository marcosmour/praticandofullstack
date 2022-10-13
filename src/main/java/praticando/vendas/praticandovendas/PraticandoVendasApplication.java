package praticando.vendas.praticandovendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PraticandoVendasApplication {
	
	@GetMapping("/hello/{nome}")
	public String hello(@PathVariable String nome) {
		return "Hello " + nome;
	}

	public static void main(String[] args) {
		SpringApplication.run(PraticandoVendasApplication.class, args);
	}

}
