package edu.mfvp.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import edu.mfvp.course.entities.User;
import edu.mfvp.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	//tudo que estiver dentro do método run é executado quando a aplicação é inicializada
	@Override
	public void run(String... args) throws Exception {
		
		User u1 =  new User(null, "Maria Brown", "maria@gmail.com", "98877666", "123456");
		User u2 =  new User(null, "Matheus Vieira", "matheus@gmail.com", "99989999", "1234");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
