package io.github.lucasaraujodecarvalho.agendaapi;

import io.github.lucasaraujodecarvalho.agendaapi.entity.Contato;
import io.github.lucasaraujodecarvalho.agendaapi.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {

	@Autowired
	private ContatoRepository repository;

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Fulano");
			contato.setEmail("fulano@email.com");
			contato.setFavorito(false);
			repository.save(contato);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
