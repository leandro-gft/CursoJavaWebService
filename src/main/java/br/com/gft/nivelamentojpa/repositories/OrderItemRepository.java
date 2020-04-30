package br.com.gft.nivelamentojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.nivelamentojpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
		
}