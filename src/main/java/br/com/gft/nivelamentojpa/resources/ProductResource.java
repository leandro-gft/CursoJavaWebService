package br.com.gft.nivelamentojpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gft.nivelamentojpa.entities.Product;
import br.com.gft.nivelamentojpa.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping
	public ResponseEntity<List <Product>> findAll() {
		List <Product> list = ps.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id) {
		Product product = ps.findById(id);
		return ResponseEntity.ok().body(product);
	} 
	
}
