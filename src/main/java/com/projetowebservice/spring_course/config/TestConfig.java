package com.projetowebservice.spring_course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetowebservice.spring_course.entities.Category;
import com.projetowebservice.spring_course.entities.Order;
import com.projetowebservice.spring_course.entities.Product;
import com.projetowebservice.spring_course.entities.User;
import com.projetowebservice.spring_course.entities.enums.OrderStatus;
import com.projetowebservice.spring_course.repositories.CategoryRepository;
import com.projetowebservice.spring_course.repositories.OrderRepository;
import com.projetowebservice.spring_course.repositories.ProductRepository;
import com.projetowebservice.spring_course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{//executa quando o programa for iniciado {

	
	//resolver dependencia
	@Autowired
	private UserRepository uR;
	
	@Autowired
	private OrderRepository oR;
	
	@Autowired
	private CategoryRepository cR;

	@Autowired
	private ProductRepository pR;
	
	@Override
	public void run(String... args) throws Exception {
	
		User firstUser = new User(null, "joao", "joao@gmail.com", "(21)99876-2513", "jjaumfs12");
		User secondUser = new User(null, "pedro", "pedro@gmail.com", "(21)99999-9999", "123456");
	
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID ,firstUser);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT ,secondUser);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID ,firstUser); 
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		uR.saveAll(Arrays.asList(firstUser, secondUser));
		oR.saveAll(Arrays.asList(o1,o2,o3));
		cR.saveAll(Arrays.asList(cat1,cat2,cat3));
		pR.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
	}
		
}
