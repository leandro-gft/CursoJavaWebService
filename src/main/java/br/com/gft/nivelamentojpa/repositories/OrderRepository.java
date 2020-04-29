package br.com.gft.nivelamentojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.nivelamentojpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
		
}