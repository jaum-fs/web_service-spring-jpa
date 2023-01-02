package com.projetowebservice.spring_course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetowebservice.spring_course.entities.Order;
import com.projetowebservice.spring_course.entities.User;
import com.projetowebservice.spring_course.entities.enums.OrderStatus;
import com.projetowebservice.spring_course.repositories.OrderRepository;
import com.projetowebservice.spring_course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{//executa quando o programa for iniciado {

	
	//resolver dependencia
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository oR;

	@Override
	public void run(String... args) throws Exception {
	
		User firstUser = new User(null, "joao", "joao@gmail.com", "(21)99876-2513", "jjaumfs12");
		User secondUser = new User(null, "pedro", "pedro@gmail.com", "(21)99999-9999", "123456");
	
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID ,firstUser);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT ,secondUser);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID ,firstUser); 
		
		userRepository.saveAll(Arrays.asList(firstUser, secondUser));
		oR.saveAll(Arrays.asList(o1,o2,o3));
	}
		
}
