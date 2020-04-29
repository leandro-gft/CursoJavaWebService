package br.com.gft.nivelamentojpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gft.nivelamentojpa.entities.Order;
import br.com.gft.nivelamentojpa.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService os;
	
	@GetMapping
	public ResponseEntity<List <Order>> findAll() {
		List <Order> list = os.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id) {
		Order order = os.findById(id);
		return ResponseEntity.ok().body(order);
	} 
	
}
