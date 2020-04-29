package br.com.gft.nivelamentojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.nivelamentojpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
		
}