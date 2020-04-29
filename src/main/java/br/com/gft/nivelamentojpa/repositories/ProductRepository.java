package br.com.gft.nivelamentojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.nivelamentojpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
		
}