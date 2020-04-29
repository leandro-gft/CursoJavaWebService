package br.com.gft.nivelamentojpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.gft.nivelamentojpa.entities.Order;
import br.com.gft.nivelamentojpa.entities.User;
import br.com.gft.nivelamentojpa.entities.enums.OrderStatus;
import br.com.gft.nivelamentojpa.repositories.OrderRepository;
import br.com.gft.nivelamentojpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository ur;

	@Autowired
	private OrderRepository or;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		User p1 = new User(null, "Carlos da Silva", "carlos@gmail.com", "(11)99999-9999", "123456");
		User p2 = new User(null, "Joaquim Torres", "joaquim@gmail.com", "(11)99999-8888", "456789");
		User p3 = new User(null, "Ana Maria", "ana@gmail.com", "(11)99999-7777", "789123");

		
		Order o1 = new Order(null, Instant.parse("2020-04-29T11:33:00Z"), OrderStatus.PAID, p1);
		Order o2 = new Order(null, Instant.parse("2020-04-28T19:00:00Z"), OrderStatus.DELIVERED, p2);
		Order o3 = new Order(null, Instant.parse("2020-04-27T10:30:00Z"), OrderStatus.WAITING_PAYMENT, p3);
		
		ur.saveAll(Arrays.asList(p1, p2, p3));
		or.saveAll(Arrays.asList(o1, o2, o3));

	}
}
