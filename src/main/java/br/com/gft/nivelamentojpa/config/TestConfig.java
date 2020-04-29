package br.com.gft.nivelamentojpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.gft.nivelamentojpa.entities.Order;
import br.com.gft.nivelamentojpa.entities.User;
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

		

	}
}
