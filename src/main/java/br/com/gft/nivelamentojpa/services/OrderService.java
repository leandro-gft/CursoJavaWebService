package br.com.gft.nivelamentojpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gft.nivelamentojpa.entities.Order;
import br.com.gft.nivelamentojpa.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository ur;
	
	public List<Order> findAll(){
		return ur.findAll();
	}
	
	public Order findById(Integer id) {
		return ur.findById(id).get();
	}
}
