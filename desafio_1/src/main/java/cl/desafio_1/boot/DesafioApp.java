package cl.desafio_1.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cl.desafio_1.service.GrupoFechaService;

/**
 * Clase principal
 * @author AndresCidBenitez
*/

@SpringBootApplication
@ComponentScan("cl.desafio_1")
public class DesafioApp {
	@Autowired
	GrupoFechaService fechaService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DesafioApp.class, args);
	}
}
