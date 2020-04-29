package br.com.gft.nivelamentojpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gft.nivelamentojpa.entities.Product;
import br.com.gft.nivelamentojpa.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pr;
	
	public List<Product> findAll(){
		return pr.findAll();
	}
	
	public Product findById(Integer id) {
		return pr.findById(id).get();
	}
}
