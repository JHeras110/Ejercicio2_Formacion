package com.example.cursoscliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Aplicacion que se conecta a una BBDD a traves de un controller y unos services con 2 modelos para 
 * la transferencia de datos
 * 
 * @author Javier 
 * 
 * @see com.example.controller
 * @see com.example.dto
 * @see com.example.model
 * @see com.example.services
 * 
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = { "com.example.controller", "com.example.services" })
public class CursosclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosclienteApplication.class, args);
	}

	/**
	 * Confituramos la clase RestTemplate con @Bean para poder usarla en EjemplarServiceImpl
	 */
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
