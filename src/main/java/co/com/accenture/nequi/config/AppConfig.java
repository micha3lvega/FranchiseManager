package co.com.accenture.nequi.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	ModelMapper mapper() {
		return new ModelMapper(); // Inicializa el modelo de mapeo
	}

}
