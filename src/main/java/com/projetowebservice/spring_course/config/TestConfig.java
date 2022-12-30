package com.projetowebservice.spring_course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetowebservice.spring_course.entities.User;
import com.projetowebservice.spring_course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{//executa quando o programa for iniciado {

	
	//resolver dependencia
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User firstUser = new User(null, "joao", "joao@gmail.com", "(21)99876-2513", "jjaumfs12");
		User secondUser = new User(null, "pedro", "pedro@gmail.com", "(21)99999-9999", "123456");
	
		userRepository.saveAll(Arrays.asList(firstUser, secondUser));
	}
		
}
